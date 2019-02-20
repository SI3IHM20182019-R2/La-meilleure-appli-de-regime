package appregime;

import appregime.controller.AjouterRepasController;
import appregime.controller.CreerRegimeController;
import appregime.controller.MenuController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    private Stage primaryStage;
    private MenuController menu;
    private CreerRegimeController creerRegimeController;
    private AjouterRepasController ajouterRepasController;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("La meilleure appli de régime");

        menu = new MenuController(primaryStage);
        creerRegimeController = new CreerRegimeController(primaryStage);
        menu.setMenuElement(creerRegimeController.getFxml());

        menu.showInPrimaryStage();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
