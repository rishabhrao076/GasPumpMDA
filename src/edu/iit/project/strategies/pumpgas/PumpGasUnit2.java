package edu.iit.project.strategies.pumpgas;

import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;

public class PumpGasUnit2 extends PumpGasUnit {
    DS2 d;

    @Override
    public void pumpGas(int g) {
        switch (g){
            case 1:{
                d.price = d.temp_a;
            }
            case 2:{
                d.price = d.temp_b;
            }
            case 3:{
                d.price = d.temp_c;
            }
        }
    }

    @Override
    public void setDataStore(DataStore d) {
        this.d = (DS2) d;
    }
}
