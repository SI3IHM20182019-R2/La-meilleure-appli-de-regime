package com.example.regime_app.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments.AjouterJourFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments.AjouterRepasFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments.CreerIngredientFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments.CreerPlat1Fragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments.CreerPlat2Fragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.MesRegimesFragment;
import com.example.regime_app.MenuFragments.MenuRegimesFragments.RechercheRegimeFragment;
import com.example.regime_app.MenuFragments.MenuRegimesManagmentFragment;

import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.AJOUTER_JOUR;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.AJOUTER_REPAS;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.CREATION_REGIME;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.CREER_INGREDIENT;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.CREER_PLAT1;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.CREER_PLAT2;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.MES_REGIMES;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.NB_PAGES;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.RECHERCHE_REGIME;


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
            case MES_REGIMES : fragment = new MesRegimesFragment(); break;
            case RECHERCHE_REGIME : fragment = new RechercheRegimeFragment(); break;
            case CREATION_REGIME :
                fragment = new CreationRegimeFragment();
                ((CreationRegimeFragment) fragment).setFragmentSwitcher(menuRegimesManagmentFragment);
                break;
            case AJOUTER_JOUR :
                fragment = new AjouterJourFragment();
                ((AjouterJourFragment) fragment).setFragmentSwitcher(menuRegimesManagmentFragment);
                break;
            case AJOUTER_REPAS :
                fragment = new AjouterRepasFragment();
                ((AjouterRepasFragment) fragment).setFragmentSwitcher(menuRegimesManagmentFragment);
                break;
            case CREER_PLAT1:
                fragment = new CreerPlat1Fragment();
                ((CreerPlat1Fragment) fragment).setFragmentSwitcher(menuRegimesManagmentFragment);
                break;
            case CREER_PLAT2:
                fragment = new CreerPlat2Fragment();
                ((CreerPlat2Fragment) fragment).setFragmentSwitcher(menuRegimesManagmentFragment);
                break;
            case CREER_INGREDIENT :
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