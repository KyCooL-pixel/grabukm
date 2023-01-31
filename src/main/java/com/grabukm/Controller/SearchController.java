package com.grabukm.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.grabukm.App;
import com.grabukm.Model.Booking;
import com.grabukm.Model.Location;
import com.grabukm.Utils.Message;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.stage.Stage;

public class SearchController {
    // private ArrayList<Location> locations = new ArrayList<Location>();
    @FXML
    Location locations = new Location();
    @FXML
    private ComboBox<String> CurrentLocation;
    @FXML
    private ComboBox<String> DestinationLocation;
    @FXML
    private Spinner<Integer> spinnerNumOfPassengers;

    @FXML
    public void initialize() {
        CurrentLocation.getItems().addAll(locations.getLocationList());
        DestinationLocation.getItems().addAll(locations.getLocationList());
    }

    // opens driver stage
    @FXML
    public void search() throws IOException {
        addToBookings();
        Scene driverScene = new Scene(loadFXML("Driver"));
        Stage driverWindow = new Stage();
        DriverController.setStage(driverWindow);
        driverWindow.setTitle("Driver");
        driverWindow.setScene(driverScene);
        driverWindow.setX(1200);
        driverWindow.show();

    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    @FXML
    private void addToBookings() {
        String curr = CurrentLocation.getValue();
        String dest = DestinationLocation.getValue();
        int num = spinnerNumOfPassengers.getValue();
        App.getBookings().add(new Booking(curr, dest, num));
    }

    @FXML
    public static void showMessage() {
        Message.showMessage("T_T", "No Driver Available At the Moment", "Please search again in a while...");

    }
}
