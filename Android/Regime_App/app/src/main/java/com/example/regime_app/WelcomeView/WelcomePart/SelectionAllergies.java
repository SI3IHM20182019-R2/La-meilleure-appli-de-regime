package com.example.regime_app.WelcomeView.WelcomePart;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.regime_app.R;

public class SelectionAllergies extends AppCompatActivity {

    private Button cancel, next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_allergies);

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
            case R.id.checkbox_gluten:
                break;
            case R.id.checkbox_glucose:
                break;
            case R.id.checkbox_poisson:
                break;
            case R.id.checkbox_arachide:
                break;
            case R.id.checkbox_moutarde:
                break;
            case R.id.checkbox_soja:
                break;
            case R.id.checkbox_oeuf:
                break;
            // TODO: Veggie sandwich
        }
    }
}
