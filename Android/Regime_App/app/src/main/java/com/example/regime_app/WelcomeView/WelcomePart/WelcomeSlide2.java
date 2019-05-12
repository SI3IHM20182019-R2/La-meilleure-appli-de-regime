package com.example.regime_app.WelcomeView.WelcomePart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.regime_app.Models.PreferenceAlimentaire;
import com.example.regime_app.R;

import java.util.ArrayList;
import java.util.List;

public class WelcomeSlide2 extends Fragment {

    private ImageButton pref, allergie;

    private List<PreferenceAlimentaire> prefs = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.option_inscription_view_2, container, false);
        this.pref = rootView.findViewById(R.id.pref_logo);
        this.allergie = rootView.findViewById(R.id.allergie_logo);

        this.pref.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                try {
//                    Gson gson = new Gson();
//                    BufferedReader reader = new BufferedReader(new InputStreamReader(Objects.requireNonNull(getActivity()).getAssets().open("preferences_alimentaire.json")));
//                    Type listType = new TypeToken<ArrayList<PreferenceAlimentaire>>(){}.getType();
//                    prefs = gson.<ArrayList<PreferenceAlimentaire>>fromJson(reader, listType);
//                    reader.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
                Intent intent = new Intent(rootView.getContext(), SelectionPreferencesAlimentaires.class);
                startActivity(intent);
            }
        });

        this.allergie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(rootView.getContext(), SelectionAllergies.class);
                startActivity(intent);
            }
        });

        return rootView;
    }
}
