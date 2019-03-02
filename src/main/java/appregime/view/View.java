package appregime.view;

import appregime.controller.Controller;
import appregime.model.Model;

public class View {
    private Controller controller;
    private Model model;

    public View(Controller controller, Model model) {
        this.controller = controller;
        this.model = model;
    }
}
