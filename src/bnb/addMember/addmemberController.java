/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bnb.addMember;

/**
 *
 * @author ahbe1
 */
import bnb.addMember.Adminlogin.AdminloginController;
import bnb.client;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;

public class addmemberController implements Initializable {

  
 private final static Logger LOGGER = LogManager.getLogger(addmemberController.class.getName());
    @FXML
    private JFXTextField fname;
    @FXML
    private JFXTextField lname;
    @FXML
    private JFXTextField id;
    @FXML
    private JFXTextField mobile;
    @FXML
    private JFXTextField email;
    @FXML
    private JFXTextField username;
    @FXML
    private JFXTextField pass;
    @FXML
    private JFXButton saveButton;
    @FXML
    private JFXButton cancelButton;

    private Boolean isInEditMode = false;
    @FXML
    private StackPane rootPane;
    @FXML
    private AnchorPane mainContainer;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
      //  handler = DatabaseHandler.getInstance();
    }

    @FXML
    private void cancel(ActionEvent event) {
        Stage stage = (Stage) fname.getScene().getWindow();
        stage.close();
    }

    @FXML
    private void addMember(ActionEvent event) {
        /*String mfName = fname.getText();
        String mlName = lname.getText();
        String mID = id.getText();
        String mMobile = mobile.getText();
        String mEmail = email.getText();
        String mUser = username.getText();
        String mPassword = pass.getText();*/
        closeStage();
        loadClient();

      // Boolean flag = mfName.isEmpty() ||mlName.isEmpty() || mID.isEmpty() || mMobile.isEmpty() || mUser.isEmpty() ||mPassword.isEmpty() ||mEmail.isEmpty();
       /* if (flag) {
            AlertMaker.showMaterialDialog(rootPane, mainContainer, new ArrayList<>(), "Insufficient Data", "Please enter data in all fields.");
            return;
        }

        if (DataHelper.isMemberExists(mID)) {
            AlertMaker.showMaterialDialog(rootPane, mainContainer, new ArrayList<>(), "Duplicate member id", "Member with same id exists.\nPlease use new ID");
            return;
        }

        if (isInEditMode) {
            handleUpdateMember();
            return;
        }*/

        /*client member = new client(mName, mID, mMobile, mEmail);
        boolean result = DataHelper.insertNewMember(member);
        if (result) {
            AlertMaker.showMaterialDialog(rootPane, mainContainer, new ArrayList<>(), "New member added", mName + " has been added");
            clearEntries();
        } else {
            AlertMaker.showMaterialDialog(rootPane, mainContainer, new ArrayList<>(), "Failed to add new member", "Check you entries and try again.");
        }*/
    }

   /* public void infalteUI(MemberListController.Member member) {
        name.setText(member.getName());
        id.setText(member.getId());
        id.setEditable(false);
        mobile.setText(member.getMobile());
        email.setText(member.getEmail());

        isInEditMode = Boolean.TRUE;
    }
*/
    private void clearEntries() {
        fname.clear();
        lname.clear();
        id.clear();
        mobile.clear();
        email.clear();
        username.clear();
        pass.clear();
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
    

   /* private void handleUpdateMember() {
        Member member = new MemberListController.Member(name.getText(), id.getText(), mobile.getText(), email.getText());
        if (DatabaseHandler.getInstance().updateMember(member)) {
            AlertMaker.showMaterialDialog(rootPane, mainContainer, new ArrayList<>(), "Success", "Member data updated.");
        } else {
            AlertMaker.showMaterialDialog(rootPane, mainContainer, new ArrayList<>(), "Failed", "Cant update member.");
        }
    }*/

}
