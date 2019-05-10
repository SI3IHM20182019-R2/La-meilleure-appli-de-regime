package com.example.regime_app;

import android.support.v4.app.Fragment;

public class FragmentSwitchable extends Fragment {
    FragmentSwitcher fragmentSwitcher;

    public void setSwitches(Switch... switches) {
        for (int i = 0; i < switches.length; i++) {
            int j = i;
            switches[i].getButton().setOnClickListener(v -> {
                fragmentSwitcher.fragmentSwitch(switches[j].getPageNumber());
            });
        }
    }

    public void setFragmentSwitcher(FragmentSwitcher fragmentSwitcher) {
        this.fragmentSwitcher = fragmentSwitcher;
    }
}
