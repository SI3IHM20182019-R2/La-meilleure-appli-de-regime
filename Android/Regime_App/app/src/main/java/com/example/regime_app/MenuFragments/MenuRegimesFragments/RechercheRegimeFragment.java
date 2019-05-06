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
import com.example.regime_app.Models.Regime;
import com.example.regime_app.R;

import java.util.ArrayList;
import java.util.List;

public class RechercheRegimeFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.recherche_regime, container, false);

        List<Regime> regimes = new ArrayList<>();

        regimes.add(new Regime("Régime 1", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime1"));
        regimes.add(new Regime("Régime 2", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime8"));
        regimes.add(new Regime("Régime 3", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime3"));
        regimes.add(new Regime("Régime 4", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime4"));
        regimes.add(new Regime("Régime 5", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime5"));
        regimes.add(new Regime("Régime 6", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime6"));

        recyclerView = view.findViewById(R.id.recherche_liste_regimes);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new RechercheRegimeTicketAdapter(regimes);
        recyclerView.setAdapter(mAdapter);

        return view;
    }
}
