package time;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author JWright
 */
public class ClockController implements Initializable {

    @FXML private TextField hoursTextField;
    @FXML private TextField minutesTextField;
    @FXML private TextField secondsTextField;
    
    @FXML private Button updateTimeButton;
    @FXML private Label miltaryTimeLabel;
    @FXML private Label standardTimeLabel;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        this.hoursTextField.setText("15");
        this.minutesTextField.setText("0");
        this.secondsTextField.setText("0");
    }    
    
    public void updateTimeLabels()
    {
        try
        {
            Time time = new Time(Integer.parseInt(hoursTextField.getText()),
                                 Integer.parseInt(minutesTextField.getText()),
                                 Integer.parseInt(secondsTextField.getText()));
            
            this.miltaryTimeLabel.setText(time.toMilitaryTime());
            this.standardTimeLabel.setText(time.toStandardTime());
        }
        catch (IllegalArgumentException e)
        {
            
        }
    }
    
}
