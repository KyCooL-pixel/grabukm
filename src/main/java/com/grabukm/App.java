package com.grabukm;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import com.grabukm.Model.Booking;
import com.grabukm.Model.Driver;
import com.grabukm.Model.Transaction;
import com.grabukm.Model.User;

/**
 * JavaFX App
 */
public class App extends Application {
    private static ArrayList<User> Users = new ArrayList<User>();
    private static ArrayList<Booking> Bookings = new ArrayList<Booking>();
    private static ArrayList<Driver> Drivers = new ArrayList<Driver>();
    // private static ArrayList<Transaction> Transactions = new ArrayList<Transaction>();
    static ObservableList<Transaction> Transactions = FXCollections.observableArrayList();
    private static Scene scene;

    private static Driver currentDriver;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Login"));
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void init(){
        Drivers.add(new Driver("Ethan","NCF6189","NISSAN ALMERA"));
        Drivers.add(new Driver("Ken","KFC666","PROTON SAGA"));
        Drivers.add(new Driver("Bryce","NNN777","PROTON PREVE"));
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

    public static ArrayList<User> getUsers(){
        return Users;
    }

    public static ArrayList<Booking> getBookings(){
        return Bookings;
    }

    public static Booking getCurrentBooking(){
        return Bookings.get(Bookings.size()-1);
    }

    public static Driver getRandomDriver(){
        // return a random driver for every booking
        Random rd = new Random();
        int i = rd.nextInt(Drivers.size()-1);
        return Drivers.get(i);
    }

    public static void setCurrentDriver(Driver driver){
        currentDriver = driver;
    }

	public static Driver getCurrentDriver() {
		return currentDriver;
	}

    public static ObservableList<Transaction> getTransactions(){
        return Transactions;
    }

}