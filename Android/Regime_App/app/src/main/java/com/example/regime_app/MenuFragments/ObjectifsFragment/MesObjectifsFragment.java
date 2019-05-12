package com.example.regime_app.MenuFragments.ObjectifsFragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.RelativeLayout;

import com.example.regime_app.R;

import java.util.List;


public class MesObjectifsFragment extends Fragment {

    public AjoutObjectifFragment ajoutObjectifFragment = new AjoutObjectifFragment();
    public ListObjectifsFragment listObjectifsFragment = new ListObjectifsFragment();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.mes_objectifs, container, false);
        getChildFragmentManager().beginTransaction().add(R.id.MesObjectifsLayout, this.listObjectifsFragment).commit();
        RelativeLayout mesObjectifsLayout = (RelativeLayout) view.findViewById(R.id.MesObjectifsLayout);
        //setSingleEvent(mesObjectifsLayout);
        return view;
    }
/*
    private void setSingleEvent(final RelativeLayout gridLayout){
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
             getChildFragmentManager().beginTransaction().add(R.id.InfoComplementaireLayout, getItem(idGridView)).commit();
        }
    });*/
}