package com.example.regime_app.MenuFragments.ObjectifsFragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridLayout;

import com.example.regime_app.MenuFragments.ObjectifsFragment.InfoObjectifFragments.AmeliorationSilhouetteFragment;
import com.example.regime_app.MenuFragments.ObjectifsFragment.InfoObjectifFragments.MangerSainFragment;
import com.example.regime_app.MenuFragments.ObjectifsFragment.InfoObjectifFragments.PerteDeGraisseFragment;
import com.example.regime_app.MenuFragments.ObjectifsFragment.InfoObjectifFragments.PerteDePoidsFragment;
import com.example.regime_app.MenuFragments.ObjectifsFragment.InfoObjectifFragments.PriseMuscleFragment;
import com.example.regime_app.MenuFragments.ObjectifsFragment.InfoObjectifFragments.ReduireGlucidesFragment;
import com.example.regime_app.R;

import java.util.List;

public class AjoutObjectifFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.ajouter_objectif, container, false);
        GridLayout gridObjectifs = (GridLayout) view.findViewById(R.id.grid_view_ajout_objectif);
        setSingleEvent(gridObjectifs);

        Button buttomAjouter = view.findViewById(R.id.boutonAjouterAMesObejctifs);
        buttomAjouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getChildFragmentManager().beginTransaction().add(R.id.AjouterUnObjectifLayout, new ListObjectifsFragment()).commit();
            }
        });

        return view;
    }

    private void setSingleEvent(final GridLayout gridLayout){
        for (int i = 0; i<gridLayout.getChildCount(); i++){

            final CardView cardView = (CardView)gridLayout.getChildAt(i);
            final int idGridView = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    List<Fragment> fragmentsInPlace = getChildFragmentManager().getFragments();
                    if (fragmentsInPlace == null) {
                        return;
                    }

                    for (Fragment fragment : fragmentsInPlace)
                    {
                        getChildFragmentManager().beginTransaction().remove(fragment).commit();
                    }

                    for (int i = 0; i<gridLayout.getChildCount(); i++) {
                        CardView cardView = (CardView) gridLayout.getChildAt(i);
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    }
                    cardView.setCardBackgroundColor(Color.parseColor("#4CAF50"));
                    getChildFragmentManager().beginTransaction().add(R.id.InfoComplementaireLayout, getItem(idGridView)).commit();
                }
            });
        }
    }

    private Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i){
            case 0 : fragment = new PerteDePoidsFragment(); break;
            case 1 : fragment = new PriseMuscleFragment(); break;
            case 2 : fragment = new ReduireGlucidesFragment(); break;
            case 3 : fragment = new PerteDeGraisseFragment(); break;
            case 4 : fragment = new MangerSainFragment(); break;
            case 5 : fragment = new AmeliorationSilhouetteFragment(); break;
        }
        return fragment;
    }

}




