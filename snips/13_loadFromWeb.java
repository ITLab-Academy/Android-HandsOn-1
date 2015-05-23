void loadFromWeb(){
    String url = "https://api.github.com/users/eklam/repos";
    if (mRequestQueue == null)
        mRequestQueue = Volley.newRequestQueue(MainActivity.this);

    JsonArrayRequest jsObjRequest = new JsonArrayRequest(Request.Method.GET, url,
            new Response.Listener<JSONArray>() {

                @Override
                public void onResponse(JSONArray response) {
                    final ArrayList<Repositorio> arr = new ArrayList<Repositorio>();
                    for (int i = 0; i < response.length(); i++) {
                        try {
                            Repositorio r = new Repositorio(response.getJSONObject(i));
                            arr.add(r);
                        } catch (JSONException ex) {
                        }
                    }
                    lst.setAdapter(new RepositorioAdapter(MainActivity.this, arr));
                }
            },
            new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    error.printStackTrace();
                }
            });

    mRequestQueue.add(jsObjRequest);
}
