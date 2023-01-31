package com.grabukm.Controller;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

import com.grabukm.App;
import com.grabukm.Model.Booking;
import com.grabukm.Model.Driver;
import com.grabukm.Model.Location;
import com.grabukm.Model.Transaction;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class PaymentController {
    DecimalFormat df = new DecimalFormat("0.00");
    @FXML
    private TextField totalPrice;
    @FXML
    private ComboBox<String> paymentType;
    Driver driver;
    double price;

    String[] paymentTypes = { "Cash", "Online Payment", "Debit Card" };

    @FXML
    private void initialize() {
        driver = App.getRandomDriver();
        App.setCurrentDriver(driver);
        List<String> typeLists = Arrays.asList(paymentTypes);
        paymentType.getItems().addAll(typeLists);
        // set total price
        price = Location.getPrice(App.getCurrentBooking().getCurrLocation(),
                App.getCurrentBooking().getDestLocation());
        totalPrice.setText(df.format(price));

    }

    @FXML
    private void confirmPayment() throws IOException {
        Booking curr = App.getCurrentBooking();
        App.getTransactions().add(
                new Transaction(
                        curr.getCurrLocation(),
                        curr.getDestLocation(),
                        curr.getNumOfPassengers(),
                        price,
                        driver));
        App.setRoot("Summary");
    }
}
