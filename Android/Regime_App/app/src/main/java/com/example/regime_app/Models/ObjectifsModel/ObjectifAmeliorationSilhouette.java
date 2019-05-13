package com.example.regime_app.Models.ObjectifsModel;

import java.util.Date;

public class ObjectifAmeliorationSilhouette extends Objectif {

    public IntensiteObjectif intensiteObjectif;

    public ObjectifAmeliorationSilhouette(Date dateDebutObjectif, Date dateFinObjectif, IntensiteObjectif intensiteObjectif){
        super(TypeObjectif.ReduireGlucides, dateDebutObjectif, dateFinObjectif);
        this.intensiteObjectif = intensiteObjectif;
    }

    public IntensiteObjectif getIntensiteObjectif() {
        return intensiteObjectif;
    }
}
