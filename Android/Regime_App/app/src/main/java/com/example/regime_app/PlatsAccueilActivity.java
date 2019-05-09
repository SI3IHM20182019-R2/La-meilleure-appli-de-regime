package com.example.regime_app;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class PlatsAccueilActivity extends AppCompatActivity {

    private PlatsAccueilAdapter adapter;

    String pageData[];          //Stores the text to swipe.
    LayoutInflater inflater;    //Used to create individual pages
    NonSwipeableViewPager vp;

    //Reference to class to swipe views
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragmentplatsdujour);
        //Get the data to be swiped through
        pageData=getResources().getStringArray(R.array.desserts);
        //get an inflater to be used to create single pages
        inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //Reference ViewPager defined in activity
        vp=findViewById(R.id.viewPager);
        //set the adapter that will create the individual pages
        vp.setAdapter(new PlatsAccueilAdapter());
    }
}
