package com.example.regime_app.WelcomeView;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.nfc.Tag;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.regime_app.R;

import java.util.Calendar;

public class InscriptionActivity extends AppCompatActivity {

    private static final String TAG = "InscriptionActivity";

    private DatePickerDialog.OnDateSetListener dateSetListener;
    private ImageButton calendar_btn;
    private TextView displayDate;

    private ImageButton letsgo_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);

        displayDate = (TextView)findViewById(R.id.deadline_input);
        calendar_btn = (ImageButton)findViewById(R.id.calendar);
        calendar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();
                int year = calendar.get(Calendar.YEAR);
                int month = calendar.get(Calendar.MONTH);
                int day = calendar.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        InscriptionActivity.this,
                        android.R.style.Theme_Holo_Light_Dialog,
                        dateSetListener,
                        year,
                        month,
                        day
                );
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                month = month+1;
                Log.d(TAG, "onDateSet: date --> " + year + "/" + month + "/" + dayOfMonth);
                displayDate.setText(month + "/" + dayOfMonth + "/" + year);
            }
        };

        letsgo_btn = (ImageButton)findViewById(R.id.letsgo);
        letsgo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
