package ex03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex03Gui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 3");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    // -------------------------------------------------------------------------
    TextField txfInvestment = new TextField();
    TextField txfYears = new TextField();
    TextField txfInterest = new TextField();
    TextField txfFutureV = new TextField();

    private void initContent(GridPane pane) {
        //Pane
        pane.setGridLinesVisible(false);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        //Labels
        Label lblInvestment = new Label("Investment:");
        pane.add(lblInvestment, 0, 0);
        Label lblYears = new Label("Years:");
        pane.add(lblYears, 0, 1);
        Label lblInterest = new Label("Interest:");
        pane.add(lblInterest, 0, 2);
        Label lblFutureV = new Label("Future Value:");
        pane.add(lblFutureV, 0, 4);

        //Panes for TxtFields
        pane.add(txfInvestment, 1, 0);
        pane.add(txfYears, 1, 1);
        pane.add(txfInterest, 1, 2);
        pane.add(txfFutureV, 1, 4);

        //Button
        Button btnCalculate = new Button("Calculate");
        pane.add(btnCalculate, 1, 3);
        GridPane.setMargin(btnCalculate, new Insets(10, 10, 0, 10));
        btnCalculate.setOnAction(event -> this.futureValue());
    }
    private void futureValue(){
        int x = Integer.parseInt(txfInvestment.getText());
        int y = Integer.parseInt(txfYears.getText());
        double p = Double.parseDouble(txfInterest.getText()) / 100;

        double futureValue = x * Math.pow(1 + p, y);
        String total = String.format("%.2f", futureValue);
        txfFutureV.setText(total);
    }
}
