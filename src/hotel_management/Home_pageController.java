/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hotel_management;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class Home_pageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onSignup(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            Stage homeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            homeStage.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Home_pageController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void onLogin(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            
            Stage homeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            homeStage.close();
        } catch (IOException ex) {
            Logger.getLogger(Home_pageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onAdmin(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("loginasAdmin.fxml"));
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
            
            Stage homeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            homeStage.close();
        } catch (IOException ex) {
            Logger.getLogger(Home_pageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
