package appregime;

import appregime.controller.UtilisateurAcceuilController;
import appregime.model.UserModel;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

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
