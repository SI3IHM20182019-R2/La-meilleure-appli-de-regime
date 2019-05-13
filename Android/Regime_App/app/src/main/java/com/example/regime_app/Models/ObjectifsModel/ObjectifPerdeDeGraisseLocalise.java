package com.example.regime_app.Models.ObjectifsModel;

import java.util.Date;

public class ObjectifPerdeDeGraisseLocalise extends Objectif {

    public ZoneCorpsGraisseObjectif zoneCorpsGraisseObjectif;

    public ObjectifPerdeDeGraisseLocalise(Date dateDebutObjectif, Date dateFinObjectif, ZoneCorpsGraisseObjectif zoneCorpsGraisseObjectif){
        super(TypeObjectif.PerteGraisse, dateDebutObjectif, dateFinObjectif);
        this.zoneCorpsGraisseObjectif = zoneCorpsGraisseObjectif;
    }

    public ZoneCorpsGraisseObjectif getZoneCorpsGraisseObjectif() {
        return zoneCorpsGraisseObjectif;
    }
}
