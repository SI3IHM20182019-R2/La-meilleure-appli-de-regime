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
    private ImageView imageIngredient;

    public RepasController() {
        super("/appregime/view/repas.fxml");
    }


    public void setRepas(PlatModel plat) {
        System.out.println(plat.getImagePath().getValue());
        nomIngredient.setText(plat.getName().getValue());
        imageIngredient.setImage(new Image(plat.getImagePath().getValue()));
    }
}
