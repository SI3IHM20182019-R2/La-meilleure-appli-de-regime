package com.example.regime_app;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcelable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.regime_app.Adapters.DetailsRegimesAdapter;
import com.example.regime_app.Models.JourRepas;
import com.example.regime_app.Models.Regime;
import com.example.regime_app.Models.Repas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DetailsRegimeActivity extends AppCompatActivity {
    private TextView title ;
    private TextView note ;
    private ExpandableListView listView ;
    private DetailsRegimesAdapter listAdpater ;
    private List<String> listDataHeader = new ArrayList<>();
    private HashMap<String , List<Repas>> listHashMap = new HashMap<>();
    private TextView description ;
    private ImageView imageregime ;
    private Button donneravis ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testprofil);
        title = (TextView) findViewById(R.id.title);
        note = (TextView) findViewById(R.id.note);
        description = (TextView) findViewById(R.id.description);
        imageregime = (ImageView)  findViewById(R.id.imageregime);
        donneravis = (Button)  findViewById(R.id.avis);
        Bundle bun = getIntent().getExtras() ;
        final Regime regime =(Regime) bun.get("regime") ;
        //imageregime.setImageResource();
        Bitmap bit = BitmapFactory.decodeResource(getResources() , this.getResources().getIdentifier(regime.getImageName(), "drawable", this.getPackageName())) ;
        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(getResources() , bit) ;
        roundedBitmapDrawable.setCircular(true);
        imageregime.setImageDrawable(roundedBitmapDrawable);
        title.setText(regime.getNom());
        note.setText(regime.getNote());
        description.setText(regime.getDescription());
        /*Spinner spinerrepas = findViewById(R.id.spinnerreaps) ;
        DetailsRegimesAdapter mAdapter = new DetailsRegimesAdapter(this , regime.getListrepas() , regime) ;
        spinerrepas.setAdapter(mAdapter);*/
        listView=(ExpandableListView)findViewById(R.id.expandList) ;
        listDataHeader.add("Jour1");
        listDataHeader.add("Jour2");
        listDataHeader.add("Jour3");
        listHashMap.put("Jour1" , (List<Repas>) regime.getListrepas() );
        listHashMap.put("Jour2" , (List<Repas>) regime.getListrepas() );
        listHashMap.put("Jour3" , (List<Repas>) regime.getListrepas()) ;

        listAdpater = new DetailsRegimesAdapter(regime ,DetailsRegimeActivity.this , listDataHeader , listHashMap);
        donneravis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsRegimeActivity.this , Donner_Avis.class ) ;
                intent.putExtra("regimeavis" , (Serializable) regime.getListavis()) ;
                startActivity(intent) ;
            }
        });

        listView.setAdapter(listAdpater);
        listView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                setListViewHeight(parent, groupPosition);
                return false;
            }
        });


    }
    private void setListViewHeight(ExpandableListView listView, int group) {
        ExpandableListAdapter listAdapter = (ExpandableListAdapter) listView.getExpandableListAdapter();
        int totalHeight = 0;
        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(),
                View.MeasureSpec.EXACTLY);
        for (int i = 0; i < listAdapter.getGroupCount(); i++) {
            View groupItem = listAdapter.getGroupView(i, false, null, listView);
            groupItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);

            totalHeight += groupItem.getMeasuredHeight();

            if (((listView.isGroupExpanded(i)) && (i != group))
                    || ((!listView.isGroupExpanded(i)) && (i == group))) {
                for (int j = 0; j < listAdapter.getChildrenCount(i); j++) {
                    View listItem = listAdapter.getChildView(i, j, false, null,
                            listView);
                    listItem.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);

                    totalHeight += listItem.getMeasuredHeight();

                }
                //Add Divider Height
                totalHeight += listView.getDividerHeight() * (listAdapter.getChildrenCount(i) - 1);
            }
        }
        //Add Divider Height
        totalHeight += listView.getDividerHeight() * (listAdapter.getGroupCount() - 1);

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        int height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getGroupCount() - 1));
        if (height < 10)
            height = 200;
        params.height = height;
        listView.setLayoutParams(params);
        listView.requestLayout();
    }

}
