/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package msgbox;

import com.tawsoft.DialogBox.ConfirmmsgController;
import com.tawsoft.DialogBox.DialogData;
import com.tawsoft.DialogBox.Dialogmsg;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author tawsoft
 */
public class MainFormController implements Initializable {

    
    @FXML
    Button btnShow;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void onbtnShow(ActionEvent event) throws IOException, InterruptedException{
       
       //Dialogmsg.infomsg("Title","msgBody");
       Dialogmsg.confirmmsg("Delete");
    

    }
    
}
