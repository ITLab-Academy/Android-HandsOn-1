ListView lst = null;

.
.
.

lst = (ListView) findViewById(R.id.lst);
lst.setAdapter(new RepositorioAdapter(MainActivity.this, Repositorio.getDadosFalsos()));
lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Toast.makeText(MainActivity.this, "Clicado: " + position, Toast.LENGTH_SHORT).show();
    }
});
