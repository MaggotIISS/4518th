/*
 To change this license header, choose License Headers in Project Properties.
 To change this template file, choose Tools | Templates
 and open the template in the editor.
 */
package pkg4518th;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**

 @author Mark Ferguson
 */
public class Main extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    Parent root;
//    root = FXMLLoader.load(getClass().getResource("4518th.fxml"));
    root = FXMLLoader.load(getClass().getResource("old4518th.fxml"));
    Scene scene = new Scene(root);

    stage.setTitle("Chain of Command");
    stage.setX(100);
    stage.setY(0);
    stage.setScene(scene);
    stage.show();
  }

  /**
   @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }

}
