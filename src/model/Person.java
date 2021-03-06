package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private final StringProperty firstName = new SimpleStringProperty();

    public final StringProperty firstNameProperty() {
        return this.firstName;
    }

    public final String getFirstName() {
        return this.firstNameProperty().get();
    }

    public final void setFirstName(final String firstName) {
        this.firstNameProperty().set(firstName);
    }

    private final StringProperty lastName = new SimpleStringProperty();

    public final StringProperty lastNameProperty() {
        return this.lastName;
    }

    public final String getLastName() {
        return this.lastNameProperty().get();
    }

    public final void setLastName(final String lastName) {
        this.lastNameProperty().set(lastName);
    }


    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }
}
