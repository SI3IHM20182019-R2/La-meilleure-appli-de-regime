package com.example.regime_app.ViewHolders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.regime_app.Models.Regime;
import com.example.regime_app.R;

public class RechercheRegimeViewHolder extends RecyclerView.ViewHolder {
    private Context context;

    private ImageView image;
    private TextView note;
    private TextView nom;
    private TextView description;

    public RechercheRegimeViewHolder(@NonNull View itemView, Context context) {
        super(itemView);
        image = itemView.findViewById(R.id.regime_image);
        note = itemView.findViewById(R.id.regime_note);
        nom = itemView.findViewById(R.id.regime_nom);
        description = itemView.findViewById(R.id.regime_description);
        this.context = context;
    }

    public void bindData(final Regime regime) {
        image.setImageResource(context.getResources().getIdentifier(regime.getImageName(), "drawable", context.getPackageName()));
        note.setText(regime.getNote());
        description.setText(regime.getDescription());
        nom.setText(regime.getNom());
    }
}
