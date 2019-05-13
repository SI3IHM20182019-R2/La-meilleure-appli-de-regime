package com.example.regime_app.MenuFragments.MenuRegimesFragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.regime_app.Adapters.RechercheRegimeTicketAdapter;
import com.example.regime_app.Models.Mocks;
import com.example.regime_app.R;

public class RechercheRegimeFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.recherche_regime, container, false);

        recyclerView = view.findViewById(R.id.recherche_liste_regimes);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new RechercheRegimeTicketAdapter(Mocks.regimes , Mocks.regimeActuel);
        recyclerView.setAdapter(mAdapter);

        return view;
    }
}
