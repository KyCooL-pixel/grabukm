package com.grabukm.Controller;

import java.io.IOException;

import com.grabukm.App;
import com.grabukm.Model.Booking;
import com.grabukm.Model.Driver;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DriverController {
    @FXML
    private TextField currLocation;
    @FXML
    private TextField destLocation;
    @FXML
    private TextField numPassengers;
    @FXML
    private Button AcceptButton;
    @FXML
    private Button DeclineButton;

    private static Stage stage;

    @FXML
    public void initialize(){
        Booking currBooking = App.getBookings().get(App.getBookings().size()-1);
        currLocation.setText(currBooking.getCurrLocation());
        destLocation.setText(currBooking.getDestLocation());
        numPassengers.setText(currBooking.getNumOfPassengers()+"");
    }

    @FXML
    private void acceptPressed() throws IOException{
        App.setRoot("Payment");
        stage.close();
    }

    @FXML
    private void declinePressed() throws IOException{
        SearchController.showMessage();
        stage.close();
    }

    public static void setStage(Stage thisStage){
        stage = thisStage;
    }
    
}
