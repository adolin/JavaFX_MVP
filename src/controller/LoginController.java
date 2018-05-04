package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import model.Person;

import java.io.IOException;

public class LoginController {
    private Person person ;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private Button enterButton;

    @FXML
    public void login() throws IOException {
        person = new Person(firstNameField.getText(), lastNameField.getText());

        FXMLLoader containerLoader = new FXMLLoader(getClass().getResource("../view/container.fxml"));
        BorderPane root = containerLoader.load();

        FXMLLoader personLoader = new FXMLLoader(getClass().getResource("../view/person.fxml"));
        root.setCenter(personLoader.load());
        PersonController personController = personLoader.getController();
        personController.initModel(person);

        FXMLLoader editLoader = new FXMLLoader(getClass().getResource("../view/edit.fxml"));
        root.setRight(editLoader.load());
        EditController editController = editLoader.getController();
        editController.initModel(person);

        enterButton.getScene().setRoot(root);
    }
}
