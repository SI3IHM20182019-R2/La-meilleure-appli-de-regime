package com.example.regime_app.Adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.regime_app.Models.Repas;
import com.example.regime_app.R;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public  class PlatsAccueilAdapter extends RecyclerView.Adapter<ListPlatsAdapter> {

    List<Repas> list;

    public PlatsAccueilAdapter(List<Repas> list) {
        this.list = list;


    }


    @Override
    public ListPlatsAdapter onCreateViewHolder(ViewGroup viewGroup, int itemType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.repas,viewGroup,false);

        return new ListPlatsAdapter(view);
    }

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
