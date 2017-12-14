/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohmshjulcalculator;

/**
 *
 * @author Alexa
 */
public class ElectromotiveForce {
    //Volt
    
    
    public void ohmTimesWattSqwrt(double ohm, double watt){
        double volt = Math.sqrt(ohm * watt);
        
        System.out.println("Volts needed = " + volt);
    }
    
    public void wattOverAmp(double watt, double amp){
        double volt = (watt / amp);
        
        System.out.println("Volts needed = " + volt);
    }
    
    public void ohmTimesAmp(double ohm, double amp){
        double volt = ohm * amp;
        
        System.out.println("Volts needed = " + volt);
    }
    
}
