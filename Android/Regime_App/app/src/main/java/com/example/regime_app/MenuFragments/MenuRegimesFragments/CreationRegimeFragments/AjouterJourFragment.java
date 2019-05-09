package com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.regime_app.R;


public class AjouterJourFragment extends FragmentNextAndRetour {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.ajouter_jour, container, false);
        setListeners(view, R.id.ajouter_repas, R.id.ajouter_jour_retour);
        return view;
    }
}
