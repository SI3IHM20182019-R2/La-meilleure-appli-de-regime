package com.example.regime_app;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.regime_app.Adapters.AvisUtilisateursAdapater;
import com.example.regime_app.Adapters.RechercheRegimeTicketAdapter;
import com.example.regime_app.Models.Avis;
import com.example.regime_app.Models.Regime;

import java.util.ArrayList;
import java.util.List;

public class Donner_Avis extends AppCompatActivity {
    private static final String COMMENTAIRE ="commetry" ;
    private static final String Note1 = "Noote" ;
    private RecyclerView recyclerView;
    private EditText commentaire;
    private EditText note ;
    private Button ajouter ;
    private String Date ;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.donner_avis);
        Bundle bun = getIntent().getExtras() ;
        ArrayList<Avis> regimeavis = (ArrayList<Avis>) bun.get("regimeavis");
        recyclerView = findViewById(R.id.avislist);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new AvisUtilisateursAdapater(regimeavis);
        recyclerView.setAdapter(mAdapter);
        commentaire = findViewById(R.id.commentaire);
        note = findViewById(R.id.note);
        ajouter = findViewById(R.id.subbmit) ;
        ajouter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {String com = commentaire.getText().toString() ;
                int not = Integer.parseInt(note.getText().toString()) ;
                Date = android.text.format.DateFormat.format("yyyy-MM-dd ", new java.util.Date()).toString();
                regimeavis.add(new Avis("Marie" , not , com , Date)) ;
                mAdapter.notifyDataSetChanged(); } catch (Exception e ) {
                    Toast.makeText(Donner_Avis.this , "SVP Entrez les bonnes valeurs", Toast.LENGTH_LONG ).show();
                }

            }
        });

    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        // TODO Auto-generated method stub
        super.onSaveInstanceState(outState);
        outState.putString(COMMENTAIRE, commentaire.getText().toString());
        outState.putString(Note1, note.getText().toString());

    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onRestoreInstanceState(savedInstanceState);
        // repopulate values from the bundle we created in onSaveInstanceState method.
        commentaire.setText(savedInstanceState.getString(COMMENTAIRE));
        note.setText(savedInstanceState.getString(Note1));
    }
}
