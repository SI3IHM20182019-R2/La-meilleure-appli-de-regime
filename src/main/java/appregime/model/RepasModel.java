package appregime.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.util.*;

public class RepasModel {
    public static List<RepasModel> repasModel;
    private StringProperty NomRepas;
    private StringProperty descriptionrepas;
    private StringProperty PathImage;
    private List<PlatModel> listOfPlat;

    public RepasModel(String NomRepas, String descriptionrepas, String PathImage, List<PlatModel> listPlat) {
        this.NomRepas = new SimpleStringProperty(NomRepas);
        this.descriptionrepas = new SimpleStringProperty(descriptionrepas);
        this.PathImage = new SimpleStringProperty(PathImage);
        this.listOfPlat = listPlat;
    }


    public StringProperty getNomRepas() {
        return NomRepas;
    }

    public StringProperty getDescriptionrepas() {
        return descriptionrepas;
    }

    public List<PlatModel> getlistOfPlat() {
        return listOfPlat;
    }

    public StringProperty getImagePath() {
        return this.PathImage;
    }

}

