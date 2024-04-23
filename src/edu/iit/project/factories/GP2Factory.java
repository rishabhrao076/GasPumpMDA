package edu.iit.project.factories;

import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;
import edu.iit.project.strategies.cancel.CancelMessage;
import edu.iit.project.strategies.cancel.CancelMessage2;
import edu.iit.project.strategies.displaymenu.DisplayMenu;
import edu.iit.project.strategies.displaymenu.DisplayMenu2;
import edu.iit.project.strategies.ejectcard.EjectCard;
import edu.iit.project.strategies.ejectcard.EjectCard2;
import edu.iit.project.strategies.gaspumpmessage.GasPumpedMessage;
import edu.iit.project.strategies.gaspumpmessage.GasPumpedMessage2;
import edu.iit.project.strategies.initialvalues.InitialValues;
import edu.iit.project.strategies.initialvalues.InitialValues2;
import edu.iit.project.strategies.paymessage.PayMessage;
import edu.iit.project.strategies.paymessage.PayMessage2;
import edu.iit.project.strategies.paytype.PayType;
import edu.iit.project.strategies.paytype.PayType2;
import edu.iit.project.strategies.pumpgas.PumpGasUnit;
import edu.iit.project.strategies.pumpgas.PumpGasUnit2;
import edu.iit.project.strategies.receipt.PrintReceipt;
import edu.iit.project.strategies.receipt.PrintReceipt2;
import edu.iit.project.strategies.rejectmessage.RejectMessage;
import edu.iit.project.strategies.rejectmessage.RejectMessage2;
import edu.iit.project.strategies.returncash.ReturnCash;
import edu.iit.project.strategies.returncash.ReturnCash2;
import edu.iit.project.strategies.setprice.SetPrice;
import edu.iit.project.strategies.setprice.SetPrice2;
import edu.iit.project.strategies.storecash.StoreCash;
import edu.iit.project.strategies.storecash.StoreCash2;
import edu.iit.project.strategies.storeprice.StorePrice;
import edu.iit.project.strategies.storeprice.StorePrice2;

public class GP2Factory extends AbstractFactory{
    @Override
    public StorePrice StorePrices() {
        return new StorePrice2();
    }

    @Override
    public DataStore GetDataStore() {
        return new DS2();
    }

    @Override
    public PayMessage PayMsg() {
        return new PayMessage2();
    }

    @Override
    public StoreCash StoreCash() {
        return new StoreCash2();
    }

    @Override
    public DisplayMenu DisplayMenu(){
        return new DisplayMenu2();
    }

    @Override
    public RejectMessage RejectMsg() {
        return new RejectMessage2();
    }

    @Override
    public SetPrice SetPrice() {
        return new SetPrice2();
    }

    @Override
    public InitialValues SetInitialValues() {
        return new InitialValues2();
    }

    @Override
    public PumpGasUnit PumpGasUnit() {
        return new PumpGasUnit2();
    }

    @Override
    public GasPumpedMessage GasPumpedMsg() {
        return new GasPumpedMessage2();
    }

    @Override
    public PrintReceipt PrintReceipt() {
        return new PrintReceipt2();
    }

    @Override
    public CancelMessage CancelMsg() {
        return new CancelMessage2();
    }

    @Override
    public ReturnCash ReturnCash() {
        return new ReturnCash2();
    }

    @Override
    public PayType SetPayType() {
        return new PayType2();
    }

    @Override
    public EjectCard EjectCard() {
        return new EjectCard2();
    }
}
