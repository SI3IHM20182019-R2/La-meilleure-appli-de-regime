package com.example.regime_app.WelcomeView.InscriptionPart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.regime_app.MainActivity;
import com.example.regime_app.Models.Utilisateur;
import com.example.regime_app.R;

public class InscriptionActivityPartOne extends AppCompatActivity {

    private Button nextBtn, cancelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription_part_one);

        Utilisateur.getInstance().clear();

        this.nextBtn = this.findViewById(R.id.next_button);
        this.nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Utilisateur.getInstance().clear();
                Intent intent = new Intent(getApplicationContext(), InscriptionActivityPartTwo.class);
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


    }
}
