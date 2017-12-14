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
    
    
    
    
    public void volt2ndOverOhm(double volt, double ohm){
        double watt = (Math.pow(volt, 2))/ohm;
        
        
        System.out.println("Watts needed = " + watt);
        
    }
    
    public void ohmTimesAmp(double ohm, double amp){
        double watt = ohm * (Math.pow(amp, 2));
        
        
        System.out.println("Watts needed = " + watt);
    }
    
    public void voltTimesAmp(double volt, double amp){
        double watt = volt * amp;
        
        System.out.println("Watts needed = " + watt);
    }
    
}
