package com.example.regime_app.Models.ObjectifsModel;

import java.util.Date;

public class ObjectifReduireGlucides extends Objectif {

    public IntensiteObjectif intensiteObjectif;

    public ObjectifReduireGlucides(Date dateDebutObjectif, Date dateFinObjectif, IntensiteObjectif intensiteObjectif, int id){
        super(TypeObjectif.ReduireGlucides, dateDebutObjectif, dateFinObjectif, id);
        this.intensiteObjectif = intensiteObjectif;
    }

    public IntensiteObjectif getIntensiteObjectif() {
        return intensiteObjectif;
    }
}
