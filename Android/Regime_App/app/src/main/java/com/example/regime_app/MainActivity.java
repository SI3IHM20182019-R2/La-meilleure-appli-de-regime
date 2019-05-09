package com.example.regime_app;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.regime_app.WelcomeView.InscriptionActivity;
import com.example.regime_app.WelcomeView.WelcomeActivity;

public class MainActivity extends AppCompatActivity {

    private Button buttonConnexion;
    private Button buttonSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSlider = findViewById(R.id.slider);
        buttonSlider.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), InscriptionActivity.class);
            startActivity(intent);
        });

        buttonConnexion = findViewById(R.id.connexion);
        buttonConnexion.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MenuManagmentActivity.class);
            startActivity(intent);
        });
    }
}
