package edu.iit.project.strategies.gaspumpmessage;

import edu.iit.project.datastore.DataStore;

public abstract class GasPumpedMessage {
    // Display Unique message upon pumping of one unit of Gas
    public abstract void gpMsg();
    public void setDataStore(DataStore d){}
}
