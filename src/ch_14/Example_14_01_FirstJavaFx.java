package ch_14;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minhaz
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
public class Example_14_01_FirstJavaFx extends Application {

    @Override
    public void start(Stage primaryStage){
        Button btnOk = new Button("Ok");
        Scene scene = new Scene(btnOk, 200,250);
        primaryStage.setTitle("First java fx");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch();
    }
    
}
