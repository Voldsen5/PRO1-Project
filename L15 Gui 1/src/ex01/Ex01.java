package ex01;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex01 extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Ex01");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    private final TextField txfFirst = new TextField();
    private final TextField txfLast = new TextField();
    private final TextField txfFull = new TextField();

    private void initContent(GridPane pane) {
        // show or hide grid lines
        pane.setGridLinesVisible(false);

        // set padding of the pane
        pane.setPadding(new Insets(20));
        // set horizontal gap between components
        pane.setHgap(10);
        // set vertical gap between components
        pane.setVgap(10);

        // add a label to the pane (at col=0, row=0)
        Label lblFirst = new Label("First name:");
        pane.add(lblFirst, 0, 0);

        Label lblLast = new Label("Last name:");
        pane.add(lblLast, 1,0);

        Label lblFull = new Label("Full name:");
        pane.add(lblFull, 0, 2);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)

        pane.add(txfFirst, 0, 1);

        pane.add(txfLast, 1, 1);

        pane.add(txfFull, 0, 3,2 ,1);



        // add a button to the pane (at col=1, row=1)
        Button btnCombine = new Button("Combine");
        pane.add(btnCombine, 1, 5);
        GridPane.setMargin(btnCombine, new Insets(10, 10, 0, 10));
        btnCombine.setOnAction(event -> this.toFullName());
    }

    private void toFullName(){
        txfFull.setText(txfFirst.getText() + " " + txfLast.getText());


    }
}
