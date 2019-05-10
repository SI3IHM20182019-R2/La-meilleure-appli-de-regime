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

import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.CREER_PLAT;

public class CreerIngredientFragment extends FragmentSwitchable {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.creer_ingredient, container, false);

        ImageButton retour = view.findViewById(R.id.creer_ingredient_retour);
        Button confirmer = view.findViewById(R.id.ingredient_confirmer);
        Switch s1 = new Switch(retour, CREER_PLAT);
        Switch s2 = new Switch(confirmer, CREER_PLAT);
        setSwitches(s1, s2);

        return view;
    }
}
