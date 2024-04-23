package edu.iit.project.factories;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DataStore;
import edu.iit.project.strategies.cancel.CancelMessage;
import edu.iit.project.strategies.cancel.CancelMessage1;
import edu.iit.project.strategies.displaymenu.DisplayMenu;
import edu.iit.project.strategies.displaymenu.DisplayMenu1;
import edu.iit.project.strategies.ejectcard.EjectCard;
import edu.iit.project.strategies.initialvalues.InitialValues;
import edu.iit.project.strategies.initialvalues.InitialValues1;
import edu.iit.project.strategies.paymessage.PayMessage;
import edu.iit.project.strategies.paymessage.PayMessage1;
import edu.iit.project.strategies.paytype.PayType;
import edu.iit.project.strategies.paytype.PayType1;
import edu.iit.project.strategies.pumpgas.PumpGasUnit;
import edu.iit.project.strategies.pumpgas.PumpGasUnit1;
import edu.iit.project.strategies.receipt.PrintReceipt;
import edu.iit.project.strategies.receipt.PrintReceipt1;
import edu.iit.project.strategies.rejectmessage.RejectMessage;
import edu.iit.project.strategies.rejectmessage.RejectMessage1;
import edu.iit.project.strategies.returncash.ReturnCash;
import edu.iit.project.strategies.returncash.ReturnCash1;
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
    public RejectMessage RejectMsg() {
        return new RejectMessage1();
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
    public PumpGasUnit PumpGasUnit() {
        return new PumpGasUnit1();
    }

    @Override
    public void GasPumpedMsg() {

    }

    @Override
    public PrintReceipt PrintReceipt() {
        return new PrintReceipt1();
    }

    @Override
    public CancelMessage CancelMsg() {
        return new CancelMessage1();
    }

    @Override
    public ReturnCash ReturnCash() {
        return new ReturnCash1();
    }

    @Override
    public PayType SetPayType() {
        return new PayType1();
    }

    @Override
    public EjectCard EjectCard() {
        return null;
    }
}
