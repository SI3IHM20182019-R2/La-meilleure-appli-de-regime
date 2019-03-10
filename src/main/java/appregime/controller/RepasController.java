package appregime.controller;

import appregime.model.IngredientQuantiteModel;
import appregime.model.PlatModel;
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
    private ImageView imageIngredient;

    public RepasController() {
        super("/appregime/view/repas.fxml");
    }


    public void setRepas(PlatModel plat) {
        System.out.println(plat.getImagePath().getValue());
        nomIngredient.setText(plat.getName().getValue());
        proteines.setText(String.valueOf(plat.getProteines().getValue()));
        glucides.setText(String.valueOf(plat.getGlucides().getValue()));
        lipides.setText(String.valueOf(plat.getLipides().getValue()));
        calories.setText(String.valueOf(plat.getCalories().getValue()));
        imageIngredient.setImage(new Image(plat.getImagePath().getValue()));
    }
}
