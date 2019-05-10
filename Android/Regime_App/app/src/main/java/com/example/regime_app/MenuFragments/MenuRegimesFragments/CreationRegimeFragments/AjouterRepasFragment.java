package com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments;

import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.regime_app.FragmentSwitchable;
import com.example.regime_app.R;
import com.example.regime_app.Switch;

import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.AJOUTER_JOUR;
import static com.example.regime_app.MenuFragments.MenuRegimesFragments.Constants.CREER_PLAT;

public class AjouterRepasFragment extends FragmentSwitchable {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.ajouter_repas, container, false);

        ImageButton retour = view.findViewById(R.id.ajouter_repas_retour);
        Button creerPlat = view.findViewById(R.id.creer_plat);
        Switch s1 = new Switch(retour, AJOUTER_JOUR);
        Switch s2 = new Switch(creerPlat, CREER_PLAT);
        setSwitches(s1,s2);

        Button heure = view.findViewById(R.id.ajouter_repas_heure);
        heure.setOnClickListener(v -> {
            Calendar mcurrentTime = Calendar.getInstance();
            int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
            int minute = mcurrentTime.get(Calendar.MINUTE);
            TimePickerDialog mTimePicker;
            mTimePicker = new TimePickerDialog(this.getContext(), (timePicker, selectedHour, selectedMinute) ->
                    heure.setText(selectedHour + ":" + selectedMinute), hour, minute, true);
            mTimePicker.setTitle("Select Time");
            mTimePicker.show();
        });
        return view;
    }
}
