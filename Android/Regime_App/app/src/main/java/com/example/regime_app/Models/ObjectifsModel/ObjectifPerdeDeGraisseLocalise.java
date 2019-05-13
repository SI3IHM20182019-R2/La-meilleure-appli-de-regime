package com.example.regime_app.Models.ObjectifsModel;

import java.util.Date;

public class ObjectifPerdeDeGraisseLocalise extends Objectif {

    public ZoneCorpsGraisseObjectif zoneCorpsGraisseObjectif;

    public ObjectifPerdeDeGraisseLocalise(Date dateDebutObjectif, Date dateFinObjectif, ZoneCorpsGraisseObjectif zoneCorpsGraisseObjectif, int id){
        super(TypeObjectif.PerteGraisse, dateDebutObjectif, dateFinObjectif, id);
        this.zoneCorpsGraisseObjectif = zoneCorpsGraisseObjectif;
    }

    public ZoneCorpsGraisseObjectif getZoneCorpsGraisseObjectif() {
        return zoneCorpsGraisseObjectif;
    }
}
