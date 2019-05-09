package com.example.regime_app.Models.ObjectifsModel;

import java.util.Date;

public class Objectif {

    private TypeObjectif typeObjectif;
    private Date dateFinObjectif;
    private boolean isChecked;

    public Objectif(TypeObjectif typeObjectif, Date dateFinObjectif, boolean isChecked) {
        this.typeObjectif = typeObjectif;
        this.dateFinObjectif = dateFinObjectif;
        this.isChecked = isChecked;
    }

    public TypeObjectif getTypeObjectif() {
        return this.typeObjectif;
    }

    public Date getDateFinObjectif() {
        return this.dateFinObjectif;
    }

    public boolean isChecked(){
        return this.isChecked;
    }
}
