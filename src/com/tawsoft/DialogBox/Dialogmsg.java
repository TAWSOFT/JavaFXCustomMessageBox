/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tawsoft.DialogBox;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 *
 * @author tawsoft
 */
public class Dialogmsg {

    public static void infomsg(String title, String msgBody) throws IOException {

        DialogData.dTitle = title;
        
        DialogData.dBody = msgBody;
        AnchorPane pane = (AnchorPane) FXMLLoader.load(Dialogmsg.class.getResource("/com/tawsoft/DialogBox/info.fxml"));
        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }
    public static void confirmmsg( String msgBody) throws IOException, InterruptedException {

        
        DialogData.dbodyto= msgBody;
        AnchorPane pane = (AnchorPane) FXMLLoader.load(Dialogmsg.class.getResource("/com/tawsoft/DialogBox/confirmmsg.fxml"));
        Scene scene = new Scene(pane);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.initOwner(stage);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.requestFocus();
        stage.show();
       
        
       // return a; 

    }

    
}
