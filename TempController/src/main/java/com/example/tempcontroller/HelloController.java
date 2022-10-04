package com.example.tempcontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {
    public ArrayList<Double> temperaturer = new ArrayList<>() ;

    @FXML
    private Label lblResultat;
    @FXML
    private TextField txtTemperatur;
    @FXML
    void nullstill(ActionEvent event) {
        temperaturer.clear();
        lblResultat.setText("");
        txtTemperatur.setText("");

    }
    @FXML
    void registrer(ActionEvent event) {
        double sum, snitt, antall;
        lblResultat.setText("");
        try{
            String innTemperatur = lblResultat.getText();
            double temperatur = Double.parseDouble(innTemperatur);
            temperaturer.add(temperatur);

            sum = 0;
            antall = 0;
            for(double temperatur1 : temperaturer) {
                sum += temperatur1;
                antall++;
            }
            snitt = (double) sum / antall;
            lblResultat.setText(String.valueOf(snitt));
        }
        catch(Exception e) {
            lblResultat.setText("Ikke et gyldig tall, skriv inn heltall");
        }

    }
}