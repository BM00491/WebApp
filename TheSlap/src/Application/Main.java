package Application;

import Application.process.Controler;
import Application.view.Frame;
import Application.view.ViewController;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
      Frame frame = new Frame(primaryStage);
      ViewController viewController = new ViewController();
      Controler controller = new Controler(viewController);
        ViewController.setOnAction(controller);

    }


    public static void main(String[] args) {
        launch(args);
    }
}
