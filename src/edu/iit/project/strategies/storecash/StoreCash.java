package edu.iit.project.strategies.storecash;

import edu.iit.project.datastore.DataStore;

public abstract class StoreCash {
    public abstract void storeCash();

    public abstract void setDataStore(DataStore d);
}
