package com.example.regime_app.MenuFragments.ObjectifsFragment.InfoObjectifFragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.regime_app.R;

public class PerteDeGraisseFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.perte_gaisse, container, false);
        return view;
    }
}