package com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.regime_app.Adapters.IngredientTicketAdapter;
import com.example.regime_app.Adapters.RechercheRegimeTicketAdapter;
import com.example.regime_app.FragmentSwitchable;
import com.example.regime_app.Models.Mocks;
import com.example.regime_app.R;
import com.example.regime_app.Switch;

import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.AJOUTER_REPAS;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.CREER_INGREDIENT;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.CREER_PLAT2;

public class CreerPlat1Fragment extends FragmentSwitchable {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.creer_plat, container, false);

        Button creerIngredient = view.findViewById(R.id.creer_ingredient);
        ImageButton retour = view.findViewById(R.id.creer_plat_retour);
        ImageView etapeSuivante = view.findViewById(R.id.creer_plat_etape_suivante);
        Switch s1 = new Switch(creerIngredient, CREER_INGREDIENT, true);
        Switch s2 = new Switch(retour, AJOUTER_REPAS, true);
        Switch s3 = new Switch(etapeSuivante, CREER_PLAT2, true);
        setSwitches(s1, s2, s3);

        recyclerView = view.findViewById(R.id.liste_ingredients);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);
        if (Mocks.ingredients.size() > 0) {
            System.out.println(Mocks.ingredients.get(0));
        }
        mAdapter = new IngredientTicketAdapter(Mocks.ingredients);
        recyclerView.setAdapter(mAdapter);

        return view;
    }
}
