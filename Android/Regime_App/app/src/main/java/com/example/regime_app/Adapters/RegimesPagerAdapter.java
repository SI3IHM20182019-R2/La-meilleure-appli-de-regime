package com.example.regime_app.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments.AjouterJourFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments.AjouterRepasFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments.CreerIngredientFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments.CreerPlatFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.MesRegimesFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.RechercheRegimeFragment;
import com.example.regime_app.MenuFragments.MenuRegimesManagmentFragment;

import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.NB_PAGES;


public class RegimesPagerAdapter extends FragmentPagerAdapter {
    private MenuRegimesManagmentFragment menuRegimesManagmentFragment;

    public RegimesPagerAdapter(FragmentManager fm, MenuRegimesManagmentFragment menuRegimesManagmentFragment) {
        super(fm);
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
                ((CreationRegimeFragment) fragment).setFragmentSwitcher(menuRegimesManagmentFragment);
                break;
            case 3 :
                fragment = new AjouterJourFragment();
                ((AjouterJourFragment) fragment).setFragmentSwitcher(menuRegimesManagmentFragment);
                break;
            case 4 :
                fragment = new AjouterRepasFragment();
                ((AjouterRepasFragment) fragment).setFragmentSwitcher(menuRegimesManagmentFragment);
                break;
            case 5 :
                fragment = new CreerPlatFragment();
                ((CreerPlatFragment) fragment).setFragmentSwitcher(menuRegimesManagmentFragment);
                break;
            case 6 :
                fragment = new CreerIngredientFragment();
                ((CreerIngredientFragment) fragment).setFragmentSwitcher(menuRegimesManagmentFragment);
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return NB_PAGES;
    }
}