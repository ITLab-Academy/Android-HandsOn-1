
public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 2;

    private static final String DATABASE_NAME = "Database";

    private static final String TABLE_NAME = "Comentarios";
    private static final String COL_Comentario = "Comentario";
    private static final String COL_RepositorioId = "RepositorioId";

    private static final String TABLE_CREATE =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    COL_Comentario + " TEXT, " +
                    COL_RepositorioId + " INTEGER);";

    DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);

        // Create tables again
        onCreate(db);
    }

    public void addComment(String comment, int repoId) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(COL_Comentario, comment);
        values.put(COL_RepositorioId, repoId);

        db.insert(TABLE_NAME, null, values);
        db.close();
    }


    public String[] getComments(int repoId) {

        String selectQuery =
                  "SELECT " + COL_Comentario
                + " FROM " + TABLE_NAME
                + " WHERE " + COL_RepositorioId + " = " + repoId;

        Log.d("QUERY", selectQuery);

        SQLiteDatabase db = this.getReadableDatabase();

        ArrayList<String> commentslist = new ArrayList<>();

        Cursor cursor = db.rawQuery(selectQuery, null);

        if (cursor.moveToFirst()) {

            do {
                commentslist.add(cursor.getString(0));
            } while (cursor.moveToNext());

        }

        cursor.close();

        String[] commentsArray = new String[commentslist.size()];

        return commentslist.toArray(commentsArray);
    }
}
