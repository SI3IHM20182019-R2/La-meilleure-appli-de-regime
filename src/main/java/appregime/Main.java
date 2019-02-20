package appregime;

import appregime.controller.CreerRegimeController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("La meilleure appli de régime");

        CreerRegimeController creerRegimeController = new CreerRegimeController(primaryStage);
        creerRegimeController.showWithMenu();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
