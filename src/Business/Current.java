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
public class Current {
    //Amperer
    
    double amp;
    
    
    public double wattOverOhmSqrt(double watt, double ohm){
        System.out.println("Method wattOverOhmSqrt called");
        
        amp = Math.sqrt(watt/ohm);
        
        return amp;
        
    }
    
    public double wattOverVolt(double watt, double volt){
        System.out.println("Method wattOverVolt called");
        amp = watt/volt;
        
        return amp;
    }
    
    public double voltOverOhm(double volt, double ohm){
        System.out.println("Method VoltOverOhm called");
        amp = volt/ohm;
        
        return amp;
    }    
    
}
