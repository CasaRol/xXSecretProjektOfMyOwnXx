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
    
    
    public void wattOverAmp(double watt, double amp) {
        double ohm = watt/Math.pow(amp, 2);
        
        System.out.println("Ohms needed = " + ohm);
        
    }
    
    public void voltOverWatt(double volt, double watt){
        double ohm = (Math.pow(volt, 2))/watt;
        
        System.out.println("Ohms needed = " + ohm);
        
    }
    
    public void voltOverAmp(double volt, double amp){
        double ohm = volt / amp;
        
        System.out.println("ohms needed = " + ohm);
        
    }
    
}
