package edu.iit.project.strategies.storeprice;

import edu.iit.project.datastore.DataStore;

public abstract class StorePrice {
    public abstract void storePrice();

    public abstract void setDataStore(DataStore d);
}
