package com.grabukm.Controller;

import java.io.IOException;

import com.grabukm.App;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainController {
    @FXML
    private Button bookingButton;
    @FXML
    private Button transactionButton;

    @FXML
    public void goSearch() throws IOException{
        App.setRoot("Search");
    }
    @FXML
    public void goTransaction() throws IOException{
        App.setRoot("Transaction");
    }
    
}
