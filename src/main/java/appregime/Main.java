package appregime;

import appregime.controller.ConnexionController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("La meilleure appli de régime");

        ConnexionController connexionController = new ConnexionController(primaryStage);
        connexionController.showInPrimaryStage();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
