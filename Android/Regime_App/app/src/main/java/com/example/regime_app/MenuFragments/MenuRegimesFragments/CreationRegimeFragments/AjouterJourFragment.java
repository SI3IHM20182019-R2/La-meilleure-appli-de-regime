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

import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.AJOUTER_JOUR;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.AJOUTER_REPAS;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.CREATION_REGIME;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.CREER_PLAT;


public class AjouterJourFragment extends FragmentSwitchable {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.ajouter_jour, container, false);

        ImageButton retour = view.findViewById(R.id.ajouter_jour_retour);
        Button ajouterRepas = view.findViewById(R.id.ajouter_repas);
        Switch s1 = new Switch(ajouterRepas, AJOUTER_REPAS);
        Switch s2 = new Switch(retour, CREATION_REGIME);
        setSwitches(s1,s2);

        return view;
    }
}
