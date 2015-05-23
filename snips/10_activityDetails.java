ListView lst = null;
TextView titulo = null;
TextView txtComentario = null;
int id = 0;

.
.
.

Intent intent = getIntent();
id = intent.getIntExtra("id", 0);
String fullName = intent.getStringExtra("full_name");

titulo = (TextView)findViewById(R.id.titulo);
txtComentario = (TextView)findViewById(R.id.txtComentario);
lst = (ListView)findViewById(R.id.lst);

titulo.setText(fullName);

.
.
.

public void salvarComentario_onClick(final View view){

    AlertDialog.Builder builder = new AlertDialog.Builder(this);

    builder.setMessage("Sucesso")
            .setTitle("Seu comentário foi salvo!")
            .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    txtComentario.setText("");
                    dialog.dismiss();
                }
            })
            .show();
}
