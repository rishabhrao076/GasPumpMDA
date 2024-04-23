package edu.iit.project.strategies.receipt;

import edu.iit.project.datastore.DataStore;

public abstract class PrintReceipt {
    public abstract void printReceipt();
    public void setDataStore(DataStore d){}

}
