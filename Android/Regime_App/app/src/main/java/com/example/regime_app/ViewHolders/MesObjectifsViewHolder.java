package com.example.regime_app.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.regime_app.Interface.ObjectifsClickListener;
import com.example.regime_app.R;

public class MesObjectifsViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ImageView image;
    public TextView name;

    ObjectifsClickListener objectifsClickListener;

    public MesObjectifsViewHolder(View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image_view);
        name = itemView.findViewById(R.id.name);
        itemView.setOnClickListener(this);
    }

    public  void setObjectifClickLiscter(ObjectifsClickListener objectifClickLiscter){
        this.objectifsClickListener = objectifClickLiscter;
    }

    @Override
    public void onClick(View view) {
        this.objectifsClickListener.onClick(view, getAdapterPosition());
    }
}

