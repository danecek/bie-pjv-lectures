/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class TableWrappedHeaders extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        TableColumn firstNameCol = new TableColumn("Name");
        firstNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));
        TableColumn lastNameCol = new TableColumn("E-mail");
        lastNameCol.setPrefWidth(100);
        lastNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("email"));

        TableView table = new TableView();
        table.getColumns().addAll(firstNameCol, lastNameCol);
        table.setItems(FXCollections.observableArrayList(
                new Person("Jacob", "Smith"),
                new Person("Isabella", "Johnson"), new Person("Isabella", "Johnson"),
                new Person("Isabella", "Johnson"), new Person("Isabella", "Johnson"),
                new Person("Isabella", "Johnson"), new Person("Isabella", "Johnson"),
                new Person("Isabella", "Johnson"), new Person("Isabella", "Johnson"),
                new Person("Isabella", "Johnson"),
                new Person("Ethan", "Williams")
        ));
        table.setPrefSize(250, 200);
        stage.setScene(new Scene(table));
        stage.show();
    }

    public static class Person {

        private String name;
        private String email;

        public Person(String name, String email) {
            this.name = name;
            this.email = email;
        }

        /**
         * @return the name
         */
        public String getName() {
            return name;
        }

        /**
         * @return the email
         */
        public String getEmail() {
            return email;
        }

    }
}
