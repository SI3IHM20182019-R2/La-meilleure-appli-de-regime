package com.example.regime_app.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments.AjouterJourFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments.AjouterRepasFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments.CreerUnPlat;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.MesRegimesFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.RechercheRegimeFragment;
import com.example.regime_app.MenuFragments.MenuRegimesManagmentFragment;
import com.example.regime_app.NonSwipeableViewPager;


public class RegimesPagerAdapter extends FragmentPagerAdapter {
    private int nbPages;
    MenuRegimesManagmentFragment menuRegimesManagmentFragment;

    public RegimesPagerAdapter(FragmentManager fm, int nbPages, MenuRegimesManagmentFragment menuRegimesManagmentFragment) {
        super(fm);
        this.nbPages = nbPages;
        this.menuRegimesManagmentFragment = menuRegimesManagmentFragment;
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = new MesRegimesFragment();
        switch (i) {
            case 0 : fragment = new MesRegimesFragment(); break;
            case 1 : fragment = new RechercheRegimeFragment(); break;
            case 2 :
                fragment = new CreationRegimeFragment();
                ((CreationRegimeFragment) fragment).setOnNextClickedListener(menuRegimesManagmentFragment);
                break;
            case 3 :
                fragment = new AjouterJourFragment();
                ((AjouterJourFragment) fragment).setOnNextClickedListener(menuRegimesManagmentFragment);
                ((AjouterJourFragment) fragment).setOnRetourClickedCallback(menuRegimesManagmentFragment);
                break;
            case 4 :
                fragment = new AjouterRepasFragment();
                ((AjouterRepasFragment) fragment).setOnNextClickedListener(menuRegimesManagmentFragment);
                ((AjouterRepasFragment) fragment).setOnRetourClickedCallback(menuRegimesManagmentFragment);
                break;
            case 5 :
                fragment = new CreerUnPlat();
                ((CreerUnPlat) fragment).setOnNextClickedListener(menuRegimesManagmentFragment);
                ((CreerUnPlat) fragment).setOnRetourClickedCallback(menuRegimesManagmentFragment);
                break;
        }
        System.out.println("Page " + i);
        System.out.println("Fragment " + fragment);
        return fragment;
    }

    @Override
    public int getCount() {
        return nbPages;
    }
}