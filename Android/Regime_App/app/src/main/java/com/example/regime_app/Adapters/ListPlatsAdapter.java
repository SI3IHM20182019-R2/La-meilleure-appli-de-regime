package com.example.regime_app.Adapters;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.regime_app.Models.Repas;
import com.example.regime_app.R;

public class ListPlatsAdapter extends RecyclerView.ViewHolder{

        private TextView textViewView;
        private ImageView imageView;

        //itemView est la vue correspondante à 1 cellule
        public ListPlatsAdapter(View itemView) {
            super(itemView);

            //c'est ici que l'on fait nos findView

            textViewView = (TextView) itemView.findViewById(R.id.plat1);
            imageView = (ImageView) itemView.findViewById(R.id.plat_image2);
        }

        //puis ajouter une fonction pour remplir la cellule en fonction d'un MyObject
        public void bind(Repas myObject){
            textViewView.setText(myObject.getEntree().getNom());
            imageView.setImageResource(R.drawable.regime1);
           // Picasso.with(imageView.getContext()).load(myObject.getImageUrl()).centerCrop().fit().into(imageView);
        }

}
