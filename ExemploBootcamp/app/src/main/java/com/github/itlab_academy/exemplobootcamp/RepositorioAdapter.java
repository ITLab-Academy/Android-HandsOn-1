package com.github.itlab_academy.exemplobootcamp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class RepositorioAdapter extends ArrayAdapter<Repositorio> {

    public RepositorioAdapter(Context context, ArrayList<Repositorio> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Repositorio item = getItem(position);


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.item_template, parent, false);
        }

        TextView fullName = (TextView) convertView.findViewById(R.id.fullName);
        TextView description = (TextView) convertView.findViewById(R.id.description);
        TextView language = (TextView) convertView.findViewById(R.id.language);

        fullName.setText(item.full_name);
        description.setText(item.description);
        language.setText(item.language);

        return convertView;

    }
}
