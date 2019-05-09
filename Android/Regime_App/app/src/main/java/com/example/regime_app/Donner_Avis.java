package com.example.regime_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.regime_app.Adapters.AvisUtilisateursAdapater;
import com.example.regime_app.Adapters.RechercheRegimeTicketAdapter;
import com.example.regime_app.Models.Avis;
import com.example.regime_app.Models.Regime;

import java.util.List;

public class Donner_Avis extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donner_avis);
        Bundle bun = getIntent().getExtras() ;
        Regime regime =(Regime) bun.get("regimeavis") ;
        recyclerView = findViewById(R.id.avislist);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new AvisUtilisateursAdapater(regime);
        recyclerView.setAdapter(mAdapter);
    }
}
