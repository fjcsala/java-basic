/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldjavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Fabio
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMessage;
    private Button btnMain;
    
    @FXML
    private void btnMainClick(ActionEvent event) {
        lblMessage.setText("OLÁ MUNDO!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
