package com.github.itlab_academy.exemplobootcamp;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ExemploActivity extends ActionBarActivity {

    TextView titulo = null;
    TextView txtComentario = null;
    ListView lst = null;
    int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo);

        Intent i = getIntent();

        id = i.getIntExtra("id", 0);
        String full_name = i.getStringExtra("full_name");

        titulo = (TextView) findViewById(R.id.titulo);
        txtComentario = (TextView) findViewById(R.id.txtComentario);
        lst = (ListView) findViewById(R.id.lst);

        titulo.setText(full_name);

        loadComments();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_exemplo, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void salvarComentario_onClick(View view) {

        DatabaseHelper db = new DatabaseHelper(this);

        db.addComment(txtComentario.getText().toString(), id);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("Sucesso")
                .setTitle("Seu comentário foi salvo!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        loadComments();

                        txtComentario.setText("");
                        dialog.dismiss();
                    }
                })
                .show();
    }

    private void loadComments(){
        DatabaseHelper db = new DatabaseHelper(ExemploActivity.this);

        lst.setAdapter(new CommentsAdapter(ExemploActivity.this, db.getComments(id)));
    }


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

}
