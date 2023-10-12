package ex01_ex05_workshop;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;


public class Gui extends Application {

	@Override
	public void start(Stage stage) {
		GridPane root = this.initContent();
		Scene scene = new Scene(root);

		stage.setTitle("Loops");
		stage.setScene(scene);
		stage.show();
	}

	private GridPane initContent() {
		GridPane pane = new GridPane();
		Canvas canvas = new Canvas(200, 200);
		pane.add(canvas, 0, 0);
		this.drawShapes(canvas.getGraphicsContext2D());
		return pane;
	}

	// ------------------------------------------------------------------------

	private void drawShapes(GraphicsContext gc) {

		gc.strokeLine(10, 100,180,100);
		int a = 15;
		int b = 8;

		int x = 180;
		int y = 100;

		String f = "5";
		String s = "10";
		String t = "15";

		gc.fillText(f,45,125);
		gc.fillText(s,85,125);
		gc.fillText(t,125,125);

		gc.strokeLine(x, y,x - a,y - b);
		gc.strokeLine(x,y,x - a,y + b);

		y = 95;
		int y2 = 105;
		for (int i = 1; i <20; i++){
			if (i % 5 == 0){
				y = 90;
				y2 = 110;
			x = 10 + i * 8;
				gc.strokeLine(x,y,x,y2);
			}
			else if (i % 1 == 0){
				y = 95;
				y2 = 105;
				x = 10 + i * 8;
				gc.strokeLine(x,y,x,y2);
			}
		}
	}
}
