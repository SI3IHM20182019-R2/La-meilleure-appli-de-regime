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
        return view;
    }

}