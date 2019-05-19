package appregime.controller;
import appregime.model.UserList;
import appregime.model.UserModel;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.util.ArrayList;

public class UtilisateurAcceuilController extends Controller {
    private ArrayList<UserModel> userList = UserList.getUserList();
    private UserModel currentUser = userList.get(0) ;

    @FXML
    private Button addUserButton;
    @FXML
    private Button currentUserButton;


    public UtilisateurAcceuilController() {
        super("/appregime/view/utilisateur_acceuil.fxml");

        this.fxml.getStylesheets().add("/appregime/css/acceuil.css");
        addUserButton.setOnAction(event -> addUser());
        currentUserButton.setOnAction(event -> clique());
    }

    private void addUser() {
        ConnexionController inscription = new ConnexionController();
        inscription.showInPrimaryStage();
    }

    private void clique() {
        UtilisateurCliqueController clique = new UtilisateurCliqueController(this.currentUser);
        clique.showInPrimaryStage();
    }

    public UserModel getCurrentUser() {
        return currentUser;
    }

    public ArrayList<UserModel> getUserList() {
        return userList;
    }

    public void setCurrentUser(UserModel user){
        this.currentUser = user;
    }
}
