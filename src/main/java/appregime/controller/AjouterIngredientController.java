package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AjouterIngredientController extends Controller {
    @FXML
    private Button annuler;
    @FXML
    private Button creerIngredient;
    @FXML
    private Button ajouter;

    public AjouterIngredientController(Stage primaryStage) {
        super(primaryStage, "/appregime/view/ajouter_ingredient.fxml");
        ajouter.setOnAction(event -> myStage.close());
        annuler.setOnAction(event -> myStage.close());
        creerIngredient.setOnAction(event -> creerIngredient());
    }

    private void creerIngredient() {
        myStage.close();
        CreerIngredientController creerIngredientController = new CreerIngredientController(primaryStage);
        creerIngredientController.showWithMenu();
    }
}