package com.example.regime_app.ViewHolders;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.regime_app.Adapters.DetailsRegimesAdapter;
import com.example.regime_app.Adapters.MesRegimesAdapter;
import com.example.regime_app.DetailsRegimeActivity;
import com.example.regime_app.Models.Regime;
import com.example.regime_app.R;

import java.util.HashMap;
import java.util.List;

public class DetailsRegimesHolder extends RecyclerView.ViewHolder {
    private Context context;
    private TextView entree ;
    private TextView plat ;
    private TextView dessert ;
    private TextView Heure ;
    private TextView note ;
    private ImageView repasimage ;


    public DetailsRegimesHolder(@NonNull View itemView, Context context) {
        super(itemView);
        entree = (TextView)itemView.findViewById(R.id.entree);
        plat = (TextView)itemView.findViewById(R.id.plat);
        dessert = (TextView)itemView.findViewById(R.id.dessert);
        Heure = (TextView)itemView.findViewById(R.id.Heure);
        note = (TextView)itemView.findViewById(R.id.note);
        repasimage = (ImageView)itemView.findViewById(R.id.repasimage);

        this.context = context;
    }

   /* public void bindData(final Regime regime ) {
        repasmidi.setText(regime.getNom());
        repasmatin.setText(regime.getDescription());
        repassoir.setText(regime.getDescription());

    }*/
}
