package edu.iit.project.strategies.paytype;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DataStore;

public class PayType1 extends PayType{
    DS1 d;
    public void payType(int t){
        d.w = t;
    }
    @Override
    public void setDataStore(DataStore d) {
        this.d = (DS1) d;
    }
}
