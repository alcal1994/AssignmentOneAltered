/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f17comp1011test1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author albert
 */
public class FXMLDocumentController implements Initializable {
    
       @FXML private Label foodItemLabel;
       @FXML private TextField foodNameTextField;
       @FXML private TextField caloriesTextField;
       @FXML private TextField fatTextField;
       @FXML private TextField servingSizeTextField;
       @FXML private TextField sugarTextField;
       @FXML private TextField proteinTextField;
       
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         foodItemLabel.setText("tets");
    }    
    
    public void foodLabelButtonPressed(){
       
      
    }
    
}
