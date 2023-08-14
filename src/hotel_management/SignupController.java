/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package hotel_management;

import com.mysql.jdbc.Connection;
import config.Config;
import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author acer
 */
public class SignupController implements Initializable {

    @FXML
    private TextField txtUserName;
    @FXML
    private TextField txtEmail;
    @FXML
    private TextField txtPhoneNumber;
    @FXML
    private PasswordField txtPassword;
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
    private void onBack(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("home_page.fxml"));
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
    private void onSignup(ActionEvent event) throws ClassNotFoundException, SQLException {
        try {
            
            String username = txtUserName.getText();
            String email = txtEmail.getText();
            String phoneNumber = txtPhoneNumber.getText();
            String password = txtPassword.getText();
            int userID = (int) (Math.random() * 10000);
            
            if(username.isEmpty()){
                txtStatus.setText("Username Can't be blank!");
            }else if(email.isEmpty()){
                txtStatus.setText("Eamil field Can't be blank!");
            }else if(phoneNumber.isEmpty()){
                txtStatus.setText("Phone Number Can't be blank!");
            }else if(password.isEmpty()){
                txtStatus.setText("Password field can't be blank!");
            }else{
                
                Connection con = Config.getConnection();
                PreparedStatement stmt = con.prepareStatement("INSERT INTO user VALUES (?,?,?,?,?)");
                stmt.setInt(1, userID);
                stmt.setString(2, username);
                stmt.setString(3, email);
                stmt.setString(4, phoneNumber);
                stmt.setString(5, password);
                stmt.executeUpdate();
                
                Parent root = FXMLLoader.load(getClass().getResource("../view/client_side.fxml"));
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
                Stage homeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                homeStage.close();
            }
            
            
            
        } catch (IOException ex) {
            Logger.getLogger(Home_pageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
