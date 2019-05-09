package com.example.regime_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.regime_app.Adapters.DetailsRegimesAdapter;
import com.example.regime_app.Models.JourRepas;
import com.example.regime_app.Models.Regime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DetailsRegimeActivity extends AppCompatActivity {
    private TextView title ;
    private ExpandableListView listView ;
    private DetailsRegimesAdapter listAdpater ;
    private List<String> listDataHeader = new ArrayList<>();
    private HashMap<String , List<JourRepas>> listHashMap = new HashMap<>();
    private TextView description ;
    private ImageView imageregime ;
    private Button donneravis ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_regimes);
        title = (TextView) findViewById(R.id.title);
        description = (TextView) findViewById(R.id.description);
        imageregime = (ImageView)  findViewById(R.id.imageregime);
        donneravis = (Button)  findViewById(R.id.avis);
        Bundle bun = getIntent().getExtras() ;
        final Regime regime =(Regime) bun.get("regime") ;
        imageregime.setImageResource(this.getResources().getIdentifier(regime.getImageName(), "drawable", this.getPackageName()));
        title.setText(regime.getNom());
        description.setText(regime.getDescription());
        /*Spinner spinerrepas = findViewById(R.id.spinnerreaps) ;
        DetailsRegimesAdapter mAdapter = new DetailsRegimesAdapter(this , regime.getListrepas() , regime) ;
        spinerrepas.setAdapter(mAdapter);*/
        listView=(ExpandableListView)findViewById(R.id.expandList) ;
        listDataHeader.add("Jour1");
        listDataHeader.add("Jour2");
        listDataHeader.add("Jour3");
        listHashMap.put("Jour1" , (List<JourRepas>) regime.getListrepas() );
        listHashMap.put("Jour2" , (List<JourRepas>) regime.getListrepas() );
        listHashMap.put("Jour3" , (List<JourRepas>) regime.getListrepas()) ;

        listAdpater = new DetailsRegimesAdapter(regime ,DetailsRegimeActivity.this , listDataHeader , listHashMap);
        listView.setAdapter(listAdpater);
        donneravis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsRegimeActivity.this , Donner_Avis.class ) ;
                intent.putExtra("regimeavis" , regime) ;
                startActivity(intent) ;
            }
        });


    }
}
