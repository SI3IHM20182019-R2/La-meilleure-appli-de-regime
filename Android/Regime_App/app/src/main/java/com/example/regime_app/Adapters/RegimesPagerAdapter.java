package com.example.regime_app.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.MesRegimesFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.RechercheRegimeFragment;


public class RegimesPagerAdapter extends FragmentPagerAdapter {
    private int nbTab;

    public RegimesPagerAdapter(FragmentManager fm, int numTab) {
        super(fm);
        this.nbTab = numTab;
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new MesRegimesFragment();
        switch (i){
            case 0 : fragment = new MesRegimesFragment(); break;
            case 1 : fragment = new RechercheRegimeFragment(); break;
            case 2 : fragment = new CreationRegimeFragment(); break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return nbTab;
    }
}