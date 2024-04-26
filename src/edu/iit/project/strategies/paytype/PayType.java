package edu.iit.project.strategies.paytype;

import edu.iit.project.datastore.DataStore;

public abstract class PayType {
    // Set payment method, card or cash , open for future payment methods like paypal etc.
    public void payType(int t){}
    public void setDataStore(DataStore d){

    }

}
