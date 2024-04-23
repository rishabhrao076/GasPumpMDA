package edu.iit.project.strategies.setprice;

import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;

public class SetPrice2 extends SetPrice {
    DS2 d;

    @Override
    public void setPrice(int g) {
        switch (g){
            case 1:{
                // Set Price of Regular
                d.price = d.Rprice;
            }
            case 2:{
                // Set Price of Diesel
                d.price = d.Dprice;
            }
            case 3:{
                // Set Price of Premium
                d.price = d.Pprice;
            }
        }
    }

    @Override
    public void setDataStore(DataStore d) {
        this.d = (DS2) d;
    }
}
