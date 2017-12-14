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
                
        amp = Math.sqrt(watt/ohm);
        
        return amp;
        
    }
    
    public double wattOverVolt(double watt, double volt){
        
        amp = watt/volt;
        
        return amp;
    }
    
    public double voltOverOhm(double volt, double ohm){
        
        amp = volt/ohm;
        
        return amp;
    }    
    
}
