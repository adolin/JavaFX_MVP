package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import model.Person;

public class PersonController {

    @FXML
    private Label firstName;

    @FXML
    private Label lastName;

    private Person model;

    public void initModel (Person model) {
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = model;
        firstName.textProperty().bind(model.firstNameProperty());
        lastName.textProperty().bind(model.lastNameProperty());
    }
}
