package appregime.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.scene.image.Image;

import java.util.*;

public class RepasModel {
    public static List<RepasModel> repasModel;
    private StringProperty NomRepas;
    private StringProperty descriptionrepas;
    private StringProperty PathImage;
    private ModelPlat[] listOfPlat;

    public RepasModel(String NomRepas, String descriptionrepas, String PathImage, ModelPlat[] listPlat) {
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

    public ModelPlat[] getlistOfPlat() {
        return listOfPlat;
    }

    public StringProperty getImagePath() {
        return this.PathImage;
    }

}

