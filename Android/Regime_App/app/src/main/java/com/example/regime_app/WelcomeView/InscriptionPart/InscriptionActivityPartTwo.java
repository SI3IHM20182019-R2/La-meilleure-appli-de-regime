package com.example.regime_app.WelcomeView.InscriptionPart;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.regime_app.MainActivity;
import com.example.regime_app.Models.Utilisateur;
import com.example.regime_app.R;
import com.example.regime_app.WelcomeView.WelcomePart.WelcomeActivity;

import java.util.Calendar;
import java.util.TimeZone;

public class InscriptionActivityPartTwo extends AppCompatActivity {

    private Button nextBtn, cancelBtn, returnBtn;

    private DatePickerDialog.OnDateSetListener dateSetListener;
    private LinearLayout dateInput;

    private EditText ageInput, sizeInput, weightInput, objectifInput, dateDisplay;
    private LinearLayout sexeInputLayout;
    private RadioGroup sexeInput;
    private CheckBox checkBox_calendar;
    private int day = 0;
    private int month_deadline = 0;
    private int year_deadline = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription_part_two);

        this.ageInput = this.findViewById(R.id.age_input);
        this.sizeInput = this.findViewById(R.id.taille_input);
        this.weightInput = this.findViewById(R.id.poids_input);
        this.objectifInput = this.findViewById(R.id.objectif_input);
        this.sexeInput = this.findViewById(R.id.sexe_form_group);
        this.sexeInputLayout = this.findViewById(R.id.sexe_layout);

        dateDisplay = findViewById(R.id.date_display);
        dateInput = findViewById(R.id.date_input);
        checkBox_calendar = findViewById(R.id.checkBox);


//        this.ageInput.setText(Utilisateur.getInstance().getAge());
//        this.sizeInput.setText(Utilisateur.getInstance().getTaille());
//        this.weightInput.setText(Float.toString(Utilisateur.getInstance().getPoids()));
//        this.objectifInput.setText(Float.toString(Utilisateur.getInstance().getObectif()));
//        this.dateDisplay.setText(Utilisateur.getInstance().getDeadline());

//        this.sexeInput = findViewById(R.id.sexe_form_group);
//        if (Utilisateur.getInstance().getSexe().equals("Homme")) {
//            sexeInput.check(R.id.homme);
//        } else if (Utilisateur.getInstance().getSexe().equals("Femme")) {
//            sexeInput.check(R.id.femme);
//        } else {
//            sexeInput.clearCheck();
//        }

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
                day = dayOfMonth;
                month_deadline = month-1;
                year_deadline = year;
                dateDisplay.setText(dayOfMonth + "/" + month + "/" + year);
            }
        };

        this.nextBtn = this.findViewById(R.id.next_button);
        this.nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkData()) {
                    storeData();
                    if (checkBox_calendar.isChecked()) {
                        String poidsfinobjectif = "Poids que je dois avoir: " + Utilisateur.getInstance().getObectif();
                        String poidsActuel = "Poids que j'ai aujourd'hui: " + Utilisateur.getInstance().getPoids();
                        addCalendar(14, 4, 2019, "Debut objectif Perte de poids", poidsActuel);
                        addCalendar(day, month_deadline, year_deadline, "Fin de l'objectif", poidsfinobjectif);
                    }

                    Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class);
                    startActivity(intent);
                }
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
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    private boolean checkData() {
        return validateInput(this.ageInput) & validateInput(this.sizeInput) & validateInput(this.weightInput) & validateInput(dateDisplay) & validateInput(this.sexeInput) & validateInput(this.objectifInput);
    }

    private boolean validateInput(RadioGroup radioGroup) {
        if (radioGroup.getCheckedRadioButtonId() == -1) {
            this.sexeInputLayout.setBackground(ContextCompat.getDrawable(this, R.drawable.custominvalidborder));
            return false;
        } else {
            this.sexeInputLayout.setBackground(null);
            return true;
        }
    }

    private boolean validateInput(EditText editText) {
        if (isEmpty(editText)) {
            editText.setError("Champ manquant");
            return false;
        } else {
            editText.setError(null);
            return true;
        }
    }

    private boolean isEmpty(EditText editText) {
        String input = editText.getText().toString().trim();
        return input.length() == 0;
    }

//    private void initalizeData() {
    //    if (Utilisateur.getInstance().getSexe().equals("Homme")) {
    //        sexeInput.check(R.id.homme);
    //    } else if (Utilisateur.getInstance().getSexe().equals("Femme")) {
    //        sexeInput.check(R.id.femme);
    //    } else {
    //        sexeInput.clearCheck();
    //    }
//        String saved_mail = Utilisateur.getInstance().getMail();
//        String saved_prenom = Utilisateur.getInstance().getPrenom();
//        String saved_nom = Utilisateur.getInstance().getNom();
//        String saved_pwd = Utilisateur.getInstance().getPwd();
//        if (saved_mail != null) this.mail.setText(saved_mail);
//        if (saved_prenom != null) this.prenom.setText(saved_prenom);
//        if (saved_nom != null) this.nom.setText(saved_nom);
//        if (saved_pwd != null) {
//            this.pwd.setText(saved_pwd);
//            this.confirm.setText(saved_pwd);
//        }
//    }

    private void storeData() {
        String ageToStore = this.ageInput.getText().toString();
        String sizeToStore = this.sizeInput.getText().toString();
        String weightToStore = this.weightInput.getText().toString();
        String objectifToStore = this.objectifInput.getText().toString();
        String deadlineToStore = this.dateDisplay.getText().toString();
        Utilisateur utilisateur = Utilisateur.getInstance();
        utilisateur.setAge(Integer.parseInt(ageToStore));
        utilisateur.setTaille(Integer.parseInt(sizeToStore));
        utilisateur.setPoids(Double.parseDouble(weightToStore));
        utilisateur.setObectif(Double.parseDouble(objectifToStore));
        utilisateur.setDeadline(deadlineToStore);

        RadioButton checkedSexe = findViewById(sexeInput.getCheckedRadioButtonId());
        String sexeToStore = checkedSexe.getText().toString();
        utilisateur.setSexe(sexeToStore);
    }

    private void addCalendar (int day, int month, int year, String title, String poids) {
        long calID = 1;
        long startMillis = 0;
        long endMillis = 0;
        Calendar beginTime = Calendar.getInstance();
        beginTime.set(year, month, day);
        startMillis = beginTime.getTimeInMillis();
        Calendar endTime = Calendar.getInstance();
        endTime.set(year, month, day);
        endMillis = endTime.getTimeInMillis();


        ContentResolver cr = getContentResolver();
        ContentValues values = new ContentValues();
        values.put(CalendarContract.Events.DTSTART, startMillis);
        values.put(CalendarContract.Events.DTEND, endMillis);
        values.put(CalendarContract.Events.TITLE, title);
        values.put(CalendarContract.Events.DESCRIPTION, poids);
        values.put(CalendarContract.Events.CALENDAR_ID, calID);
        values.put(CalendarContract.Events.EVENT_TIMEZONE, TimeZone.getDefault().toString());
        Uri uri = cr.insert(CalendarContract.Events.CONTENT_URI, values);

        long eventID = Long.parseLong(uri.getLastPathSegment());
    }
}
