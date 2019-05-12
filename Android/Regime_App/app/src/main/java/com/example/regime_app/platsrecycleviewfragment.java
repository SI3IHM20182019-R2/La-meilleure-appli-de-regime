package com.example.regime_app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.regime_app.Adapters.PlatsAccueilAdapter;
import com.example.regime_app.Models.Plat;
import com.example.regime_app.Models.Repas;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class platsrecycleviewfragment extends Fragment {
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.platsrecycleview, container, false);

        List <Repas> repasdujour = new ArrayList<>();
        repasdujour.add(getRepas("repas1.json", "08h00"));
        repasdujour.add(getRepas("repas2.json", "12h00"));
        repasdujour.add(getRepas("repas3.json","20h00"));



        recyclerView = (RecyclerView) view.findViewById(R.id.new_recycle);
        recyclerView.setHasFixedSize(true);

        //définit l'agencement des cellules, ici de façon verticale, comme une ListView
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

        //pour adapter en grille comme une RecyclerView, avec 2 cellules par ligne
        //recyclerView.setLayoutManager(new GridLayoutManager(this,2));

        //puis créer un MyAdapter, lui fournir notre liste de villes.
        //cet adapter servira à remplir notre recyclerview
        recyclerView.setAdapter(new PlatsAccueilAdapter(repasdujour));
        return view;

    }

    private void addCalendar () {

    }

    private Repas getRepas(String file, String heure) {
        String json = null;
        List<Plat> plats = new ArrayList<>();
        String image = "";

        try {
            InputStream is = getActivity().getAssets().open(file);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            JSONObject obj = new JSONObject(json);
            int i = 0 + (int)(Math.random() * 2);

                image = obj.getJSONArray("listrepas").getJSONObject(i).getString("image");

                JSONArray m_jArry = obj.getJSONArray("listrepas").getJSONObject(i).getJSONArray("repas");
                System.out.println("Added2 --> " + m_jArry);

                for (int j = 0; j < m_jArry.length(); j++) {
                    JSONObject jo_inside = m_jArry.getJSONObject(j);
                    System.out.println("Added3 --> " + jo_inside);

                    Plat plat1 = new Plat(jo_inside.getString("nom"),
                            jo_inside.getJSONObject("ingredients").getInt("glucides"),
                            jo_inside.getJSONObject("ingredients").getInt("proteines"),
                            jo_inside.getJSONObject("ingredients").getInt("lipides"),
                            jo_inside.getJSONObject("ingredients").getInt("calories")
                    );

                    plats.add(plat1);
                    System.out.println("Added --> " + plat1);
                }


        } catch(JSONException e)
        {
            e.printStackTrace();
        }

        Repas  repas = new Repas(plats.get(0), plats.get(1), plats.get(2), image,heure);
        return repas;

    }
}
