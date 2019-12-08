package Application.view;

import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class Frame {
    Stage primaryStage = new Stage();
    public Frame(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("fxml/main.fxml"));

        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }
}
