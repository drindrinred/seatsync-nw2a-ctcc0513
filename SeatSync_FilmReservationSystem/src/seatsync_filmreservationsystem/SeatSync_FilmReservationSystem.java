/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seatsync_filmreservationsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Iris Jewel
 */
public class SeatSync_FilmReservationSystem extends Application {
    
    private double y = 0;
    private double x = 0;
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent  root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        root.setOnMousePressed((MouseEvent event) -> {
            
            x = event.getSceneX();
            y = event.getSceneY();
            
        });
        
        root.setOnMouseDragged((MouseEvent event) -> {
            
            stage.setX(event.getScreenX()- x);
            stage.setY(event.getScreenY()- y);
            
        });
//        
        stage.initStyle(StageStyle.TRANSPARENT);

        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}