package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import model.YatzyDice;

public class YatzyGui extends Application {
    private final YatzyDice dice = new YatzyDice();

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

    // Shows the hold status of the 5 dice.
    private final ToggleButton[] tbHolds = new ToggleButton[dice.getValues().length];
    private final boolean[] hold = new boolean[dice.getValues().length];
    private final Button bThrow = new Button("Roll Dice");
    private int turn = 1;
    private final Text tTurn = new Text("Turn: " + turn);
    private char[] chars = {'R','O','L','L','!'};

    // Shows the obtained results.
    // For results not set yet, the possible result of 
    // the actual face values of the 5 dice are shown.
    private final TextField[] txfResults = new TextField[15];
    private final boolean[] resultsLocked = new boolean[15];
    // Shows points in sums, bonus and total.
    private final TextField txfSumSame = new TextField(), txfBonus = new TextField(),
            txfSumOther = new TextField(), txfTotal = new TextField();

    //    private final Label lblRolled = new Label();
    //    private final Button btnRoll = new Button(" Roll ");

    private void initContent(GridPane pane) {
        // pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(10));
        pane.setHgap(10);
        pane.setVgap(10);

        // ---------------------------------------------------------------------

        GridPane dicePane = new GridPane();
        pane.add(dicePane, 0, 0);
        // dicePane.setGridLinesVisible(true);
        dicePane.setPadding(new Insets(10));
        dicePane.setHgap(10);
        dicePane.setVgap(10);
        dicePane.setStyle("-fx-border-color: black");

        // add txfValues, chbHolds, lblRolled and btnRoll
        // TODO
        int bw = 100; // width of the text fields)

        for (int i = 0; i < dice.getValues().length; i++) {
            tbHolds[i] = new ToggleButton(chars[i] + "");
            tbHolds[i].setMinSize(bw, bw);
            tbHolds[i].setMaxSize(bw, bw);
            tbHolds[i].setFont(Font.font(44));
            tbHolds[i].setDisable(true);
            dicePane.add(tbHolds[i], i,1);
        }
        bThrow.setOnAction(event -> throwDice());
        bThrow.setPrefSize(75,50);
        bThrow.setMaxWidth(Integer.MAX_VALUE);

        tTurn.setTextAlignment(TextAlignment.LEFT);
        tTurn.setFont(Font.font("", FontWeight.BOLD,20));
        HBox tTurnBox = new HBox(tTurn);
        tTurnBox.setAlignment(Pos.CENTER);

        dicePane.add(tTurnBox,1,0,3,1);
        dicePane.add(bThrow,1,2,3,1);



        // ---------------------------------------------------------------------

        GridPane scorePane = new GridPane();
        pane.add(scorePane, 0, 1);
        //scorePane.setGridLinesVisible(true);
        scorePane.setPadding(new Insets(10));
        scorePane.setVgap(5);
        scorePane.setHgap(10);
        scorePane.setStyle("-fx-border-color: black");
        int w = 50; // width of the text fields

        String[] labels = {"1-s","2-s","3-s","4-s","5-s","6-s","One Pair","Two Pairs","Three-same","Four-same","Full House","small Str.","Large Str.","Chance","Yatzy"};

        RowConstraints gridRowConst = new RowConstraints();
        gridRowConst.setMinHeight(25);
        for (int i = 0; i < txfResults.length; i++) {
            resultsLocked[i] = false;
            txfResults[i] = new TextField();
            txfResults[i].setBackground(Background.EMPTY);
            txfResults[i].setOnMouseClicked(this::mouseClicked); //   setOnAction(event -> insertValue(txfResults[i].getText()));
            txfResults[i].setEditable(false);
            txfResults[i].setMaxWidth(w);

            scorePane.add(new Label(labels[i]),0,i + (i >= 6 ? 1 : 0 ));
            scorePane.add(txfResults[i],1,i + (i >= 6 ? 1 : 0 ));
            scorePane.getRowConstraints().add(gridRowConst);
            txfResults[i].setAlignment(Pos.CENTER);
        }
        txfSumSame.setMaxWidth(w);
        txfSumSame.setEditable(false);
        txfSumSame.setAlignment(Pos.CENTER);
        txfBonus.setMaxWidth(w);
        txfBonus.setEditable(false);
        txfBonus.setAlignment(Pos.CENTER);
        txfSumOther.setMaxWidth(w);
        txfSumOther.setEditable(false);
        txfSumOther.setAlignment(Pos.CENTER);
        txfTotal.setMaxWidth(w);
        txfTotal.setEditable(false);
        txfTotal.setAlignment(Pos.CENTER);

        scorePane.add(new Label("Sum"),2,5);
        scorePane.add(new Label("Bonus"),2,6);
        scorePane.add(txfSumSame,3,5);
        scorePane.add(txfBonus,3,6);
        scorePane.add(new Label("Sum"),2,15);
        scorePane.add(new Label("TOTAL"),2,16);
        scorePane.add(txfSumOther,3,15);
        scorePane.add(txfTotal,3,16);


        // add labels for results, add txfResults,
        // add labels and text fields for sums, bonus and total.
        // TODO

    }
    // -------------------------------------------------------------------------


    private void throwDice() {
        if(dice.getThrowCount() < 3) {
            for (int i = 0; i < dice.getValues().length; i++) {
                tbHolds[i].setDisable(false);
                if (tbHolds[i].isSelected()) tbHolds[i].setDisable(true);
                hold[i] = !tbHolds[i].isDisabled();
            }

            dice.throwDice(hold);

            for (int i = 0; i < dice.getValues().length; i++)
                if (!tbHolds[i].isDisabled())
                    tbHolds[i].setText("" + dice.getValues()[i]);

            for (int i = 0; i < txfResults.length; i++) {
                if(!resultsLocked[i]) {
                    txfResults[i].setText("" + dice.getResults()[i]);
                    txfResults[i].setBackground(Background.EMPTY);
                }
            }

            if(dice.getThrowCount() >= 3) {
                for (int i = 0; i < dice.getValues().length; i++) {
                    tbHolds[i].setDisable(true);
                    tbHolds[i].setSelected(false);
                }
                int[] h = new int[15];
                for (int i = 0; i < txfResults.length; i++)
                    if(!resultsLocked[i])
                        txfResults[i].setBackground(new Background(new BackgroundFill(Color.YELLOW, new CornerRadii(10), Insets.EMPTY)));
                bThrow.setDisable(true);
            }
        }
    }

    private void mouseClicked(MouseEvent event) {
        if (dice.getThrowCount() == 3) {
            TextField input = (TextField) event.getSource();
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
                if (i < 6 && input == txfResults[i] && !resultsLocked[i]) {
                    txfSumSame.setText("" + (Integer.parseInt(txfSumSame.getText()) + Integer.parseInt(input.getText())));
                    txfResults[i].setBackground(new Background(new BackgroundFill(Color.LIMEGREEN, new CornerRadii(10), Insets.EMPTY)));
                    resultsLocked[i] = true;
                    break;
                } else if (i >= 6 && input == txfResults[i] && !resultsLocked[i]) {
                    txfSumOther.setText("" + (Integer.parseInt(txfSumOther.getText()) + Integer.parseInt(input.getText())));
                    txfResults[i].setBackground(new Background(new BackgroundFill(Color.LIMEGREEN, new CornerRadii(10), Insets.EMPTY)));
                    resultsLocked[i] = true;
                    break;
                }
            }


            if (Integer.parseInt(txfSumSame.getText()) >= 63) txfBonus.setText("50");
            for (int i = 0; i < tbHolds.length; i++)
                tbHolds[i].setText(chars[i] + "");
            txfTotal.setText("" + (Integer.parseInt(txfSumOther.getText()) + Integer.parseInt(txfSumSame.getText()) + Integer.parseInt(txfBonus.getText())));

            dice.resetThrowCount();
            turn++;

            if (turn > 15) {
                char[] charsTheSequel = {'N', 'I', 'C', 'E', '!'};
                for (int i = 0; i < tbHolds.length; i++)
                    tbHolds[i].setText(charsTheSequel[i] + "");
                Alert win = new Alert(Alert.AlertType.INFORMATION);
                win.setTitle("Total Points");
                win.setHeaderText("YOUR POINTS");
                win.setContentText("Points:" + Integer.parseInt(txfTotal.getText()));
                win.showAndWait();
            } else {
                tTurn.setText("Turn: " + turn);
                bThrow.setDisable(false);
            }
        }
    }

    // Create an action method for btnRoll's action.
    // Hint: Create small helper methods to be used in the action method.
    // TODO

    // -------------------------------------------------------------------------

    // Create a method for mouse click on one of the text fields in txfResults.
    // Hint: Create small helper methods to be used in the mouse click method.
    // TODO

}
