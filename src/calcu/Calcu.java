/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcu;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author sanba
 */
public class Calcu  extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        
        stage.setResizable(false);
        stage.setTitle("Calculadora");
        
        Parent root = FXMLLoader.load(getClass().getResource("calculadora.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
 
    }



}
