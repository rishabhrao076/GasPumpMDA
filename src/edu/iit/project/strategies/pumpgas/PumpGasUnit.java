package edu.iit.project.strategies.pumpgas;

import edu.iit.project.datastore.DataStore;

public abstract class PumpGasUnit {

    public abstract void pumpGas();

    public void setDataStore(DataStore d){}
}
