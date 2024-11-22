/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.awt.Button;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Aline
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private AnchorPane lblmensage;
    @FXML
    private javafx.scene.control.Button btnClick;
    @FXML
    private Label texto;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        texto.setText("hello word");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
