// CIS163AA 25139
// Edward Muniz
// 2020-05-06
// JavaFX MPG Calculator

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MPGCalculator.fxml"));
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

}