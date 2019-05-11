package com.example.regime_app.ViewHolders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.regime_app.Models.Ingredient;
import com.example.regime_app.R;

public class IngredientViewHolder extends RecyclerView.ViewHolder {
    private ImageView image;
    private TextView nom;
    private TextView description;
    private Button quantite;

    public IngredientViewHolder(@NonNull View itemView, Context context) {
        super(itemView);
        quantite = itemView.findViewById(R.id.ingredient_ticket_quantite);
        image = itemView.findViewById(R.id.ingredient_image);
        nom = itemView.findViewById(R.id.ingredient_nom);
        description = itemView.findViewById(R.id.ingredient_description);
    }

    public void bindData(final Ingredient ingredient) {
        image.setImageBitmap(ingredient.getImage());
        nom.setText(ingredient.getNom());
        description.setText(ingredient.getDescription());
    }
}
