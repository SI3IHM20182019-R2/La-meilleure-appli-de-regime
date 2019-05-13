package com.example.regime_app.Models.ObjectifsModel;

import java.util.Date;

public class ObjectifPerteDePoids extends Objectif {

    public int nbKiloAPerdre;

    public ObjectifPerteDePoids (Date dateDebutObjectif, Date dateFinObjectif, int nbKiloAPerdre){
        super(TypeObjectif.PerteDePoids, dateDebutObjectif, dateFinObjectif);
        this.nbKiloAPerdre = nbKiloAPerdre;
    }

    public int getNbKiloAPerdre() {
        return nbKiloAPerdre;
    }
}
