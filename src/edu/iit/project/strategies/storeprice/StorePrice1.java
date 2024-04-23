package edu.iit.project.strategies.storeprice;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DataStore;

public class StorePrice1 extends StorePrice {

    DS1 d;

    @Override
    public void storePrice() {
        d.price = d.temp_a;
    }

    @Override
    public void setDataStore(DataStore d) {
        this.d = (DS1) d;
    }
}
