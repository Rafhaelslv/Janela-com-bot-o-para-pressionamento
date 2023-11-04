import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CapturaEvento extends Application {
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Teste de Eventos");

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Label lbltexto = new Label ("Texto");
        Button btnok = new Button("OK");

        gridPane.add(lbltexto, 12, 5);
        gridPane.add(btnok, 12, 8);

        btnok.setOnAction(e -> {
            System.out.println("Hello World");
        });

        Scene scene = new Scene(gridPane, 300, 200);

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}