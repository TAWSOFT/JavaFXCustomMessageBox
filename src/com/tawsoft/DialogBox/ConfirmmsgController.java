/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tawsoft.DialogBox;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tawsoft
 */
public class ConfirmmsgController implements Initializable {

    @FXML
    Button btnYes;

    @FXML
    Button btnNo;

    @FXML
    Label lblbody;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        //DialogData.dOk = 0;
        //DialogData.dCancel = 0;
        lblbody.setText(DialogData.dbodyto);
        
    }

    public void onbtnYes(ActionEvent event) {

        DialogData.dOk = 1;
        DialogData.dCancel = 0;
        Stage stage = (Stage) btnYes.getScene().getWindow();
        stage.close();
        ((Node) event.getTarget()).getScene().getWindow().hide();
        youClickedWhat();
    }

    public void onbtnNo(ActionEvent event) {
        DialogData.dOk = 0;
        DialogData.dCancel = 1;
        Stage stage = (Stage) btnNo.getScene().getWindow();
        stage.close();
        ((Node) event.getTarget()).getScene().getWindow().hide();
        youClickedWhat();
    }
    
    public void youClickedWhat(){
        if(DialogData.dOk==1){
            System.out.println("you clicked ok");
        }
        else if(DialogData.dCancel==1){
              System.out.println("you clicked cancel");
        }
    }
}
