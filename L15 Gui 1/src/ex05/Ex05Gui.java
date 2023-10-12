package ex05;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Ex05Gui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 5");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    TextField txfName = new TextField();
    private final TextArea txaBlok = new TextArea();

    private void initContent(GridPane pane){
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setVgap(10);
        pane.setHgap(10);

        Label lblName = new Label("Name:");
        pane.add(lblName,0,0);

        pane.add(txfName,0, 1,2,1);

        Button btnAdd = new Button("Add");
        pane.add(btnAdd,1, 2);
        btnAdd.setOnAction(event -> addArea());

        pane.add(txaBlok,0,3 );
        txaBlok.setPrefRowCount(10);
        txaBlok.setPrefColumnCount(6);
        txaBlok.setEditable(false);
    }

    public String addName(){
        String x = txfName.getText();
        StringBuilder sb = new StringBuilder();
        sb.append(txaBlok + x + "\n");
        return sb.toString();
    }

    public void addArea(){
        txaBlok.setText(this.addName());
    }
    }