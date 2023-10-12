package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import model.YatzyDice;

public class YatzyGui extends Application {
    private YatzyDice dice = new YatzyDice();

    @Override
    public void start(Stage stage) {
        stage.setTitle("Yatzy");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    // -------------------------------------------------------------------------
    private final TextField[] tcg = new TextField[5];
    boolean[] hold = new boolean[dice.getValues().length];
    private final boolean[] resultsLocked = new boolean[15];
    private final TextField[] txfValues = new TextField[5];
    private final CheckBox[] cbxHolds = new CheckBox[5];
    private final TextField[] txfResults = new TextField[15];
    private final TextField txfSumSame = new TextField(), txfBonus = new TextField(),
            txfSumOther = new TextField(), txfTotal = new TextField();

    private final Button btnRoll = new Button(" Roll ");

    private void initContent(GridPane pane) {
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        // ---------------------------------------------------------------------

        GridPane dicePane = new GridPane();
        pane.add(dicePane, 0, 0);
        dicePane.setPadding(new Insets(10));
        dicePane.setHgap(10);
        dicePane.setVgap(10);
        dicePane.setStyle("-fx-border-color: black");

        for (int i = 0; i < txfValues.length; i++) {
            txfValues[i] = new TextField();
            dicePane.add(txfValues[i], i, 1);
            txfValues[i].setPrefSize(50, 50);
            txfValues[i].setStyle("-fx-font-size: 20");
            txfValues[i].setEditable(false);
        }

        for (int i = 0; i < cbxHolds.length; i++) {
            cbxHolds[i] = new CheckBox();
            dicePane.add(cbxHolds[i], i, 2);
            cbxHolds[i].setText("Hold");
        }

        dicePane.add(btnRoll, 5, 3);
        btnRoll.setOnAction(event -> rollAction());

        // ---------------------------------------------------------------------

        GridPane scorePane = new GridPane();
        pane.add(scorePane, 0, 1);
        scorePane.setPadding(new Insets(10));
        scorePane.setVgap(5);
        scorePane.setHgap(10);
        scorePane.setStyle("-fx-border-color: black");
        int w = 50; // width of the text fields

        for (int i = 0; i < txfResults.length; i++) {
            resultsLocked[i] = false;
            txfResults[i] = new TextField();
            txfResults[i].setOnMouseClicked(event -> this.mouseClicked(event));
            if (i >= 6) {
                scorePane.add(txfResults[i], 1, i + 1);
            } else {
                scorePane.add(txfResults[i], 1, i);
            }
        }

        scorePane.add(txfSumSame, 3, 5);
        scorePane.add(new Label("Sum"), 2, 5);
        txfSumSame.setEditable(false);
        txfSumSame.setMaxWidth(w);

        scorePane.add(txfBonus, 3, 6);
        scorePane.add(new Label("Bonus"), 2, 6);
        txfBonus.setEditable(false);
        txfBonus.setMaxWidth(w);

        scorePane.add(txfSumOther, 3, 15);
        scorePane.add(new Label("Sum"), 2, 15);
        txfSumOther.setEditable(false);
        txfSumOther.setMaxWidth(w);

        scorePane.add(txfTotal, 3, 16);
        scorePane.add(new Label("Total"), 2, 16);
        txfTotal.setEditable(false);
        txfTotal.setMaxWidth(w);

        String[] P = {"1-s", "2-s", "3-s", "4-s", "5-s", "6-s", " ", "One Pair", "Two Pair", "Three-same", "Four-same", "Full House", "Small Str", "Large Str", "Chance", "Yatzy"};
        for (int i = 0; i < P.length; i++) {
            scorePane.add(new Label(P[i]), 0, i);
        }
    }

    // -------------------------------------------------------------------------

    private void rollAction() {
        if (dice.getThrowCount() < 3) {
            for (int i = 0; i < hold.length; i++) {
                if (cbxHolds[i].isSelected())cbxHolds[i].setDisable(true);;
                hold[i] = cbxHolds[i].isDisabled();

            }
            dice.throwDice(hold);

            for (int i = 0; i < dice.getValues().length; i++) {
                if (!cbxHolds[i].isDisabled())
                txfValues[i].setText("" + dice.getValues()[i]);
            }
            for (int i = 0; i < txfResults.length; i++) {
                if (!resultsLocked[i]) {
                    txfResults[i].setText("" + dice.getResults()[i]);
                    txfResults[i].setBackground(Background.EMPTY);
                }
            }
            if (dice.getThrowCount() >= 3) {
                for (int i = 0; i < dice.getValues().length; i++) {
                    cbxHolds[i].setDisable(true);
                    cbxHolds[i].setSelected(false);
                }
                for (int i = 0; i < txfResults.length; i++)
                    if (!resultsLocked[i])
                        txfResults[i].setBackground(new Background(new BackgroundFill(Color.LIGHTSKYBLUE, new CornerRadii(10), Insets.EMPTY)));
                btnRoll.setDisable(true);
            }
        }
    }

    private void mouseClicked(MouseEvent event) {
        if (dice.getThrowCount() == 3) {
            TextField inp = (TextField) event.getSource();
            if (txfSumSame.getText().isEmpty()) txfSumSame.setText("0");
            if (txfSumOther.getText().isEmpty()) txfSumOther.setText("0");
            if (txfTotal.getText().isEmpty()) txfTotal.setText("0");
            if (txfBonus.getText().isEmpty()) txfBonus.setText("0");


            for (int i = 0; i < txfResults.length; i++) {
                if (!resultsLocked[i]) {
                    txfResults[i].setEditable(false);
                    txfResults[i].setBackground(Background.EMPTY);
                }
            }
            for (int i = 0; i < txfResults.length; i++) {
                if (i < 6 && inp == txfResults[i] && !resultsLocked[i]) {
                    txfSumSame.setText("" + (Integer.parseInt(txfSumSame.getText()) + Integer.parseInt(inp.getText())));
                    txfResults[i].setBackground(new Background(new BackgroundFill(Color.LIGHTSKYBLUE, new CornerRadii(10), Insets.EMPTY)));
                    resultsLocked[i] = true;
                    break;
                } else if (i >= 6 && inp == txfResults[i] && !resultsLocked[i]) {
                    txfSumOther.setText("" + (Integer.parseInt(txfSumOther.getText()) + Integer.parseInt(inp.getText())));
                    txfResults[i].setBackground(new Background(new BackgroundFill(Color.LIGHTSKYBLUE, new CornerRadii(10), Insets.EMPTY)));
                    resultsLocked[i] = true;
                    break;
                }
            }
            if (Integer.parseInt(txfSumSame.getText()) >= 63) txfBonus.setText("50");
            for (int i = 0; i < cbxHolds.length; i++) {
                txfValues[i].setText(tcg[i] + "");

            }
            txfTotal.setText("" + (Integer.parseInt(txfSumOther.getText()) + Integer.parseInt(txfSumSame.getText()) + Integer.parseInt(txfBonus.getText())));

            btnRoll.setDisable(false);
            for (int i = 0; i < 5; i++) {
                cbxHolds[i].setDisable(false);
            }
            dice.resetThrowCount();
        }

    }
}