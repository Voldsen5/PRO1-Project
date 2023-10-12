package ex02;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex02GUI extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("ex02");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------

    TextField txfNumber = new TextField();

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
        Label lblName = new Label("Number:");
        pane.add(lblName, 0, 1);

        // add a text field to the pane (at col=1, row=0, extending 2 columns and 1 row)
        pane.add(txfNumber, 1, 1, 1, 1);

        // add a button to the pane (at col=1, row=1)
        Button btnIncrement = new Button("Inc");
        pane.add(btnIncrement, 2, 1);
        GridPane.setMargin(btnIncrement, new Insets(10, 10, 0, 10));
        btnIncrement.setOnAction(event -> this.Increment());

        // add a button to the pane (at col=2, row=1)
        Button btnDecrement = new Button("Dec");
        pane.add(btnDecrement, 2, 2);
        GridPane.setMargin(btnDecrement, new Insets(10, 10, 0, 10));
        btnDecrement.setOnAction(event -> this.Decrement());
    }
    private void Increment(){
        int x = Integer.parseInt(txfNumber.getText());
        txfNumber.setText(String.valueOf(x + 1));
    }

    private void Decrement(){
        int x = Integer.parseInt(txfNumber.getText());
        txfNumber.setText(String.valueOf(x - 1));

    }
}
