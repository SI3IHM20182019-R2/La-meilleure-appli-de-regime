package com.example.regime_app.MenuFragments.MenuRegimesFragments.CreationRegimeFragments;

import android.app.TimePickerDialog;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.regime_app.R;

public class AjouterRepasFragment extends FragmentNextAndRetour {
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.ajouter_repas, container, false);
        setListeners(view, R.id.creer_plat, R.id.ajouter_repas_retour);
        Button heure = view.findViewById(R.id.ajouter_repas_heure);
        TextView heureText = view.findViewById(R.id.ajouter_repas_heure_text);
        heure.setOnClickListener(v -> {
            // TODO Auto-generated method stub
            Calendar mcurrentTime = Calendar.getInstance();
            int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
            int minute = mcurrentTime.get(Calendar.MINUTE);
            TimePickerDialog mTimePicker;
            mTimePicker = new TimePickerDialog(this.getContext(), (timePicker, selectedHour, selectedMinute) ->
                    heureText.setText(selectedHour + ":" + selectedMinute), hour, minute, true);//Yes 24 hour time
            mTimePicker.setTitle("Select Time");
            mTimePicker.show();
        });
        return view;
    }
}
