package com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.regime_app.R;

public class CreerUnPlat extends FragmentNextAndRetour {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.creer_plat, container, false);
        setListeners(view, R.id.creer_ingredient, R.id.creer_plat_retour);
        return view;
    }
}
