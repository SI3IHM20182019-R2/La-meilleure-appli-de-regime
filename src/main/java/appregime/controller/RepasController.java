package appregime.controller;

import appregime.model.IngredientQuantiteModel;
import appregime.model.PlatModel;
import appregime.model.RepasModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class RepasController extends Controller {
    @FXML
    private Label nomIngredient;

    @FXML
    private Label lipides;

    @FXML
    private Label glucides;

    @FXML
    private Label proteines;

    @FXML
    private Label calories;

    @FXML
    private Label plat1;

    @FXML
    private Label plat2;

    @FXML
    private Label plat3;

    @FXML
    private ImageView imageIngredient;

    public RepasController() {
        super("/appregime/view/repas.fxml");
    }


    public void setRepas(RepasModel repas) {
        System.out.println(repas.getNomRepas());
        nomIngredient.setText(repas.getNomRepas().getValue());
        plat1.setText(repas.getlistOfPlat().get(0).getName().getValue());
        plat2.setText(repas.getlistOfPlat().get(1).getName().getValue());
        plat3.setText(repas.getlistOfPlat().get(2).getName().getValue());
        imageIngredient.setImage(new Image(repas.getImagePath().getValue()));


        proteines.setText(String.valueOf(repas.getlistOfPlat().get(0).getProteines().getValue()));
        glucides.setText(String.valueOf(repas.getlistOfPlat().get(0).getGlucides().getValue()));
        lipides.setText(String.valueOf(repas.getlistOfPlat().get(0).getLipides().getValue()));
        calories.setText(String.valueOf(repas.getlistOfPlat().get(0).getCalories().getValue()));
    }
}
