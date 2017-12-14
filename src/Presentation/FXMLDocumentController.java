/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Acquaintance.IBusiness;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import Business.Current;
import Business.ElectromotiveForce;
import Business.Power;
import Business.Resistance;

/**
 *
 * @author Alexa
 */
public class FXMLDocumentController implements Initializable {
    
    private IBusiness business;

    private Power power;
    private Current current;
    private ElectromotiveForce eForce;
    private Resistance resistance;

    private double calcualtedResult;

    private Label label;
    @FXML
    private RadioButton ohmTimesAmp;
    @FXML
    private RadioButton volt2ndOverOhm;
    @FXML
    private RadioButton voltOverOhm;
    @FXML
    private RadioButton wattOverVolt;
    @FXML
    private RadioButton wattOverOhmSqrt;
    @FXML
    private RadioButton voltOverAmp;
    @FXML
    private RadioButton voltOverWatt;
    @FXML
    private RadioButton wattOverAmp;
    @FXML
    private RadioButton ohmTimesWattSqrt;
    @FXML
    private RadioButton voltTimesAmp;
    @FXML
    private ToggleGroup selectOption;
    @FXML
    private TextField wattInput;
    @FXML
    private TextField voltInput;
    @FXML
    private TextField ampInput;
    @FXML
    private TextField result;
    @FXML
    private Button clearButton;
    @FXML
    private TextField ohminput;
    @FXML
    private Button calculate;
    @FXML
    private RadioButton wattOverAmp2nd;
    @FXML
    private RadioButton ohmTimesAmp2nd;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        business = UI.getInstance().getBusiness();
        
        
    }

    @FXML
    private void amp1(ActionEvent event) {
          
        result.setText(business.getVoltOverOhm(Double.parseDouble(voltInput.getText()), Double.parseDouble(ohminput.getText())) + "");
    }

    @FXML
    private void amp2(ActionEvent event) {
        
        result.setText(business.getWattOverVolt(Double.parseDouble(wattInput.getText()), Double.parseDouble(voltInput.getText())) + "");
    }

    @FXML
    private void amp3(ActionEvent event) {
        result.setText(business.getWattOverOhmSqrt(Double.parseDouble(wattInput.getText()), Double.parseDouble(ohminput.getText())) + "");
    }

    @FXML
    private void ohm1(ActionEvent event) {
        result.setText(business.getVoltOverAmp(Double.parseDouble(voltInput.getText()), Double.parseDouble(ampInput.getText())) + "");
    }

    @FXML
    private void ohm2(ActionEvent event) {
        result.setText(business.getVoltOverWatt(Double.parseDouble(voltInput.getText()), Double.parseDouble(wattInput.getText())) + "");
    }

    @FXML
    private void ohm3(ActionEvent event) {
        result.setText(business.getWattOverAmp2nd(Double.parseDouble(wattInput.getText()), Double.parseDouble(ampInput.getText())) + "");
    }

    @FXML
    private void volt1(ActionEvent event) {
        result.setText(business.getOhmTimesAmp(Double.parseDouble(ohminput.getText()), Double.parseDouble(ampInput.getText())) + "");
    }

    @FXML
    private void volt2(ActionEvent event) {
        result.setText(business.getWattOverAmp(Double.parseDouble(wattInput.getText()), Double.parseDouble(ampInput.getText())) + "");
    }

    @FXML
    private void volt3(ActionEvent event) {
        result.setText(business.getOhmTimesWattSqrt(Double.parseDouble(ohminput.getText()), Double.parseDouble(wattInput.getText())) + "");
    }

    @FXML
    private void watt1(ActionEvent event) {
        result.setText(business.getVoltTimesAmp(Double.parseDouble(voltInput.getText()), Double.parseDouble(ampInput.getText())) + "");
    }

    @FXML
    private void watt2(ActionEvent event) {
        result.setText(business.getOhmTimesAmp2nd(Double.parseDouble(ohminput.getText()), Double.parseDouble(ampInput.getText())) + "");
    }

    @FXML
    private void watt3(ActionEvent event) {
        result.setText(business.getVolt2ndOverOhm(Double.parseDouble(voltInput.getText()), Double.parseDouble(ohminput.getText())) + "");
    }
    
//    @FXML
//    private void showResult(ActionEvent event){
//        System.out.println("showResult called");
//        if(voltOverOhm.isSelected()){
//            System.out.println("If called true");
//            double test = current.VoltOverOhm(50, 25);
//            result.setText(test + "");
//        } else System.out.println("Nullpointer");
//    }
    
    private void calculate(){
        if(wattInput != null && voltInput != null){
            wattOverVolt.setVisible(true);
        }
    }
    
    @FXML
    private void reset(ActionEvent event){
        wattInput.clear();
        ohminput.clear();
        ampInput.clear();
        voltInput.clear();
        result.clear();
    }

}
