package ex04;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ex04Gui extends Application {

    @Override
    public void start(Stage stage) {
        stage.setTitle("Exercise 3");
        GridPane pane = new GridPane();
        this.initContent(pane);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
    }

    TextField txfTemp = new TextField();

    private void initContent(GridPane pane){
        pane.setGridLinesVisible(true);
        pane.setPadding(new Insets(20));
        pane.setHgap(10);
        pane.setVgap(10);

        Label lblCelsius = new Label("Celsius:");
        pane.add(lblCelsius, 0,0);

        pane.add(txfTemp, 1,0);

        CheckBox checkBox = new CheckBox();
        checkBox.setText(" Fahrenheit");
        pane.add(checkBox,0,1);
        checkBox.setOnAction(event -> {
            if (checkBox.isSelected()){
                this.tempChange();
            }
        });
    }
    private void tempChange(){
        double c = Double.parseDouble(txfTemp.getText());
        double tempChange = 9/5*c + 32;
        String fahrenheit = String.format("%.2f", tempChange);
        txfTemp.setText(fahrenheit);
    }
    }