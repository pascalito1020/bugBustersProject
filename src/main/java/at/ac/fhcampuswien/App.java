package at.ac.fhcampuswien;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

public class App extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Hello World!");
        Button btn = new Button();
        btn.setText("Hello JavaFX!");
        btn.setOnAction( (event) -> Platform.exit() );
        Pane root = new StackPane();
        root.getChildren().add(btn);
        primaryStage.setScene(new Scene(root, 300, 150));
        primaryStage.show();

        System.out.println("Hallo Adam!");
        System.out.println("Hoffentlich klappt's jetzt!!");
        System.out.println("Na wer sagt es denn");

        System.out.println("Hallo Leute, Patrick hier!");
        System.out.println("Servaaaasss Patrick!!");

    }
}
