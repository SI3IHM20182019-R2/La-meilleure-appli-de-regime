package com.example.regime_app.Models.ObjectifsModel;

import com.example.regime_app.Interface.ObjectifInterface;
import com.example.regime_app.R;

public class NewObjectif implements ObjectifInterface {

    public NewObjectif(){}

    public int getImage () {
        return R.drawable.add_button;
    }

    public String toString () {
        return "Ajouter un objectif";
    }

    public String getBut() {
        return "";
    }

    public String getConseilCoach() {
        return "";
    }


}
