package appregime;

import appregime.controller.UtilisateurAcceuilController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    private static Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        Main.primaryStage = primaryStage;
        primaryStage.setTitle("La meilleure appli de régime");
        UtilisateurAcceuilController connexionController = new UtilisateurAcceuilController();
        connexionController.showInPrimaryStage();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }
}
