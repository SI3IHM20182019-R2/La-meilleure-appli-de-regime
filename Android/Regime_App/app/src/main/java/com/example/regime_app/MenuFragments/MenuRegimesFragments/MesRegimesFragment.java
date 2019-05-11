/*package com.example.regime_app.MenuFragments.MenuRegimesFragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.regime_app.Adapters.MesRegimesAdapter;
import com.example.regime_app.Adapters.RechercheRegimeTicketAdapter;
import com.example.regime_app.Models.Regime;
import com.example.regime_app.R;

import java.util.ArrayList;
import java.util.List;

public class MesRegimesFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.mes_regimes, container, false);

        ArrayList<Regime> regimes = new ArrayList<>();

        regimes.add(new Regime("Régime 1", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime1"));
        regimes.add(new Regime("Régime 2", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime2"));
        regimes.add(new Regime("Régime 3", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime3"));
        regimes.add(new Regime("Régime 4", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime4"));
        regimes.add(new Regime("Régime 5", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime5"));
        regimes.add(new Regime("Régime 6", "C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial ! C'est un régime génial !", "regime6"));

        ListView lst = (ListView)view.findViewById(R.id.RegFavoris) ;
         MesRegimesAdapter adapter = new MesRegimesAdapter(inflater , regimes);
         lst.setAdapter(adapter);
        return view;
    }
}*/
package com.example.regime_app.MenuFragments.MenuRegimesFragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.regime_app.Adapters.MesRegimesAdapter;
import com.example.regime_app.Adapters.RechercheRegimeTicketAdapter;
import com.example.regime_app.Models.Avis;
import com.example.regime_app.Models.Regime;
import com.example.regime_app.Models.RegimesMocks;
import com.example.regime_app.R;

import java.util.ArrayList;
import java.util.List;

public class MesRegimesFragment extends Fragment {
    private RecyclerView recyclerView1;
    private RecyclerView recyclerView2;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.Adapter mAdapter2;
    private RecyclerView.LayoutManager layoutManager;
    private RecyclerView.LayoutManager layoutManager1;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.mes_regimes, container, false);

        recyclerView1 = view.findViewById(R.id.RegFavoris);
        recyclerView2 = view.findViewById(R.id.RegActuel);
        recyclerView1.setHasFixedSize(true);
        recyclerView2.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(view.getContext()) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        layoutManager1 = new LinearLayoutManager(view.getContext()) {
            @Override
            public boolean canScrollVertically() {
                return false;
            }
        };
        recyclerView1.setLayoutManager(layoutManager);
        recyclerView2.setLayoutManager(layoutManager1);
        mAdapter = new MesRegimesAdapter(RegimesMocks.regimes);
        mAdapter2 = new MesRegimesAdapter(RegimesMocks.regimes2);
        recyclerView1.setAdapter(mAdapter);
        recyclerView2.setAdapter(mAdapter2);

        return view;
    }
}



