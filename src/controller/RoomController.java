/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import config.Config;
import encapsulated.*;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class RoomController implements Initializable {

    @FXML
    private TableView<room> roomtbl;
    @FXML
    private TableColumn<room, String> roomID;
    @FXML
    private TableColumn<room, String> roomType;
    @FXML
    private TableColumn<room, String> notes;
    @FXML
    private TableColumn<room, Integer> noOfBed;
    @FXML
    private TableColumn<room, Integer> perday;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    

    @FXML
    private void onAdd(ActionEvent event) {
    }

    @FXML
    private void onEdit(ActionEvent event) {
        roomID.setCellValueFactory(new PropertyValueFactory("roomID"));
        roomType.setCellValueFactory(new PropertyValueFactory("roomType"));
        notes.setCellValueFactory(new PropertyValueFactory("notes"));
        noOfBed.setCellValueFactory(new PropertyValueFactory("noOfBed"));
        perday.setCellValueFactory(new PropertyValueFactory("price"));
        
        Connection con;
        try {
            con = Config.getConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM room");
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String roomID = rs.getString("roomID");
                String roomType = rs.getString("roomType");
                int noOfBed = rs.getInt("noOfBed");
                int prices = rs.getInt("price");
                String notes = rs.getString("notes");
                room rm = new room();
                rm.setRoomID(roomID);
                rm.setRoomType(roomType);
                rm.setPrice(prices);
                rm.setNoOfBed(noOfBed);
                roomtbl.getItems().add(rm);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RoomController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RoomController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void onDelete(ActionEvent event) {
    }
    
}
