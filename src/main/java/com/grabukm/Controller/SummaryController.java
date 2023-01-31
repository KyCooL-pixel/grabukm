package com.grabukm.Controller;

import java.io.IOException;
import java.text.DecimalFormat;

import com.grabukm.App;
import com.grabukm.Model.Booking;
import com.grabukm.Model.Driver;
import com.grabukm.Model.Location;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class SummaryController {
    DecimalFormat df = new DecimalFormat("0.00");
    @FXML
    private TextField driverName;
    @FXML
    private TextField driverCar;
    @FXML
    private TextField driverPlateNumber;
    @FXML
    private TextField fromLocation;
    @FXML
    private TextField toLocation;
    @FXML
    private TextField numPassengers;
    @FXML
    private TextField totalPrice;
    @FXML
    private ProgressBar progressDriver;
    @FXML
    private Button okButton;

    @FXML
    private void initialize(){
        // filling driver info
        Driver driver = App.getCurrentDriver();
        driverName.setText(driver.getName());
        driverCar.setText(driver.getCar());
        driverPlateNumber.setText(driver.getPlateNumber());

        // filling booking info
        Booking booking = App.getCurrentBooking();
        fromLocation.setText(booking.getCurrLocation());
        toLocation.setText(booking.getDestLocation());
        numPassengers.setText(booking.getNumOfPassengers()+"");
        double price = Location.getPrice(booking.getCurrLocation(),booking.getDestLocation());
        totalPrice.setText(df.format(price));

        // init the progress bar and start running
        // first init a task object to keep track of progress
        Task<Void> task = new Task<Void>() {

            @Override
            protected Void call() throws Exception {
                double max = 137;
                for (int i = 0; i <= max; i++) {
                    updateProgress(i, max);
                    Thread.sleep(100);
                }
                return null;
            }
        };

        progressDriver.progressProperty().bind(task.progressProperty());

    }

    @FXML
    private void okPressed() throws IOException{
        App.setRoot("main");
    }

}
