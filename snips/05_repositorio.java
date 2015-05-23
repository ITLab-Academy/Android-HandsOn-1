package com.github.itlab_academy.androidhandson;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Renan on 20-May-15.
 */
public class Repositorio {
    public int id;
    public String full_name;
    public String description;
    public String language;

    public Repositorio(){

    }

    public static Repositorio exemplo1(){
        Repositorio r = new Repositorio();

        r.id = 1;
        r.full_name="Exemplo 1";
        r.description = "Descricao do Exemplo 1";
        r.language = "VBA";

        return r;
    }

    public static Repositorio exemplo2(){
        Repositorio r = new Repositorio();

        r.id = 1;
        r.full_name="Exemplo 2";
        r.description = "Descricao do Exemplo 2";
        r.language = "C#";

        return r;
    }

    public static ArrayList<Repositorio> getDadosFalsos() {
        ArrayList<Repositorio> arr = new ArrayList<>();

        arr.add(exemplo1());
        arr.add(exemplo2());

        return arr;
    }
}
