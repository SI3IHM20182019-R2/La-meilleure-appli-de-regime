package appregime.controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ConnexionController extends Controller {
    @FXML
    private Button Connexion;
    @FXML
    private Button Inscription;
    @FXML
    private Button Return2Users;
    @FXML
    private TextField MailAdressConnexion;
    @FXML
    private PasswordField PassWordConnexion;
    @FXML
    private TextField MailAdressInscription;
    @FXML
    private TextField NomUtilisateur;
    @FXML
    private PasswordField PassWordRegister;
    @FXML
    private PasswordField ConfirmPassWordRegister;

    public ConnexionController (Stage primaryStage) {
        super(primaryStage, "/appregime/view/Premiere_conexion.fxml");
        Inscription.setOnAction(event -> Inscription());
    }

    private void Inscription() {
        InscriptionController Inscription = new InscriptionController(primaryStage);
        Inscription.showWithMenu();
    }

}
