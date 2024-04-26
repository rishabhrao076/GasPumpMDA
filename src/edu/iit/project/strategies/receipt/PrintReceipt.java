package edu.iit.project.strategies.receipt;

import edu.iit.project.datastore.DataStore;

public abstract class PrintReceipt {
    // Print the receipt as per gas pump's design/requirements
    public abstract void printReceipt();
    public void setDataStore(DataStore d){}

}
