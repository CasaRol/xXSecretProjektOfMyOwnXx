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
    Resistance resistance = new Resistance();
    Power power = new Power();
    ElectromotiveForce eForce = new ElectromotiveForce();
    
    //Data layer injection
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
        return current.wattOverOhmSqrt(watt, ohm);
    }

    //Resistance calculation 1 (ohm1)
    @Override
    public double getVoltOverAmp(double volt, double amp) {
        return resistance.voltOverAmp(volt, amp);
    }

    //Resistance calculation 2 (ohm2)
    @Override
    public double getVoltOverWatt(double volt, double watt) {
        return resistance.voltOverWatt(volt, watt);
    }

    //Resistance calculation 3 (ohm3)
    @Override
    public double getWattOverAmp2nd(double watt, double amp) {
        return resistance.wattOverAmp2nd(watt, amp);
    }

    //EForce calculation 1 (volt1)
    @Override
    public double getOhmTimesAmp(double ohm, double amp) {
        return eForce.ohmTimesAmp(ohm, amp);
    }

    //EForce calculation 2 (volt2)
    @Override
    public double getWattOverAmp(double watt, double amp) {
        return eForce.wattOverAmp(watt, amp);
    }

    //EForce calculation 3 (volt3)
    @Override
    public double getOhmTimesWattSqrt(double ohm, double watt) {
        return eForce.ohmTimesWattSqwrt(ohm, watt);
    }

    //Watt calculation 1 (watt1)
    @Override
    public double getVoltTimesAmp(double volt, double amp) {
        return power.voltTimesAmp(volt, amp);
    }

    //Watt calculation 2 (watt2)
    @Override
    public double getOhmTimesAmp2nd(double ohm, double amp) {
        return power.ohmTimesAmp2nd(ohm, amp);
    }

    //Watt calculation 3 (watt3)
    @Override
    public double getVolt2ndOverOhm(double volt, double ohm) {
        return power.volt2ndOverOhm(volt, ohm);
    }
    
}
