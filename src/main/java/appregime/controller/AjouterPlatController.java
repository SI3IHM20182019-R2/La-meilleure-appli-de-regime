package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AjouterPlatController extends Controller {
    @FXML
    private Button annuler;
    @FXML
    private Button creerPlat;
    @FXML
    private Button ajouter;

    public AjouterPlatController(Stage primaryStage) {
        super(primaryStage, "/appregime/view/ajouter_plat.fxml");
        ajouter.setOnAction(event -> myStage.close());
        annuler.setOnAction(event -> myStage.close());
        creerPlat.setOnAction(event -> creerPlat());
    }

    private void creerPlat() {
        myStage.close();
        CreerPlatController creerPlatController = new CreerPlatController(primaryStage);
        creerPlatController.showWithMenu();
    }
}