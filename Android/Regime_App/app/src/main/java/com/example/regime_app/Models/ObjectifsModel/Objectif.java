package com.example.regime_app.Models.ObjectifsModel;

import com.example.regime_app.Interface.ObjectifInterface;
import java.util.Date;

public class Objectif implements ObjectifInterface {

    private TypeObjectif typeObjectif;
    private Date dateFinObjectif;
    private Date dateDebutObjectif;

    public Objectif(TypeObjectif typeObjectif, Date dateDebutObjectif, Date dateFinObjectif) {
        this.typeObjectif = typeObjectif;
        this.dateDebutObjectif = dateDebutObjectif;
        this.dateFinObjectif = dateFinObjectif;
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
        return this.typeObjectif.getText();
    }

    public Date getDateDebutObjectif() {
        return this.dateFinObjectif;
    }

    public Date getDateFinObjectif() {
        return this.dateFinObjectif;
    }

}
