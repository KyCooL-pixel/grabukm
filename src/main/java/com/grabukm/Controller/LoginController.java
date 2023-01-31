package com.grabukm.Controller;

import java.io.IOException;

import com.grabukm.App;
import com.grabukm.Model.User;
import com.grabukm.Utils.Message;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField userName;
    @FXML
    private TextField password;

    @FXML
    private void signUp() throws IOException {
        String userNameValue = userName.getText();
        String passwordValue = password.getText();
        App.getUsers().add(new User(userNameValue, passwordValue));
    }

    @FXML
    private boolean validate(String userNameValue, String passwordValue) {
        for (User user : App.getUsers()) {
            if (user.getuserName().equals(userNameValue) && user.getPassword().equals(passwordValue))
                return true;
        }
        return false;
    }

    @FXML
    private void signIn() throws IOException {
        String userNameValue = userName.getText();
        String passwordValue = password.getText();
        if (validate(userNameValue, passwordValue))
            App.setRoot("main");
        else {
            Message.showMessage("ERROR", "Wrong Credentials", "Please sign up if you are a new user!!!");
        }
    }

}