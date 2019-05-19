package com.example.regime_app.WelcomeView.ConnexionPart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.regime_app.MenuManagmentActivity;
import com.example.regime_app.R;

public class Connexion extends AppCompatActivity {

    private EditText mail, pwd;
    private Button next, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connexion);

        this.mail = this.findViewById(R.id.email_input);
        this.pwd = this.findViewById(R.id.pwd_input);
        this.next = this.findViewById(R.id.next_button);
        this.cancel = this.findViewById(R.id.cancel_button);

        this.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkData()) {
                    Intent intent = new Intent(getApplicationContext(), MenuManagmentActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }

            }
        });

        this.cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    private boolean checkData() {
        return validateInput(this.mail) & validateInput(this.pwd);
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
}
