import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Teste extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        primaryStage.setTitle("Teste de Eventos");

        Text text = new Text("Texto");
        Button btn = new Button("OK");

        btn.setOnAction(e -> {
            System.out.println("Hello World");
        });

        Pane root = new Pane();
        Scene scene = new Scene(root, 300, 200);
        primaryStage.setScene(scene);

        text.relocate(120, 10); // Posicione o texto na coordenada (120, 10)
        btn.relocate(140, 150); // Posicione o botÃ£o na coordenada (120, 150)

        root.getChildren().addAll(text, btn);

        primaryStage.show();
        
    }
}
