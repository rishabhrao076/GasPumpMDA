package edu.iit.project.strategies.gaspumpmessage;

import edu.iit.project.datastore.DataStore;

public abstract class GasPumpedMessage {
    public abstract void gpMsg();
    public void setDataStore(DataStore d){}
}
