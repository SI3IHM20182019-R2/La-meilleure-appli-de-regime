package appregime;

import appregime.controller.UtilisateurAcceuilController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("La meilleure appli de régime");
        UtilisateurAcceuilController connexionController = new UtilisateurAcceuilController(primaryStage);
        connexionController.showInPrimaryStage();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
