package edu.iit.project.strategies.receipt;

import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;

public class PrintReceipt2 extends PrintReceipt {
    DS2 d;
    @Override
    public void printReceipt() {
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║              Receipt           ║");
        System.out.println("║                                ║");
        System.out.println("║      Gallons Filled: "+d.G+"         ║");
        System.out.printf("║       Total Cost: %.2f         ║\n",d.total);
        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void setDataStore(DataStore d){
        this.d = (DS2) d;
    }
}
