package appregime.controller;

import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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

    private UserModel user;

    public ConnexionController() {
        super("/appregime/view/premiere_connexion.fxml");
        this.user = new UserModel();
        inscription.setOnAction(event -> inscription());
        return2Users.setOnAction(event -> return2Users());
        connexion.setOnAction(event -> connexion(this.user));
    }

    private void inscription() {
        user.setMail(mailAdressInscription.getText());
        user.setPseudo(nomUtilisateurInscription.getText());
        user.setPassword(confirmPassWordInscription.getText());
        InscriptionController inscription = new InscriptionController(user);
        inscription.showInPrimaryStage();
    }

    private void return2Users() {
        UtilisateurAcceuilController utilisateur = new UtilisateurAcceuilController();
        utilisateur.showInPrimaryStage();
    }

    private void connexion(UserModel user) {
        AccueilController accueilController = new AccueilController(this.user);
        accueilController.showWithMenu(this.user);
    }
}
