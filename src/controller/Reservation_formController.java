/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class Reservation_formController implements Initializable {

    @FXML
    private DatePicker txtFrom;
    @FXML
    private DatePicker txtTo;
    @FXML
    private ComboBox<?> txtRoomType;
    @FXML
    private TextField txtNoOfBed;
    @FXML
    private TextField txtAdult;
    @FXML
    private TextArea txtNotes;
    @FXML
    private Label txtStatus;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onBack(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("../view/client_side.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        
        Stage homeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        homeStage.close();
        
    }

    @FXML
    private void onSubmit(ActionEvent event) {
        
        LocalDate from = txtFrom.getValue();
        LocalDate to = txtTo.getValue();
        String str_from = from.toString();
        String str_to = from.toString();
        
//      String roomType = txtRoomType.getText();
        String noOfBed = txtNoOfBed.getText();
        String adult = txtAdult.getText();
        String notes = txtNotes.getText();
        
        
    }
    
}
