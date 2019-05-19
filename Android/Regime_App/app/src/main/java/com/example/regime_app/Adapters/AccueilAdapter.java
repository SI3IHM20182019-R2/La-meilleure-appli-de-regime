package com.example.regime_app.Adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.example.regime_app.PlatsAccueilFragment;
import com.example.regime_app.platsrecycleviewfragment;

import java.util.Calendar;
import java.util.Date;


import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.NB_PAGES;

public class AccueilAdapter extends FragmentPagerAdapter {
    PlatsAccueilFragment platsAccueilFragment;

    public AccueilAdapter (FragmentManager fm, PlatsAccueilFragment platsAccueilFragment) {
            super(fm);

    }

    @Override
    public Fragment getItem(int i) {
        platsrecycleviewfragment fragment = new platsrecycleviewfragment();

        return fragment;
    }

    @Override
    public int getCount() {
        return NB_PAGES;
    }
}
