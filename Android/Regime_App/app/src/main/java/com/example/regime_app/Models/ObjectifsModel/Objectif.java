package com.example.regime_app.Models.ObjectifsModel;

import com.example.regime_app.Interface.ObjectifInterface;
import java.util.Date;

public class Objectif implements ObjectifInterface {

    private TypeObjectif typeObjectif;
    private Date dateFinObjectif;
    private boolean isChecked;

    public Objectif(TypeObjectif typeObjectif, Date dateFinObjectif, boolean isChecked) {
        this.typeObjectif = typeObjectif;
        this.dateFinObjectif = dateFinObjectif;
        this.isChecked = isChecked;
    }

    public int getImage () {
        return this.typeObjectif.getImage();
    }

    public TypeObjectif getTypeObjectif() {
        return this.typeObjectif;
    }

    public String getBut(){
        return this.typeObjectif.getBut();
    }

    public String getConseilCoach(){
        return this.typeObjectif.getConseilCoach();
    }

    public String toString(){
        return this.typeObjectif.toString();
    }
    public Date getDateFinObjectif() {
        return this.dateFinObjectif;
    }

    public boolean isChecked(){
        return this.isChecked;
    }
}
