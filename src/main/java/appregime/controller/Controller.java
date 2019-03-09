package appregime.controller;

import appregime.Main;
import appregime.model.UserModel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public abstract class Controller {
    protected Stage primaryStage;
    protected Stage myStage;
    protected String fxmlPath;
    protected Pane fxml;

    public Controller(String fxmlPath) {
        primaryStage = Main.getPrimaryStage();
        this.fxmlPath = fxmlPath;
        setFxml(fxmlPath);
        fxml.getStylesheets().add("/appregime/css/common.css");
    }

    /**
     * affiche le fxml lié au controller dans la fenêtre de base
     */
    public void showInPrimaryStage() {
        Scene scene = new Scene(fxml);
        primaryStage.setScene(scene);
        this.primaryStage.show();
    }

    /**
     * affiche le fxml lié au controller avec la barre de menu
     */
    public void showWithMenu(UserModel user) {
        MenuController menuController = new MenuController(user);
        Scene scene = new Scene(menuController.getFxml());
        menuController.setBelowMenuElement(this.fxml);
        primaryStage.setScene(scene);
        this.primaryStage.show();
    }

    /**
     * affiche le fxml lié au controller dans une nouvelle fenêtre
     */
    public void showInMyStage(String stageTitle) {
        myStage = new Stage();
        myStage.setTitle(stageTitle);
        myStage.initModality(Modality.WINDOW_MODAL);
        myStage.initOwner(primaryStage);
        Scene scene = new Scene(fxml);
        myStage.setScene(scene);
        myStage.show();
    }

    public Pane getFxml() {
        return fxml;
    }

    /**
     * charge le fichier fxml et le lie au controller
     */
    private void setFxml(String fxmlPath) {
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
