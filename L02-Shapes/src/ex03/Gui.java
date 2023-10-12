package ex03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Gui extends Application {

    @Override
    public void start(Stage stage) {
        Pane root = this.initContent();
        Scene scene = new Scene(root);

        stage.setTitle("Shapes");
        stage.setScene(scene);
        stage.show();
    }

    private Pane initContent() {
        Pane pane = new Pane();
        pane.setPrefSize(400, 400);
        this.drawShapes(pane);
        return pane;
    }

    // ------------------------------------------------------------------------

    private void drawShapes(Pane pane) {
        Circle circle = new Circle(200, 200, 150);
        pane.getChildren().add(circle);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        Circle circleRight = new Circle(250, 175, 30);
        pane.getChildren().add(circleRight);
        circleRight.setFill(Color.WHITE);
        circleRight.setStroke(Color.BLACK);

        Circle circleLeft = new Circle(150, 175, 30);
        pane.getChildren().add(circleLeft);
        circleLeft.setFill(Color.WHITE);
        circleLeft.setStroke(Color.BLACK);

        Line line = new Line(100, 250, 300, 250);
        pane.getChildren().add(line);
        line.setStroke(Color.BLACK);
    }

}
