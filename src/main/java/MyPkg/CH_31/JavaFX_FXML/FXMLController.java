/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPkg.CH_31.JavaFX_FXML;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class FXMLController {
    @FXML
    private Label lblText;
    

    public void handleOnClick(){
        System.out.println("You clicked me!!");
        lblText.setText("You clicked me!!");
    }
}