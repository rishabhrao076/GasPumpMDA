package edu.iit.project.strategies.gaspumpmessage;

import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;

public class GasPumpedMessage2 extends GasPumpedMessage {
    DS2 d;
    @Override
    public void gpMsg() {
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║     Gallons Pumped: "+d.G+"          ║");
        System.out.println("╚════════════════════════════════╝");
    }
    public void setDataStore(DataStore d){
        this.d = (DS2) d;
    }
}
