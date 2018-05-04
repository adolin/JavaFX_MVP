package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import model.Person;

import java.net.URL;
import java.util.ResourceBundle;

public class EditController {
    @FXML
    private TextField firstNameField ;
    @FXML
    private TextField lastNameField ;

    private Person model ;

    public void initModel(Person person) {
        if (this.model != null) {
            throw new IllegalStateException("Model can only be initialized once");
        }
        this.model = person ;
    }

    public void changeName() {
        model.setFirstName(firstNameField.getText());
        model.setLastName(lastNameField.getText());
    }
}
