import javafx.fxml.Initializable;
import java.net.URL;
import java.util.ResourceBundle;

public class MPGCalculatorController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("View is now loaded!");
    }

    public void calculateButtonPressed() {
        System.out.println("hello");
    }

}