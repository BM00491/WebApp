package Application.view;

import Application.process.ActionListener;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ViewController implements Initializable {
    private static ActionListener ActionListener ;
    @FXML private  AnchorPane openPane ;
    @FXML private  AnchorPane loginPane ;
    @FXML private  AnchorPane mainPane ;


    public static void setOnAction(ActionListener ActionListener) {
        ViewController.ActionListener =ActionListener ;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loginPane.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            System.out.println("login............checking");
            loginPane.setVisible(false);openPane.setVisible(true);

        });
        openPane.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            System.out.println("open............checking");
            loginPane.setVisible(true);openPane.setVisible(false);

        });

    }




}
