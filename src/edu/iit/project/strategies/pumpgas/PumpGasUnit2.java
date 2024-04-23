package edu.iit.project.strategies.pumpgas;

import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;

public class PumpGasUnit2 extends PumpGasUnit {
    DS2 d;

    @Override
    public void pumpGas() {

    }

    @Override
    public void setDataStore(DataStore d) {
        this.d = (DS2) d;
    }
}
