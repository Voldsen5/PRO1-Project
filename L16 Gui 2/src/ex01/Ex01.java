package ex01;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Ex01 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 1");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final CheckBox checkBox = new CheckBox();
    private final TextField txfTitel = new TextField();
    private final TextField txfName = new TextField();
    private final ListView<String> lvwPersons = new ListView<>();
    private final ArrayList<Person> persons = new ArrayList<>();

    private void initContent(GridPane pane) {

        pane.setGridLinesVisible(false);

        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName, 0, 0);

        Label lblTitel = new Label("Titel:");
        pane.add(lblTitel, 0, 1);

        Label lblNames = new Label("Persons:");
        pane.add(lblNames, 0, 3);
        GridPane.setValignment(lblNames, VPos.TOP);

        pane.add(txfName, 1, 0);
        pane.add(txfTitel, 1,1);

        pane.add(lvwPersons, 1, 3);
        lvwPersons.setPrefWidth(200);
        lvwPersons.setPrefHeight(200);
        lvwPersons.getSelectionModel().clearSelection();

        checkBox.setText("Senior");
        pane.add(checkBox, 1, 2);
        checkBox.setOnAction(event ->{
           if (checkBox.isSelected());

        });

        Button btnaddPerson = new Button("Add Person");
        pane.add(btnaddPerson,2,2);
        btnaddPerson.setOnAction(event -> addPerson());
    }

    private void addPerson(){
        String name = txfName.getText().trim();
        String title = txfTitel.getText().trim();
        boolean senior = checkBox.isSelected();
        if (txfName != null){
           Person p = new Person(name, title, senior);
           lvwPersons.getItems().add(p.toString());
        }
    }
}
