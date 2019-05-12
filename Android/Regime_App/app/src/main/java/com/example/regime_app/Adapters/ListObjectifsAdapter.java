package com.example.regime_app.Adapters;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.regime_app.Commom.Commom;
import com.example.regime_app.Interface.ObjectifInterface;
import com.example.regime_app.Interface.ObjectifsClickListener;
import com.example.regime_app.Models.ObjectifsModel.Objectif;
import com.example.regime_app.R;
import com.example.regime_app.ViewHolders.MesObjectifsViewHolder;

import java.util.ArrayList;

public class ListObjectifsAdapter extends RecyclerView.Adapter<MesObjectifsViewHolder> {

    ArrayList<ObjectifInterface> objectifs;
    private Context mContext;

    int row_index = -1;

    public ListObjectifsAdapter(Context context, ArrayList<ObjectifInterface> objectifs) {
        this.objectifs = objectifs;
        mContext = context;
    }

    @Override
    public MesObjectifsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_ajout_objectif, parent, false);
        return new MesObjectifsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MesObjectifsViewHolder holder, final int position) {

        holder.image.setImageResource(this.objectifs.get(position).getImage());
        holder.name.setText(this.objectifs.get(position).toString());

        holder.setObjectifClickLiscter(new ObjectifsClickListener() {
            @Override
            public void onClick(View view, int position) {
                row_index = position;
                Commom.objectifSelected = objectifs.get(position);
                notifyDataSetChanged();
            }
        });
        if (row_index==position){
            holder.itemView.setBackgroundColor(Color.parseColor("#000000"));
            holder.name.setTextColor(Color.parseColor("#FFFFFF"));

        }
        else {
            holder.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
            holder.name.setTextColor(Color.parseColor("#000000"));
        }
    }

    @Override
    public int getItemCount() {
        return this.objectifs.size();
    }


}