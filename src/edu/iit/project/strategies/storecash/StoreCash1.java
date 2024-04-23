package edu.iit.project.strategies.storecash;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DataStore;

public class StoreCash1 extends StoreCash {

    DS1 d;

    @Override
    public void storeCash() {
        d.cash = d.cash + d.temp_c;
    }

    @Override
    public void setDataStore(DataStore d) {
        this.d = (DS1) d;
    }
}
