package edu.iit.project.factories;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DataStore;
import edu.iit.project.strategies.storeprice.StorePrice;
import edu.iit.project.strategies.storeprice.StorePrice1;

public class GP1Factory extends AbstractFactory{
    public StorePrice StorePrices(DS1 d) {
        return new StorePrice1(d);
    }

    @Override
    public DataStore GetDataStore() {
        return new DS1();
    }

    @Override
    public StorePrice StorePrices() {
        return null;
    }

    @Override
    public void PayMsg() {

    }
}
