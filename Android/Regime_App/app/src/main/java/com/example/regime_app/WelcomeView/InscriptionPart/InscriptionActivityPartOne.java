package com.example.regime_app.WelcomeView.InscriptionPart;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.regime_app.MainActivity;
import com.example.regime_app.Models.Utilisateur;
import com.example.regime_app.R;

public class InscriptionActivityPartOne extends AppCompatActivity {

    private EditText mail, prenom, nom, pwd, confirm;
    private Button nextBtn, cancelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription_part_one);

        initalizeData();

        this.mail = this.findViewById(R.id.email_input);
        this.prenom = this.findViewById(R.id.prenom_input);
        this.nom = this.findViewById(R.id.nom_input);
        this.pwd = this.findViewById(R.id.pwd_input);
        this.confirm = this.findViewById(R.id.confirm_input);

        this.nextBtn = this.findViewById(R.id.next_button);
        this.nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkData()) {
                    storeData();
                    Intent intent = new Intent(getApplicationContext(), InscriptionActivityPartTwo.class);
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
    }

    private boolean checkData() {
        return validateInput(this.mail) & validateInput(this.prenom) & validateInput(this.nom) & validateInput(this.pwd) & validateInput(this.confirm);
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

    private void initalizeData() {
        String saved_mail = Utilisateur.getInstance().getMail();
        String saved_prenom = Utilisateur.getInstance().getPrenom();
        String saved_nom = Utilisateur.getInstance().getNom();
        String saved_pwd = Utilisateur.getInstance().getPwd();
        if (saved_mail != null) this.mail.setText(saved_mail);
        if (saved_prenom != null) this.prenom.setText(saved_prenom);
        if (saved_nom != null) this.nom.setText(saved_nom);
        if (saved_pwd != null) {
            this.pwd.setText(saved_pwd);
            this.confirm.setText(saved_pwd);
        }
    }

    private void storeData() {
        String mailToStore = this.mail.getText().toString();
        String prenomToStore = this.prenom.getText().toString();
        String nomToStore = this.nom.getText().toString();
        String pwdToStore = this.pwd.getText().toString();
        Utilisateur utilisateur = Utilisateur.getInstance();
        utilisateur.setMail(mailToStore);
        utilisateur.setPrenom(prenomToStore);
        utilisateur.setNom(nomToStore);
        utilisateur.setPwd(pwdToStore);
    }
}
