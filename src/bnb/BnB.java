/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bnb;


import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


/**
 *
 * @author ahbe1
 */
public class BnB extends Application {
    private final static Logger LOGGER = LogManager.getLogger(BnB.class.getName());
    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/bnb/login/login.fxml"));
        Stage stage = primaryStage;
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
        stage.setTitle("BnB Flights");

        

       
    }

 
    public static void main(String[] args) {
        launch(args);
    }
    
}
