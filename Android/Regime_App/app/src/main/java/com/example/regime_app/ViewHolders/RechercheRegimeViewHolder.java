package com.example.regime_app.ViewHolders;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.regime_app.Adapters.MesRegimesAdapter;
import com.example.regime_app.Adapters.RechercheRegimeTicketAdapter;
import com.example.regime_app.DetailsRegimeActivity;
import com.example.regime_app.Donner_Avis;
import com.example.regime_app.Models.Regime;
import com.example.regime_app.R;

import java.util.List;

public class RechercheRegimeViewHolder extends RecyclerView.ViewHolder {
    private Context context;

    private ImageView image;
    private TextView note;
    private TextView nom;
    private TextView description;
    private TextView voirdetails ;
    private TextView add ;

    public RechercheRegimeViewHolder(@NonNull View itemView, Context context) {
        super(itemView);
        image = itemView.findViewById(R.id.regime_image);
        note = itemView.findViewById(R.id.regime_note);
        nom = itemView.findViewById(R.id.regime_nom);
        add = (TextView) itemView.findViewById(R.id.add);
        description = itemView.findViewById(R.id.regime_description);
        voirdetails =(TextView)itemView.findViewById(R.id.Viewdetails2);
        this.context = context;
    }

    public void bindData(final Regime regime ,final List<Regime> regimes , final RechercheRegimeTicketAdapter ad) {
        image.setImageResource(context.getResources().getIdentifier(regime.getImageName(), "drawable", context.getPackageName()));
        note.setText(regime.getNote());
        description.setText(regime.getDescription());
        nom.setText(regime.getNom());
        voirdetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context , DetailsRegimeActivity.class ) ;
                intent.putExtra("regime" , regime) ;
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK );
                context.startActivity(intent) ;
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                regimes.clear();
                regimes.add(regime);
                ad.setnotification();
                Toast.makeText(context , "Ce régime est maintenant votre régime actuel", Toast.LENGTH_LONG ).show();
            }
        });
    }
}
