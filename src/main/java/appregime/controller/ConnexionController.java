package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ConnexionController extends Controller {
    @FXML
    private Button connexion;
    @FXML
    private Button inscription;
    @FXML
    private Button return2Users;
    @FXML
    private TextField mailAdressConnexion;
    @FXML
    private PasswordField passWordConnexion;
    @FXML
    private TextField mailAdressInscription;
    @FXML
    private TextField nomUtilisateurInscription;
    @FXML
    private PasswordField passWordInscription;
    @FXML
    private PasswordField confirmPassWordInscription;

    public ConnexionController (Stage primaryStage) {
        super(primaryStage, "/appregime/view/premiere_connexion.fxml");
        inscription.setOnAction(event -> inscription());
        return2Users.setOnAction(event -> return2Users());
    }

    private void inscription() {
        InscriptionController inscription = new InscriptionController(primaryStage);
        inscription.showInPrimaryStage();
    }

    private void return2Users() {
        UtilisateurAcceuilController utilisateur = new UtilisateurAcceuilController(primaryStage);
        utilisateur.showInPrimaryStage();
    }

}
