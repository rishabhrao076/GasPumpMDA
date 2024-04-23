package edu.iit.project.strategies.storecash;

import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;

public class StoreCash2 extends StoreCash {
    DS2 d;

    @Override
    public void storeCash() {
        d.cash = d.cash + d.temp_cash;
    }
    @Override
    public void setDataStore(DataStore d) {
        this.d = (DS2) d;
    }
}
