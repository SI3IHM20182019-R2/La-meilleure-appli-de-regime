package com.example.regime_app;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.regime_app.Adapters.PagerAdapter;

public class MenuManagmentActivity extends AppCompatActivity {

    private PagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_managment);

        final ViewPager viewPager = findViewById(R.id.myContainer);
        TabLayout tabLayout = findViewById(R.id.menu);

        tabLayout.addTab(tabLayout.newTab().setText("Accueil").setIcon(R.drawable.accueil));
        tabLayout.addTab(tabLayout.newTab().setText("Profil").setIcon(R.drawable.profile));
        tabLayout.addTab(tabLayout.newTab().setText("Régimes").setIcon(R.drawable.regimes));
        tabLayout.addTab(tabLayout.newTab().setText("Objectifs").setIcon(R.drawable.objectifs));
        tabLayout.addTab(tabLayout.newTab().setText("Evolution").setIcon(R.drawable.evolution));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.exit));

        adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == 5) {
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                } else {
                    viewPager.setCurrentItem(tab.getPosition());
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) { }

            @Override
            public void onTabReselected(TabLayout.Tab tab) { }
        });
    }

}