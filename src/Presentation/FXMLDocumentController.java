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
import jdk.nashorn.internal.parser.TokenType;

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
    private RadioButton wattOverAmp2nd;
    @FXML
    private RadioButton ohmTimesAmp2nd;
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
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        business = UI.getInstance().getBusiness();
        
        
    }

//    private void amp1(ActionEvent event) {
//          
//        result.setText(business.getVoltOverOhm(Double.parseDouble(voltInput.getText()), Double.parseDouble(ohminput.getText())) + "");
//    }
//
//    private void amp2(ActionEvent event) {
//        
//        result.setText(business.getWattOverVolt(Double.parseDouble(wattInput.getText()), Double.parseDouble(voltInput.getText())) + "");
//    }
//
//    private void amp3(ActionEvent event) {
//        result.setText(business.getWattOverOhmSqrt(Double.parseDouble(wattInput.getText()), Double.parseDouble(ohminput.getText())) + "");
//    }
//
//    private void ohm1(ActionEvent event) {
//        result.setText(business.getVoltOverAmp(Double.parseDouble(voltInput.getText()), Double.parseDouble(ampInput.getText())) + "");
//    }
//
//    private void ohm2(ActionEvent event) {
//        result.setText(business.getVoltOverWatt(Double.parseDouble(voltInput.getText()), Double.parseDouble(wattInput.getText())) + "");
//    }
//
//    private void ohm3(ActionEvent event) {
//        result.setText(business.getWattOverAmp2nd(Double.parseDouble(wattInput.getText()), Double.parseDouble(ampInput.getText())) + "");
//    }
//
//    private void volt1(ActionEvent event) {
//        result.setText(business.getOhmTimesAmp(Double.parseDouble(ohminput.getText()), Double.parseDouble(ampInput.getText())) + "");
//    }
//
//    private void volt2(ActionEvent event) {
//        result.setText(business.getWattOverAmp(Double.parseDouble(wattInput.getText()), Double.parseDouble(ampInput.getText())) + "");
//    }
//
//    private void volt3(ActionEvent event) {
//        result.setText(business.getOhmTimesWattSqrt(Double.parseDouble(ohminput.getText()), Double.parseDouble(wattInput.getText())) + "");
//    }
//
//    private void watt1(ActionEvent event) {
//        result.setText(business.getVoltTimesAmp(Double.parseDouble(voltInput.getText()), Double.parseDouble(ampInput.getText())) + "");
//    }
//
//    private void watt2(ActionEvent event) {
//        result.setText(business.getOhmTimesAmp2nd(Double.parseDouble(ohminput.getText()), Double.parseDouble(ampInput.getText())) + "");
//    }
//
//    private void watt3(ActionEvent event) {
//        result.setText(business.getVolt2ndOverOhm(Double.parseDouble(voltInput.getText()), Double.parseDouble(ohminput.getText())) + "");
//    }
    
    @FXML
    private void showResult(ActionEvent event){
        
        if(voltOverOhm.isSelected() && voltInput != null && ohminput != null){
              result.setText(business.getVoltOverOhm(Double.parseDouble(voltInput.getText()), Double.parseDouble(ohminput.getText())) + "");          
        } else if(wattOverVolt.isSelected() && wattInput != null && voltInput != null){
            result.setText(business.getWattOverVolt(Double.parseDouble(wattInput.getText()), Double.parseDouble(voltInput.getText())) + "");
        } else if(wattOverOhmSqrt.isSelected() && wattInput != null && ohminput != null){
            result.setText(business.getWattOverOhmSqrt(Double.parseDouble(wattInput.getText()), Double.parseDouble(ohminput.getText())) + "");
        } else if(voltOverAmp.isSelected() && voltInput != null && ampInput != null){
            result.setText(business.getVoltOverAmp(Double.parseDouble(voltInput.getText()), Double.parseDouble(ampInput.getText())) + "");
        } else if(voltOverWatt.isSelected() && voltInput != null && wattInput != null){
            result.setText(business.getVoltOverWatt(Double.parseDouble(voltInput.getText()), Double.parseDouble(wattInput.getText())) + "");
        } else if(wattOverAmp2nd.isSelected() && wattInput != null && ampInput != null){
            result.setText(business.getWattOverAmp2nd(Double.parseDouble(wattInput.getText()), Double.parseDouble(ampInput.getText())) + "");
        } else if(ohmTimesAmp.isSelected() && ohminput != null && ampInput != null){
            result.setText(business.getWattOverAmp(Double.parseDouble(wattInput.getText()), Double.parseDouble(ampInput.getText())) + "");
        } else if(wattOverAmp.isSelected() && wattInput != null && ampInput != null){
            result.setText(business.getWattOverAmp(Double.parseDouble(wattInput.getText()), Double.parseDouble(ampInput.getText())) + "");
        } else if(ohmTimesWattSqrt.isSelected() && ohminput != null && wattInput != null){
            result.setText(business.getOhmTimesWattSqrt(Double.parseDouble(ohminput.getText()), Double.parseDouble(wattInput.getText())) + "");
        }else if(voltTimesAmp.isSelected() && voltInput != null && ampInput != null){
            result.setText(business.getVoltTimesAmp(Double.parseDouble(voltInput.getText()), Double.parseDouble(ampInput.getText())) + "");
        } else if(ohmTimesAmp2nd.isSelected() && ohminput != null && ampInput != null){
            result.setText(business.getOhmTimesAmp2nd(Double.parseDouble(ohminput.getText()), Double.parseDouble(ampInput.getText())) + "");
        } else if(volt2ndOverOhm.isSelected() && voltInput != null && ohminput != null){
            result.setText(business.getVolt2ndOverOhm(Double.parseDouble(voltInput.getText()), Double.parseDouble(ohminput.getText())) + "");
        } else{
            System.out.println("Please enter valid numbers and select calcualtion method");
        }
    }
    
    
    
    @FXML
    private void reset(ActionEvent event){
        wattInput.clear();
        ohminput.clear();
        ampInput.clear();
        voltInput.clear();
        result.clear();
        voltOverOhm.setSelected(false);
        wattOverVolt.setSelected(false);
        ohmTimesAmp.setSelected(false);
        volt2ndOverOhm.setSelected(false);
        wattOverOhmSqrt.setSelected(false);
        voltOverAmp.setSelected(false);
        voltOverWatt.setSelected(false);
        wattOverAmp.setSelected(false);
        ohmTimesWattSqrt.setSelected(false);
        voltTimesAmp.setSelected(false);
        wattOverAmp2nd.setSelected(false);
        ohmTimesAmp2nd.setSelected(false);
    }

}
