package edu.iit.project.strategies.receipt;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DataStore;

public class PrintReceipt1 extends PrintReceipt {
    DS1 d;

    @Override
    public void printReceipt() {
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║              Receipt           ║");
        System.out.println("║                                ║");
        System.out.println("║     Litres Filled: "+d.L+"           ║");
        System.out.println("║       Total Cost: "+d.total+"            ║");
        System.out.println("╚════════════════════════════════╝");
    }
    @Override
    public void setDataStore(DataStore d){
        this.d = (DS1) d;
    };
}
