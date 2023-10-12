package ex06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
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

        Rectangle rectangleSky = new Rectangle(0, 0, 400, 400);
        pane.getChildren().add(rectangleSky);
        rectangleSky.setFill(Color.LIGHTSKYBLUE);

        Rectangle rectangleGrass = new Rectangle(0, 300, 400, 300);
        pane.getChildren().add(rectangleGrass);
        rectangleGrass.setFill(Color.GREEN);

        Circle circle = new Circle(300, 70, 50);
        pane.getChildren().add(circle);
        circle.setFill(Color.YELLOW);
        circle.setStroke(Color.BLACK);

        Rectangle rectangle = new Rectangle(50, 150, 150, 150);
        pane.getChildren().add(rectangle);
        rectangle.setFill(Color.RED);
        rectangle.setStroke(Color.RED);

        Polygon polygon = new Polygon(50, 150, 200, 150, 130, 100);
        pane.getChildren().add(polygon);
        polygon.setFill(Color.GREEN);

        Line line = new Line(0, 300, 400, 300);
        pane.getChildren().add(line);
        line.setFill(Color.BLACK);
        line.setStrokeWidth(3);

        Rectangle rectangleDoor = new Rectangle(75, 200, 50, 100);
        pane.getChildren().add(rectangleDoor);
        rectangleDoor.setFill(Color.BROWN);

        Rectangle rectangleWindow = new Rectangle(150, 200, 30, 50);
        pane.getChildren().add(rectangleWindow);
        rectangleWindow.setFill(Color.WHITE);

        Text text = new Text(80, 180, "Kiosk");
        pane.getChildren().add(text);
        text.setFill(Color.BLACK);


    }

}
