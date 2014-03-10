/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tawsoft.DialogBox;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Dialogs;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tawsoft
 */
public class InfoController implements Initializable {

    @FXML
    Label lblTitle;

    @FXML
    Label tamsgBody;

    @FXML
    private Button btnOK;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        lblTitle.setText(DialogData.dTitle);
        tamsgBody.setText(DialogData.dBody);

    }

    /*  public InfoController(String title,String msgBody){
     lblTitle.setText(title);
     tamsgBody.setText(msgBody);
     }*/
    public void onbtnOK(ActionEvent event) {
        //System.out.println(DialogData.dTitle);
        //lblTitle.setText("");
        //tamsgBody.setText("");
        Stage stage = (Stage) btnOK.getScene().getWindow();
        stage.close();
        

    }

}
