package com.example.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController  {


    @FXML
    TextField writeMassage;

    @FXML
    TextArea sandedMassage;



    public void sendMassageBtnAction (ActionEvent actionEvent) {
       sandedMassage.appendText(writeMassage.getText()+"\n");
       writeMassage.clear();

    }

}