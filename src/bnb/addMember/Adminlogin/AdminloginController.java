package bnb.addMember.Adminlogin;

import bnb.login.*;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import bnb.settings.Preferences;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdminloginController implements Initializable {

    private final static Logger LOGGER = LogManager.getLogger(AdminloginController.class.getName());

    @FXML
    private JFXTextField username;
    @FXML
    private JFXPasswordField password;

    Preferences preference;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       preference = Preferences.getPreferences();
    }

    @FXML
    private void handleLoginButtonAction(ActionEvent event) {
        String uname = username.getText();
        String pword = DigestUtils.shaHex(password.getText());

      if (uname.equals(preference.getUsername()) && pword.equals(preference.getPassword())) {
            closeStage();
            loadMain();
            LOGGER.log(Level.INFO, "User successfully logged in {}", uname);
        }
        else {
            username.getStyleClass().add("wrong-credentials");
            password.getStyleClass().add("wrong-credentials");
        }
    }
    @FXML
    private void handleClientButtonAction(ActionEvent event) {
            closeStage();
            loadClient();
    }
    
    @FXML
    private void handleCancelButtonAction(ActionEvent event) {
        System.exit(0);
    }

    private void closeStage() {
        ((Stage) username.getScene().getWindow()).close();
    }
    void loadClient() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/bnb/login/login.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            bnb.util.utils.setStageIcon(stage);
            stage.setTitle("BnB Flights");
            stage.setScene(new Scene(parent));
            stage.show();
            bnb.util.utils.setStageIcon(stage);
        }
        catch (IOException ex) {
            LOGGER.log(Level.ERROR, "{}", ex);
        }
    }
    
    void loadMain() {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/bnb/adminMain/adminMain.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            bnb.util.utils.setStageIcon(stage);
            stage.setTitle("BnB Flights");
            stage.setScene(new Scene(parent));
            stage.show();
            bnb.util.utils.setStageIcon(stage);
        }
        catch (IOException ex) {
            LOGGER.log(Level.ERROR, "{}", ex);
        }
    }

}
