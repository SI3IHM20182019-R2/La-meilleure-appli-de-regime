package appregime.model;

import java.util.Date;

public class Poids {

    private Double poids;
    private Date date;

    public Poids ( Double poids, Date date) {
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
