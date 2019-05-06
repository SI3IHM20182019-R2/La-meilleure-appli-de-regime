package com.example.regime_app.MenuFragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.regime_app.Adapters.RegimesPagerAdapter;
import com.example.regime_app.NonSwipeableViewPager;
import com.example.regime_app.R;

public class MenuRegimesManagmentFragment extends Fragment {
    private RegimesPagerAdapter adapter;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.menu_regimes_management, container, false);

        final NonSwipeableViewPager viewPager = view.findViewById(R.id.myRegimesContainer);
        TabLayout tabLayout = view.findViewById(R.id.regimesMenu);

        tabLayout.addTab(tabLayout.newTab().setText("Mes régimes"));
        tabLayout.addTab(tabLayout.newTab().setText("Recherche régime"));
        tabLayout.addTab(tabLayout.newTab().setText("Création régime"));

        adapter = new RegimesPagerAdapter(getFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) { }

            @Override
            public void onTabReselected(TabLayout.Tab tab) { }
        });
        return view;
    }
}
