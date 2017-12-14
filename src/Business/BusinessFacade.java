/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Acquaintance.IBusiness;
import Acquaintance.IData;



/**
 *
 * @author Rol's studie PC
 */
public class BusinessFacade implements IBusiness {

    private IData data;
    
    Current current = new Current();
    
    @Override
    public void injectData(IData data) {
        this.data = data;
        
    }

    //Current calculation 1 (amp1)
    @Override
    public double getVoltOverOhm(double volt, double ohm) {
        Current current = new Current();
        
        return current.voltOverOhm(volt, ohm);
    }

    //Current calculation 2 (amp2)
    @Override
    public double getWattOverVolt(double watt, double volt) {
        return current.wattOverVolt(watt, volt);
    }

    //Current calculation 3 (amp3)
    @Override
    public double getWattOverOhmSqrt(double watt, double ohm) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
