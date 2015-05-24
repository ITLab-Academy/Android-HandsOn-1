package com.github.itlab_academy.exemplobootcamp;

import org.json.JSONException;
import org.json.JSONObject;

public class Repositorio {

    public int id;
    public String full_name;
    public String description;
    public String language;

    public Repositorio(JSONObject json) throws JSONException {

        id = json.getInt("id");
        full_name = json.getString("full_name");
        description = json.getString("description");
        language = json.getString("language");
    }
}
