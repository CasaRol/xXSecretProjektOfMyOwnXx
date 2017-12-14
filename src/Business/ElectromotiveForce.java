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
public class ElectromotiveForce {
    //Volt
    
    double volt;
    
    public double ohmTimesWattSqwrt(double ohm, double watt){
        volt = Math.sqrt(ohm * watt);
        
        return volt;
    }
    
    public double wattOverAmp(double watt, double amp){
        volt = (watt / amp);
        
        return volt;
    }
    
    public double ohmTimesAmp(double ohm, double amp){
        volt = ohm * amp;
        
        return volt;
    }
    
}
