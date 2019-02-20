package appregime.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    protected Stage primaryStage;
    protected Stage myStage;
    protected String fxmlPath;
    protected Pane fxml;

    public Controller(Stage primaryStage, String fxmlPath) {
        this.primaryStage = primaryStage;
        this.fxmlPath = fxmlPath;
        setFxml(fxmlPath);
    }

    /**
     * affiche le fxml lié au controller dans la fenêtre de base
     */
    public void showInPrimaryStage() {
        // Affiche la scène contenant la vbox avec le menu
        Scene scene = new Scene(fxml);
        primaryStage.setScene(scene);
        this.primaryStage.show();
    }

    /**
     * affiche le fxml lié au controller dans une nouvelle fenêtre
     */
    public void showInMyStage(String stageTitile) {
        myStage = new Stage();
        myStage.initModality(Modality.WINDOW_MODAL);
        myStage.setTitle(stageTitile);
        myStage.initOwner(primaryStage);
        Scene scene = new Scene(fxml);
        myStage.setScene(scene);
        myStage.show();
    }

    public String getFxmlPath() {
        return fxmlPath;
    }

    public Pane getFxml() {
        return fxml;
    }


    /**
     * charge le fichier fxml et le lie au controller
     */
    protected void setFxml(String fxmlPath) {
        FXMLLoader loader = new FXMLLoader();

        loader.setController(this);
        loader.setLocation(this.getClass().getResource(fxmlPath));

        try {
            fxml = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
