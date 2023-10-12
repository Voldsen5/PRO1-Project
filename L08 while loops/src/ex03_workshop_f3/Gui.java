package ex03_workshop_f3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;



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

		int x1 = 90;
		int y1 = 20;
		int x2 = 110;
		int y2 = 20;

		while (x1 <= 20 || y1 <= 180 || x2 <= 180 || y2 <= 180) {
			gc.strokeLine(x1, y1, x2, y2);

			x1 = x1 - 10;
			x2 = x2 + 10;
			y1 = y1 + 10;
			y2 = y2 + 10;

		}
	}
}
