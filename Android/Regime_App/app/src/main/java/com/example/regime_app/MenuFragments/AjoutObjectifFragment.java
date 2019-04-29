package com.example.regime_app.MenuFragments;

import android.content.Intent;
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
import android.widget.ListView;
import android.widget.Toast;

import com.example.regime_app.MainActivity;
import com.example.regime_app.MenuManagmentActivity;
import com.example.regime_app.R;

public class AjoutObjectifFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.ajouter_objectif, container, false);
        int idCardSelect = -1;
        GridLayout gridObjectifs = (GridLayout) view.findViewById(R.id.grid_view_ajout_objectif);
        ListView listInfoComplementaire = (ListView) view.findViewById(R.id.list_view_informations_complementaires);
        setSingleEvent(gridObjectifs, listInfoComplementaire, idCardSelect, listInfoComplementaire);

        return view;
    }

    private void setSingleEvent(GridLayout gridLayout, ListView listInfoComplementaire, int idCardSelect, ListView listView){
        for (int i = 0; i<gridLayout.getChildCount(); i++){

            final CardView cardView = (CardView)gridLayout.getChildAt(i);
            final int idGridView = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(view.getContext(),"kkkk"+ idGridView, Toast.LENGTH_SHORT).show();
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1){
                        cardView.setCardBackgroundColor(45);
                    }
                    //Probleme pour onclick complexe
                }
            });
        }
    }


}