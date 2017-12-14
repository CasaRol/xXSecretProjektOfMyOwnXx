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
public class Current {
    //Amperer
    
    double amp;

    public Current() {
        this.amp = amp;
    }
    
    
    public void wattOverOhmSqrt(double watt, double ohm){
        amp = Math.sqrt(watt/ohm);
        
        System.out.println("Amps needed = " + amp);
        
    }
    
    public void wattOverVolt(double watt, double volt){
        amp = watt/volt;
        
        System.out.println("Amps needed = " + amp);
    }
    
    public double VoltOverOhm(double volt, double ohm){
        System.out.println("Method called");
        amp = volt/ohm;
        
        System.out.println("Amps needed = " + amp);
        
        return amp;
    }

    public double getAmp() {
        return amp;
    }
    
    
    
}
