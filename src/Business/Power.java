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
public class Power {
    //Watt
    
    double watt;
    
    
    public double volt2ndOverOhm(double volt, double ohm){
        watt = (Math.pow(volt, 2))/ohm;
        
        
        return watt;
        
    }
    
    public double ohmTimesAmp2nd(double ohm, double amp){
        watt = ohm * (Math.pow(amp, 2));
        
        
        return watt;
    }
    
    public double voltTimesAmp(double volt, double amp){
        watt = volt * amp;
        
        return watt;
    }
    
}
