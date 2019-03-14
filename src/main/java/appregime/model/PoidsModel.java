package appregime.model;

import java.util.Date;

public class PoidsModel {

    private Double poids;
    private Date date;

    public PoidsModel(Double poids, Date date) {
        this.poids = poids;
        this.date= date;
    }

    public Double getPoids() {
        return poids;
    }

    public Date getDate() {
        return date;
    }
}
