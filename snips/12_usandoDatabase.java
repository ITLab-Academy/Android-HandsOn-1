DatabaseHelper db = new DatabaseHelper(this);
db.addComment(txtComentario.getText().toString(), id);

.
.
.

class CommentsAdapter extends ArrayAdapter<String> {
    public CommentsAdapter(Context context, String[] items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        String comment = getItem(position);

        TextView tv = new TextView(this.getContext());

        tv.setText(comment);

        return tv;
    }
}

.
.
.

void loadList(){
    DatabaseHelper db = new DatabaseHelper(this);

    CommentsAdapter todoAdapter = new CommentsAdapter(this, db.getComments(id));
    lst.setAdapter(todoAdapter);
}
