package com.example.regime_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.Window;
import android.view.WindowManager;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private Button buttonConnexion;
    private Button buttonSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonSlider = (Button) findViewById(R.id.slider);
        buttonSlider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WelcomeActivity.class);
                startActivity(intent);
            }
        });

        buttonConnexion = findViewById(R.id.connexion);
        buttonConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MenuManagmentActivity.class);
                startActivity(intent);
            }
        });
    }
}
