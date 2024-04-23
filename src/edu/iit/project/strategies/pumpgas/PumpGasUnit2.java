package edu.iit.project.strategies.pumpgas;

import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;

public class PumpGasUnit2 extends PumpGasUnit {
    DS2 d;

    @Override
    public void pumpGas() {
        System.out.println("Trying to pump gas");
        if(d.cash >= d.price*(d.G + 1)){
            d.G += 1;
            d.total = d.price*d.G;
        }
    }

    @Override
    public void setDataStore(DataStore d) {
        this.d = (DS2) d;
    }
}
