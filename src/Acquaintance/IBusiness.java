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
    
    
}
