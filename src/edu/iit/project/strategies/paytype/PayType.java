package edu.iit.project.strategies.paytype;

import edu.iit.project.datastore.DataStore;

public abstract class PayType {
    public abstract void payType(int t);
    public void setDataStore(DataStore d){

    };

}
