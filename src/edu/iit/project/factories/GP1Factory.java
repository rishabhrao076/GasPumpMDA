package edu.iit.project.factories;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DataStore;
import edu.iit.project.strategies.paymessage.PayMessage;
import edu.iit.project.strategies.paymessage.PayMessage1;
import edu.iit.project.strategies.storeprice.StorePrice;
import edu.iit.project.strategies.storeprice.StorePrice1;

public class GP1Factory extends AbstractFactory{
    @Override
    public StorePrice StorePrices() {
        return new StorePrice1();
    }

    @Override
    public DataStore GetDataStore() {
        return new DS1();
    }

    @Override
    public PayMessage PayMsg() {
        return new PayMessage1();
    }
}
