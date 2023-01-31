package com.grabukm.Controller;

import java.text.DecimalFormat;

import com.grabukm.Model.Transaction;

import javafx.scene.Node;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

class TransactionCell extends ListCell<Transaction> {
    DecimalFormat df = new DecimalFormat("0.00");

    @Override
    public void updateItem(Transaction transaction, boolean empty) {
        super.updateItem(transaction, empty);
        if (transaction != null) {
            HBox box = new HBox();
            TextField textField1 = new TextField("FROM: " + transaction.getCurrLocation());
            TextField textField2 = new TextField("TO: " + transaction.getDestLocation());
            TextField textField3 = new TextField("Price(RM): " + df.format(transaction.getPrice()));
            box.getChildren().addAll(textField1, textField2, textField3);
            textField1.setEditable(false);
            textField2.setEditable(false);
            textField3.setEditable(false);
            box.setMaxWidth(290);
            setGraphic(box);
        }
    }
}
