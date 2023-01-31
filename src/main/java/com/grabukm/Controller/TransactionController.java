package com.grabukm.Controller;

import java.io.IOException;

import com.grabukm.App;
import com.grabukm.Model.Transaction;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;

import javafx.util.Callback;

public class TransactionController {
    @FXML
    private ListView<Transaction> transactionView;
    @FXML
    private Button backButton;

    @FXML
    public void initialize(){
        transactionView.setCellFactory(new Callback<ListView<Transaction>,ListCell<Transaction>>() {
            public ListCell<Transaction> call(ListView<Transaction> param){
                return new TransactionCell();

                }
        });
        transactionView.setItems(App.getTransactions());
    }

    @FXML
    public void backTo() throws IOException{
        App.setRoot("main");
    }
}

