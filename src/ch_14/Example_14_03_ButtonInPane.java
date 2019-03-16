/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch_14;

/**
 *
 * @author Minhaz
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Example_14_03_ButtonInPane extends Application {
    

    @Override
    public void start(Stage stage) throws Exception {
        StackPane pane = new StackPane();
        pane.getChildren().add(new Button("OK"));
        Scene scene = new Scene(pane, 200,300);
        stage.setTitle("Button in a pane");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        Application.launch();
    }
}
