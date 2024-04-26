package edu.iit.project.strategies.initialvalues;

import edu.iit.project.datastore.DataStore;

public abstract class InitialValues {
    // Set 0 to pumped gas units and total cost.
    public abstract void setInitialValues();

    public abstract void setDataStore(DataStore d);
}
