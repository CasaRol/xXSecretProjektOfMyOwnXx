/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Alexa
 */
public class Resistance {
    //Ohm
    
    double ohm;
    
    public double wattOverAmp2nd(double watt, double amp) {
        ohm = watt/Math.pow(amp, 2);
        
        return ohm;
    }
    
    public double voltOverWatt(double volt, double watt){
        ohm = (Math.pow(volt, 2))/watt;
        
        return ohm; 
    }
    
    public double voltOverAmp(double volt, double amp){
        ohm = volt / amp;
        
        return ohm;
    }
    
}
