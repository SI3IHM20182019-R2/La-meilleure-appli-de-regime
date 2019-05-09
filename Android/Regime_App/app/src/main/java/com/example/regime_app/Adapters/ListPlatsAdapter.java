package com.example.regime_app.Adapters;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.regime_app.Models.Repas;
import com.example.regime_app.R;

public class ListPlatsAdapter extends RecyclerView.ViewHolder{

        private TextView plat1;
        private TextView plat2;
        private TextView plat3;
        private ImageView imageView;
        private TextView heure;

        //itemView est la vue correspondante à 1 cellule
        public ListPlatsAdapter(View itemView) {
            super(itemView);

            //c'est ici que l'on fait nos findView

            plat1 = (TextView) itemView.findViewById(R.id.plat1);
            plat2 = (TextView) itemView.findViewById(R.id.plat2);
            plat3 = (TextView) itemView.findViewById(R.id.plat3);
            heure = (TextView) itemView.findViewById(R.id.heure);


            imageView = (ImageView) itemView.findViewById(R.id.plat_image2);
        }

        //puis ajouter une fonction pour remplir la cellule en fonction d'un MyObject
        public void bind(Repas myObject){
            plat1.setText(myObject.getEntree().getNom());
            plat2.setText(myObject.getPlat().getNom());
            plat3.setText(myObject.getDessert().getNom());
            heure.setText(myObject.getHeure());

            imageView.setImageResource(R.drawable.regime1);
           // Picasso.with(imageView.getContext()).load(myObject.getImageUrl()).centerCrop().fit().into(imageView);
        }

}
