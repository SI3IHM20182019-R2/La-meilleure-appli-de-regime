package com.example.regime_app.WelcomeView.ConnexionPart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.regime_app.R;
import com.example.regime_app.WelcomeView.InscriptionPart.InscriptionActivityPartOne;

public class ChoixInscriptionConnexion extends AppCompatActivity {

    private Button inscritpion, connexion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choix_inscription_connexion);

        this.inscritpion = this.findViewById(R.id.button_go_inscription);
        this.connexion = this.findViewById(R.id.button_go_connexion);

        this.inscritpion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), InscriptionActivityPartOne.class);
                startActivity(intent);
            }
        });

        this.connexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Connexion.class);
                startActivity(intent);
            }
        });
    }
}
