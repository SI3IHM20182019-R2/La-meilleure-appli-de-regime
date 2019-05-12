package com.example.regime_app;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.regime_app.Models.Utilisateur;


public class PlatsAccueilFragment extends Fragment {


    private ViewPager pagerhere;

    private static int value = 0;

    private TextView nom, poids, objectifActuel, objectif;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter pagerAdapter;
    private RecyclerView recyclerView;

    @Override

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.accueil, container, false);

        Utilisateur utilisateur = Utilisateur.getInstance();

        this.nom = view.findViewById(R.id.nomValue);
        this.nom.setText(utilisateur.getPrenom()+" "+utilisateur.getNom());

        return view;

}

}


