package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class CreerPlatController extends Controller {
    @FXML
    private Button ajouterIngredient;
    @FXML
    private Button retour;
    @FXML
    private Button terminer;

    public CreerPlatController() {
        super("/appregime/view/creer_plat.fxml");
        ajouterIngredient.setOnAction(event -> afficheAjouterIngredient());
        retour.setOnAction(event -> retour());
        terminer.setOnAction(event -> retour());
    }

    private void afficheAjouterIngredient() {
        AjouterIngredientController ajouterIngredientController = new AjouterIngredientController();
        ajouterIngredientController.showInMyStage("Ajouter un ingrédient");
    }

    private void retour() {
        CreerRepasController creerRepasController = new CreerRepasController();
        creerRepasController.showWithMenu();
    }
}
