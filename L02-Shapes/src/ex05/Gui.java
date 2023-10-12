package ex05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
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
        Circle circleB = new Circle(100, 175, 50);
        pane.getChildren().add(circleB);
        circleB.setFill(null);
        circleB.setStroke(Color.BLUE);
        circleB.setStrokeWidth(4);

        Circle circleY = new Circle(150, 225, 50);
        pane.getChildren().add(circleY);
        circleY.setFill(null);
        circleY.setStroke(Color.YELLOW);
        circleY.setStrokeWidth(4);

        Circle circleBL = new Circle(200,175,50);
        pane.getChildren().add(circleBL);
        circleBL.setFill(null);
        circleBL.setStroke(Color.BLACK);
        circleBL.setStrokeWidth(4);

        Circle circleR = new Circle(300,175,50);
        pane.getChildren().add(circleR);
        circleR.setFill(null);
        circleR.setStroke(Color.RED);
        circleR.setStrokeWidth(4);

        Circle circleG = new Circle(250,225,50);
        pane.getChildren().add(circleG);
        circleG.setFill(null);
        circleG.setStroke(Color.GREEN);
        circleG.setStrokeWidth(4);


    }

}
