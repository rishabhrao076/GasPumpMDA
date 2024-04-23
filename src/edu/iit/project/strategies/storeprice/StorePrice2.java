package edu.iit.project.strategies.storeprice;

import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;

public class StorePrice2 extends StorePrice {
    DS2 d;

    @Override
    public void storePrice() {
        d.price = d.temp_a;
    }

    @Override
    public void setDataStore(DataStore d) {
        this.d = (DS2) d;
    }
}
