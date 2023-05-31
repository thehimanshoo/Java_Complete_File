/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class PolygonApplet extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Polygon polygon = new Polygon(50, 50, 150, 100, 250, 50, 200, 150, 100, 150);
        polygon.setFill(Color.BLUE);

        Pane root = new Pane();
        root.getChildren().add(polygon);

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    };

    public static void main(String[] args) {
        launch(args);
    }
}
