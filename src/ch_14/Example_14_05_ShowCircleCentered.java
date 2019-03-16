package ch_14;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Minhaz
 */
public class Example_14_05_ShowCircleCentered extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Pane pane = new Pane();
        
        Circle circle = new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.RED);
        
        pane.getChildren().add(circle);
        
        Scene scene = new Scene(pane, 200,200);
        stage.setTitle("Circle in center with bind property");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args){
        Application.launch();
    }
}
