package com.example.regime_app.WelcomeView.WelcomePart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.regime_app.R;

public class SelectionPreferencesAlimentaires extends AppCompatActivity {

    private Button cancel, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_pref_alim);

        this.cancel = this.findViewById(R.id.annuler);
        this.cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        this.next = this.findViewById(R.id.soumettre);
        this.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkbox_ovo_lacto:
                break;
            case R.id.checkbox_ovo:
                break;
            case R.id.checkbox_lacto:
                break;
            case R.id.checkbox_pesco:
                break;
            case R.id.checkbox_vegetalien:
                break;
            // TODO: Veggie sandwich
        }
    }

}
