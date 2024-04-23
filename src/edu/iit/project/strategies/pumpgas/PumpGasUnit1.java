package edu.iit.project.strategies.pumpgas;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DataStore;

public class PumpGasUnit1 extends PumpGasUnit {
    DS1 d;

    public void pumpGas(){
        //Credit
        if(d.w == 1){
            d.total += d.price;
            d.L += 1;
        }// Card
        else if(d.w == 0 && d.cash >= d.price){
            d.cash -= d.price;
            d.total += d.price;
            d.L += 1;
        }
    }
    @Override
    public void setDataStore(DataStore d){
        this.d = (DS1) d;
    }

}
