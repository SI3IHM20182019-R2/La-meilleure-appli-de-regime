package com.example.regime_app.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.regime_app.Models.Ingredient;
import com.example.regime_app.Models.Regime;
import com.example.regime_app.R;
import com.example.regime_app.ViewHolders.IngredientViewHolder;
import com.example.regime_app.ViewHolders.RechercheRegimeViewHolder;

import java.util.List;

public class IngredientTicketAdapter extends RecyclerView.Adapter {
    private List<Ingredient> ingredients;

    public IngredientTicketAdapter(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ingredient_ticket, parent, false);
        return new IngredientViewHolder(view, parent.getContext().getApplicationContext());
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        ((IngredientViewHolder) viewHolder).bindData(ingredients.get(position));
    }

    @Override
    public int getItemCount() {
        return ingredients.size();
    }
}