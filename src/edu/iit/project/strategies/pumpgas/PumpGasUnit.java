package edu.iit.project.strategies.pumpgas;

import edu.iit.project.datastore.DataStore;

public abstract class PumpGasUnit {
    // Pump one unit of gas, L or G etc.
    public abstract void pumpGas();

    public void setDataStore(DataStore d){}
}
