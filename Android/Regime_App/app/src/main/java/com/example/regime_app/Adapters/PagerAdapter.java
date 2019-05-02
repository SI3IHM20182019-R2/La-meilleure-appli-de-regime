package com.example.regime_app.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.regime_app.MenuFragments.AccueilFragment;
import com.example.regime_app.MenuFragments.EvolutionFragment;
import com.example.regime_app.MenuFragments.ObjectifsFragment;
import com.example.regime_app.MenuFragments.ProfilFragment;
import com.example.regime_app.MenuFragments.MenuRegimesManagmentFragment;


public class PagerAdapter extends FragmentStatePagerAdapter {
    private int nbTab;

    public PagerAdapter(FragmentManager fm, int numTab) {
        super(fm);
        this.nbTab = numTab;
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new AccueilFragment();
        switch (i){
            case 0 : fragment = new AccueilFragment(); break;
            case 1 : fragment = new ProfilFragment(); break;
            case 2 : fragment = new MenuRegimesManagmentFragment(); break;
            case 3 : fragment = new ObjectifsFragment(); break;
            case 4 : fragment = new EvolutionFragment(); break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return nbTab;
    }
}