package edu.iit.project.strategies.initialvalues;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DataStore;

public class InitialValues1 extends InitialValues {

    DS1 d;

    @Override
    public void setInitialValues() {
        d.L = 0;
        d.total = 0;
    }

    @Override
    public void setDataStore(DataStore d) {
        this.d = (DS1) d;
    }
}
