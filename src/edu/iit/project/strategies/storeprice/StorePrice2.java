package edu.iit.project.strategies.storeprice;

import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;

public class StorePrice2 extends StorePrice {
    DS2 d;

    @Override
    public void storePrice() {
        d.Rprice = d.temp_a;
        d.Pprice = d.temp_b;
        d.Dprice = d.temp_c;
    }

    @Override
    public void setDataStore(DataStore d) {
        this.d = (DS2) d;
    }
}
