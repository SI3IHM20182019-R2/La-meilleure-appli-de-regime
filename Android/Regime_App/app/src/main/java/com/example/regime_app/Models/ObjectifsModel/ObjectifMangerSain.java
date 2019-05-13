package com.example.regime_app.Models.ObjectifsModel;

import java.util.Date;

public class ObjectifMangerSain extends Objectif {

    public ThemeMangerSainObjectif themeMangerSainObjectif;

    public ObjectifMangerSain(Date dateDebutObjectif, Date dateFinObjectif, ThemeMangerSainObjectif themeMangerSainObjectif){
        super(TypeObjectif.MangerSain, dateDebutObjectif, dateFinObjectif);
        this.themeMangerSainObjectif = themeMangerSainObjectif;
    }

    public ThemeMangerSainObjectif getThemeMangerSainObjectif() {
        return themeMangerSainObjectif;
    }
}
