import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MPGCalculatorController implements Initializable {

    @FXML
    private TextField gallonsTextField = new TextField();
    @FXML
    private TextField milesTextField = new TextField();
    @FXML
    private TextField mpgTextField = new TextField();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }

    public void calculateButtonPressed(ActionEvent event) {
        double miles = Integer.parseInt(milesTextField.getText());
        double gallons = Integer.parseInt(gallonsTextField.getText());
        double result = miles / gallons;

        mpgTextField.setText(Double.toString(result));
    }

}