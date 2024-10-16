package com.example.javafxform;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML public TextField usernameField;
    @FXML public TextField passwordField;
    @FXML public Label errorMessage;

    static  String correctUsername="admin";
    static String correctPassword="password";

    static int invalidReqCount=0;

    public  void onLoginBtnPress(){
        String username=usernameField.getText();
        String password=passwordField.getText();

        if(username.isEmpty() || password.isEmpty()){
            errorMessage.setText( "Please Provide Username or Password.");
        }
        else  if(invalidReqCount==5){
            errorMessage.setText("your limit is five, you shall be blocked");
        }
        else  if(username.equals(correctUsername) && password.equals(correctPassword)){
            errorMessage.setText("You are logged in successfully");
            invalidReqCount=0;
        }
       else {
            errorMessage.setText("Invalid credentials, attempts left: "+ (5-invalidReqCount));
            invalidReqCount++;
        }
    }
}