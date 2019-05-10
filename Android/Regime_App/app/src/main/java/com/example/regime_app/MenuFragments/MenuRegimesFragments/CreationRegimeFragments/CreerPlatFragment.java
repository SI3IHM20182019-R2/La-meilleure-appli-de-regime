package com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.regime_app.FragmentSwitchable;
import com.example.regime_app.R;
import com.example.regime_app.Switch;

import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.AJOUTER_REPAS;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.CREER_INGREDIENT;

public class CreerPlatFragment extends FragmentSwitchable {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.creer_plat, container, false);

        Button creerIngredient = view.findViewById(R.id.creer_ingredient);
        ImageButton retour = view.findViewById(R.id.creer_plat_retour);
        Switch s1 = new Switch(creerIngredient, CREER_INGREDIENT);
        Switch s2 = new Switch(retour, AJOUTER_REPAS);
        setSwitches(s1, s2);

        return view;
    }
}
