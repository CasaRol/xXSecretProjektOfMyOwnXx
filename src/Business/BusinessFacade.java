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
    
    @Override
    public void injectData(IData data) {
        this.data = data;
        
    }

    @Override
    public double getVoltOverOhm(double volt, double ohm) {
        Current current = new Current();
        
        return current.VoltOverOhm(volt, ohm);
    }
    
}
