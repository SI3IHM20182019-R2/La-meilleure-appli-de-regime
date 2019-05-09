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
    ;
    private TextView repasmatin ;
    private TextView repasmidi ;
    private TextView repassoir ;


    public DetailsRegimesHolder(@NonNull View itemView, Context context) {
        super(itemView);
        repasmatin = (TextView)itemView.findViewById(R.id.repasmatin);
        repasmidi = (TextView)itemView.findViewById(R.id.repasmidi);
        repassoir = (TextView)itemView.findViewById(R.id.repassoir);
        this.context = context;
    }

    public void bindData(final Regime regime ) {
        repasmidi.setText(regime.getNom());
        repasmatin.setText(regime.getDescription());
        repassoir.setText(regime.getDescription());

    }
}
