package edu.iit.project.strategies.storeprice;

import edu.iit.project.datastore.DataStore;

public abstract class StorePrice {
    // Store the base fuel price as part of initializing the Gas Pump
    public abstract void storePrice();

    public abstract void setDataStore(DataStore d);
}
