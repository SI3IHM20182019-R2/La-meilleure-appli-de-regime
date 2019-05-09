package com.example.regime_app.WelcomeView.InscriptionPart;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.regime_app.MainActivity;
import com.example.regime_app.Models.Utilisateur;
import com.example.regime_app.R;
import com.example.regime_app.WelcomeView.WelcomePart.WelcomeActivity;

import java.util.Calendar;

public class InscriptionActivityPartTwo extends AppCompatActivity {

    private Button nextBtn, cancelBtn, returnBtn;

    private DatePickerDialog.OnDateSetListener dateSetListener;
    private LinearLayout dateInput;
    private TextView displayDate;

    private EditText ageInput, sizeInput, weightInput, objectifInput, dateDisplay;
    private RadioGroup sexeInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription_part_two);

//        this.ageInput = this.findViewById(R.id.age_input);
//        this.ageInput.setText(Utilisateur.getInstance().getAge());
//        this.sizeInput = this.findViewById(R.id.age_input);
//        this.sizeInput.setText(Utilisateur.getInstance().getTaille());
//        this.weightInput = this.findViewById(R.id.age_input);
//        this.weightInput.setText(Float.toString(Utilisateur.getInstance().getPoids()));
//        this.objectifInput = this.findViewById(R.id.age_input);
//        this.objectifInput.setText(Float.toString(Utilisateur.getInstance().getObectif()));
//        this.dateDisplay = this.findViewById(R.id.age_input);
//        this.dateDisplay.setText(Utilisateur.getInstance().getDeadline());

//        this.sexeInput = findViewById(R.id.sexe_form_group);
//        if (Utilisateur.getInstance().getSexe().equals("Homme")) {
//            sexeInput.check(R.id.homme);
//        } else if (Utilisateur.getInstance().getSexe().equals("Femme")) {
//            sexeInput.check(R.id.femme);
//        } else {
//            sexeInput.clearCheck();
//        }

        displayDate = findViewById(R.id.date_display);
        dateInput = findViewById(R.id.date_input);
        dateInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        InscriptionActivityPartTwo.this,
                        android.R.style.Theme_Holo_Light_Dialog,
                        dateSetListener,
                        year,
                        month,
                        day
                );
//                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month+1;
                displayDate.setText(dayOfMonth + "/" + month + "/" + year);
            }
        };

        this.nextBtn = this.findViewById(R.id.next_button);
        this.nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utilisateur.getInstance().clear();
                Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class);
                startActivity(intent);
            }
        });

        this.cancelBtn = this.findViewById(R.id.cancel_button);
        this.cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utilisateur.getInstance().clear();
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        this.returnBtn = this.findViewById(R.id.back_button);
        this.returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Utilisateur.getInstance().setAge(Integer.parseInt(ageInput.getText().toString()));
//                Utilisateur.getInstance().setTaille(Integer.parseInt(sizeInput.getText().toString()));
//                Utilisateur.getInstance().setPoids(Float.parseFloat(weightInput.getText().toString()));
//                Utilisateur.getInstance().setObectif(Float.parseFloat((objectifInput.getText().toString())));
//                Utilisateur.getInstance().setDeadline(displayDate.getText().toString());
//                int buttonCheckedId = sexeInput.getCheckedRadioButtonId();
//                RadioButton buttonChecked = v.findViewById(buttonCheckedId);
//                Utilisateur.getInstance().setSexe(buttonChecked.getText().toString());
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
//        Utilisateur.getInstance().setAge(Integer.parseInt(ageInput.getText().toString()));
//        Utilisateur.getInstance().setTaille(Integer.parseInt(sizeInput.getText().toString()));
//        Utilisateur.getInstance().setPoids(Float.parseFloat(weightInput.getText().toString()));
//        Utilisateur.getInstance().setObectif(Float.parseFloat((objectifInput.getText().toString())));
//        Utilisateur.getInstance().setDeadline(displayDate.getText().toString());
//        int buttonCheckedId = sexeInput.getCheckedRadioButtonId();
//        RadioButton buttonChecked = this.findViewById(buttonCheckedId);
//        Utilisateur.getInstance().setSexe(buttonChecked.getText().toString());
        finish();
    }
}
