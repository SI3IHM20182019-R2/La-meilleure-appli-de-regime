package com.example.regime_app.ViewHolders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.regime_app.Models.Avis;
import com.example.regime_app.Models.Regime;
import com.example.regime_app.R;

public class AvisUtilisateursHolder  extends RecyclerView.ViewHolder {
    private Context context;
    private TextView nom;
    private TextView note;
    private TextView commentaire;
    private TextView DatedePublication;

    public AvisUtilisateursHolder(@NonNull View itemView, Context context) {
        super(itemView);
        DatedePublication = itemView.findViewById(R.id.DatedePublication);
        nom = itemView.findViewById(R.id.nom);
        note = itemView.findViewById(R.id.noote);
        commentaire = itemView.findViewById(R.id.commentaire);
        this.context = context;
    }

    public void bindData(final Avis avis) {
        nom.setText(avis.getNom());
        commentaire.setText(avis.getCommentaire());
        DatedePublication.setText(avis.getDate());
        note.setText(Integer.toString(avis.getNote()));
    }
}
