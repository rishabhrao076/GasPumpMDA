package edu.iit.project.strategies.initialvalues;

import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;

public class InitialValues2 extends InitialValues {
    DS2 d;

    @Override
    public void setInitialValues() {
        d.G = 0;
        d.total = 0;
    }

    @Override
    public void setDataStore(DataStore d) {
        this.d = (DS2) d;
    }
}
