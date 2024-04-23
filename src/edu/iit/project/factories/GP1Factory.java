package edu.iit.project.factories;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DataStore;
import edu.iit.project.strategies.displaymenu.DisplayMenu;
import edu.iit.project.strategies.displaymenu.DisplayMenu1;
import edu.iit.project.strategies.initialvalues.InitialValues;
import edu.iit.project.strategies.initialvalues.InitialValues1;
import edu.iit.project.strategies.paymessage.PayMessage;
import edu.iit.project.strategies.paymessage.PayMessage1;
import edu.iit.project.strategies.paytype.PayType;
import edu.iit.project.strategies.paytype.PayType1;
import edu.iit.project.strategies.setprice.SetPrice;
import edu.iit.project.strategies.setprice.SetPrice1;
import edu.iit.project.strategies.storecash.StoreCash;
import edu.iit.project.strategies.storecash.StoreCash1;
import edu.iit.project.strategies.storeprice.StorePrice;
import edu.iit.project.strategies.storeprice.StorePrice1;

public class GP1Factory extends AbstractFactory{
    @Override
    public StorePrice StorePrices() {
        return new StorePrice1();
    }

    @Override
    public DataStore GetDataStore() {
        return new DS1();
    }

    @Override
    public PayMessage PayMsg() {
        return new PayMessage1();
    }

    @Override
    public StoreCash StoreCash() {
        return new StoreCash1();
    }

    @Override
    public DisplayMenu DisplayMenu(){
        return new DisplayMenu1();
    }

    @Override
    public void RejectMsg() {

    }

    @Override
    public SetPrice SetPrice() {
        return new SetPrice1();
    }

    @Override
    public InitialValues SetInitialValues() {
        return new InitialValues1();
    }

    @Override
    public void PumpGasUnit() {

    }

    @Override
    public void GasPumpedMsg() {

    }

    @Override
    public void PrintReceipt() {

    }

    @Override
    public void CancelMsg() {

    }

    @Override
    public PayType SetPayType(int t) {
        return new PayType1();
    }
}
