package edu.iit.project.strategies.gaspumpmessage;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DataStore;

public class GasPumpedMessage1 extends GasPumpedMessage {
    DS1 d;
    @Override
    public void gpMsg() {
        System.out.println("Choose Payment Method");
        System.out.println("1. Pay by Cash");
        System.out.println("2. Pay by Credit");
    }
    public void setDataStore(DataStore d){
        this.d = (DS1) d;
    };

}
