package edu.iit.project.strategies.storeprice;

import edu.iit.project.datastore.DS1;

public class StorePrice1 extends StorePrice {
    public StorePrice1(DS1 d) {
        super(d);
    }
    @Override
    public void storePrice() {
        DS1 d = (DS1) this.d;
        d.price = d.temp_a;
    }
}
