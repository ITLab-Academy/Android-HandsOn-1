Repositorio r = (Repositorio)lst.getAdapter().getItem(position);

Intent i = new Intent(MainActivity.this, DetailsActivity.class);
i.putExtra("id", r.id);
i.putExtra("full_name", r.full_name);

MainActivity.this.startActivity(i);
