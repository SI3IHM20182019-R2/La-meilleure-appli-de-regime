package com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments;

import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.regime_app.R;

public class FragmentNextAndRetour extends Fragment {
    OnNextClicked onNextClickedCallback;
    OnRetourClicked onRetourClickedCallback;

    public void setListeners(View view, int nextId, int retourId) {
        ImageButton retour = view.findViewById(retourId);
        retour.setOnClickListener(v -> {
            onRetourClickedCallback.onRetourClicked();
        });
        Button next = view.findViewById(nextId);
        next.setOnClickListener(v -> {
            onNextClickedCallback.onNextClicked();
        });
    }

    public void setOnNextClickedListener(OnNextClicked onNextClickedCallback) {
        this.onNextClickedCallback = onNextClickedCallback;
    }
    public void setOnRetourClickedCallback(OnRetourClicked onNextClickedCallback) {
        this.onRetourClickedCallback = onNextClickedCallback;
    }
}
