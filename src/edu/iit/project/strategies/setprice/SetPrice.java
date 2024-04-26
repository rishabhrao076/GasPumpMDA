package edu.iit.project.strategies.setprice;

import edu.iit.project.datastore.DataStore;

public abstract class SetPrice {
    // Set the price to the price of the selected gas type
    public void setPrice(int g){}

    public void setDataStore(DataStore d){}
}
