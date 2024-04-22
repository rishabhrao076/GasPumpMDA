package edu.iit.project.strategies.storeprice;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DataStore;

public abstract class StorePrice {
    protected DataStore d;

    public StorePrice(DataStore d) {
        this.d = d;
    }
    public abstract void storePrice();
}
