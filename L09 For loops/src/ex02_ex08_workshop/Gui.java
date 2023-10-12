package ex02_ex08_workshop;

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


		int x = 16;
		int y = 80;
		int x2 = 16;
		int y2 = 160;

		for (int i = 1; i < 11; i++) {
			x = 16 + i * 16;
			y = 80 + i * -8;
			x2 = 16 + i * 16;
			y2 = 160 + i * -16;
			gc.strokeLine(x, y, x2, y2);

		}
	}
}
