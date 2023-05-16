import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;

public class LoginController {
    
    @FXML
    TextField myTextField;

    @FXML
    PasswordField myPasswordField;

    @FXML
    Button myButton;

    public void login(ActionEvent event) throws IOException {

        String username = myTextField.getText();
        String password = myPasswordField.getText();

        System.out.println(username);
        System.out.println(password);

        if (username.equals("juls") && password.equals("123456")) {
            Parent root = FXMLLoader.load(getClass().getResource("Scene.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();

        }
    }
}
