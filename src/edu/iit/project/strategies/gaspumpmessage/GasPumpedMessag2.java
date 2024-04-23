package edu.iit.project.strategies.gaspumpmessage;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;

public class GasPumpedMessag2 extends GasPumpedMessage {
    DS2 d;
    @Override
    public void gpMsg() {
       System.out.println("Insert Cash");
    }
    public void setDataStore(DataStore d){
        this.d = (DS2) d;
    };
}
