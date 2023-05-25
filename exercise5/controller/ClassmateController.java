package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;

import model.*;

public class ClassmateController {

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    justin just = new justin(); 
    Tim timo = new Tim();
    Sim simo = new Sim();
    lu lu = new lu();
    lance lance = new lance();
    

    public void initialize() {

        just.setName("Justin");
        just.setGender("Male");

        timo.setName("Timmothy");
        timo.setGender("Male");

        simo.setName("Simmone");
        simo.setGender("Gay");

        lu.setName("Christine");
        lu.setGender("Female");

        lance.setName("Lance tanga");
        lance.setGender("Male");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Hi I am " + just.getName() + " and my gender is " + just.getGender());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Hi I am " + timo.getName() + " and my gender is " + timo.getGender());
        }

        if (sourceButton == btn3) {
            alert.setContentText("Hi I am " + simo.getName() + " and my gender is " + simo.getGender());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Hi I am " + lu.getName() + " and my gender is " + lu.getGender());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Hi I am " + lance.getName() + " and my gender is " + lance.getGender());
        }

        alert.showAndWait();

    }
}