package com.example.regime_app.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.regime_app.Models.Repas;
import com.example.regime_app.R;

import java.util.List;

public  class PlatsAccueilAdapter extends RecyclerView.Adapter<ListPlatsAdapter> {

    List<Repas> list;

    //ajouter un constructeur prenant en entrée une liste
    public PlatsAccueilAdapter(List<Repas> list) {
        this.list = list;
    }

    //cette fonction permet de créer les viewHolder
    //et par la même indiquer la vue à inflater (à partir des layout xml)
    @Override
    public ListPlatsAdapter onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.repas,viewGroup,false);
        return new ListPlatsAdapter(view);
    }

    //c'est ici que nous allons remplir notre cellule avec le texte/image de chaque MyObjects
    @Override
    public void onBindViewHolder(ListPlatsAdapter myViewHolder, int position) {
        Repas myObject = list.get(position);
        myViewHolder.bind(myObject);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

}
