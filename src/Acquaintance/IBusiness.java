/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acquaintance;

/**
 *
 * @author Rol's studie PC
 */
public interface IBusiness {
    
    void injectData(IData data);
    
    double getVoltOverOhm(double volt, double ohm);
    
    double getWattOverVolt(double watt, double volt);
    
    double getWattOverOhmSqrt(double watt, double ohm);
    
    double getVoltOverAmp(double volt, double amp);
    
    double getVoltOverWatt(double volt, double watt);
    
    double getWattOverAmp2nd(double watt, double amp);
    
    double getOhmTimesAmp(double ohm, double amp);
    
    double getWattOverAmp(double watt, double amp);
    
    double getOhmTimesWattSqrt(double ohm, double watt);
    
    double getVoltTimesAmp(double volt, double amp);
    
    double getOhmTimesAmp2nd(double ohm, double amp);
    
    double getVolt2ndOverOhm(double volt, double ohm); 
    
    
    
    
}
