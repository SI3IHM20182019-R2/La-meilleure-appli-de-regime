package com.example.regime_app.Models.ObjectifsModel;

import java.util.Date;

public class ObjectifPriseDeMuscle extends Objectif {

    public int nbKiloAPrendre;

    public ObjectifPriseDeMuscle(Date dateDebutObjectif, Date dateFinObjectif, int nbKiloAPrendre, int id){
        super(TypeObjectif.PriseDeMuscle, dateDebutObjectif, dateFinObjectif, id);
        this.nbKiloAPrendre = nbKiloAPrendre;
    }

    public int getNbKiloAPrendre() {
        return nbKiloAPrendre;
    }
}
