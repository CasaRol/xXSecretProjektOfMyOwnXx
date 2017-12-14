/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Starter;

import Acquaintance.IBusiness;
import Acquaintance.IData;
import Acquaintance.IGUI;
import Business.BusinessFacade;
import Data.DataFacade;
import Presentation.UI;

/**
 *
 * @author Rol's studie PC
 */
public class Starter {

    public static void main(String[] args) {

        IGUI gui = new UI();
        IBusiness business = new BusinessFacade();
        IData data = new DataFacade();
        business.injectData(data);
        gui.injectBusiness(business);
        
        System.out.println("Ready to start system");
        gui.startApplication(args);
        

    }

}
