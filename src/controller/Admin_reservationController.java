/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class Admin_reservationController implements Initializable {

    @FXML
    private BorderPane spane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void callReservation(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/reservation.fxml"));
        spane.setCenter(root);
    }

    @FXML
    private void callRoom(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/room.fxml"));
        spane.setCenter(root);
    }

    @FXML
    private void onGuest(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("../view/guest.fxml"));
        spane.setCenter(root);
    }

    @FXML
    private void onRecord(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../view/record.fxml"));
        spane.setCenter(root);
    }
    
}
