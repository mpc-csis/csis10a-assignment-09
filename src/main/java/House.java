import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

public class House extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void draw(GraphicsContext g) {
        // draw a blue circle
        Rectangle box = new Rectangle(100, 100, 30, 30);
        g.setFill(Color.BLUE);
        g.fillOval(box.getX(), box.getY(), box.getWidth(), box.getHeight());

        // Replace the above statements with code that draws an image of a house.

    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle(getClass().getSimpleName());
        BorderPane pane = new BorderPane();
        Canvas canvas = new Canvas(700, 500);
        pane.setCenter(canvas);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();
        graphicsContext.setFill(Color.GRAY);
        draw(graphicsContext);  // This is our custom method
        stage.setScene(new Scene(pane));
        stage.show();
    }
}