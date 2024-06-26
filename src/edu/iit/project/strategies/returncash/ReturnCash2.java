package edu.iit.project.strategies.returncash;

import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;

public class ReturnCash2 extends ReturnCash {
    DS2 d;

    @Override
    public void returnCash() {
        float change = d.cash - d.total;
        d.cash = 0;
        System.out.println("╔════════════════════════════════╗");
        System.out.printf("║   Change Returned: %.2f        ║\n",change);
        System.out.println("╚════════════════════════════════╝");
    }

    @Override
    public void setDataStore(DataStore d) {
        this.d = (DS2) d;
    }
}
