package edu.iit.project.mda;

import edu.iit.project.datastore.DataStore;
import edu.iit.project.factories.AbstractFactory;
import edu.iit.project.strategies.cancel.CancelMessage;
import edu.iit.project.strategies.displaymenu.DisplayMenu;
import edu.iit.project.strategies.ejectcard.EjectCard;
import edu.iit.project.strategies.gaspumpmessage.GasPumpedMessage;
import edu.iit.project.strategies.initialvalues.InitialValues;
import edu.iit.project.strategies.paymessage.PayMessage;
import edu.iit.project.strategies.paytype.PayType;
import edu.iit.project.strategies.pumpgas.PumpGasUnit;
import edu.iit.project.strategies.receipt.PrintReceipt;
import edu.iit.project.strategies.rejectmessage.RejectMessage;
import edu.iit.project.strategies.returncash.ReturnCash;
import edu.iit.project.strategies.setprice.SetPrice;
import edu.iit.project.strategies.storecash.StoreCash;
import edu.iit.project.strategies.storeprice.StorePrice;

public class OP {
    AbstractFactory af;
    StorePrice sp;
    PayMessage pm;
    DisplayMenu dm;
    StoreCash sc;
    SetPrice setP;
    InitialValues init;

    PayType pt;
    EjectCard ej;

    PrintReceipt rec;

    CancelMessage can;
    RejectMessage rej;
    PumpGasUnit pum;

    ReturnCash ret;

    GasPumpedMessage gpm;

    public OP(AbstractFactory af) {
        this.af = af;
        this.sp = this.af.StorePrices();
        this.pm = this.af.PayMsg();
        this.dm = this.af.DisplayMenu();
        this.sc = this.af.StoreCash();
        this.setP = this.af.SetPrice();
        this.init = this.af.SetInitialValues();
        this.pt = this.af.SetPayType();
        this.rec = this.af.PrintReceipt();
        this.can = this.af.CancelMsg();
        this.ej = this.af.EjectCard();
        this.rej = this.af.RejectMsg();
        this.pum = this.af.PumpGasUnit();
        this.ret = this.af.ReturnCash();
        this.gpm = this.af.GasPumpedMsg();
    }

    // Stores price(s) for the gas from the temporary data store
    public void StorePrices() {
        this.sp.storePrice();
    }

    // Displays a type of payment method
    public void PayMsg() {
        this.pm.payMsg();
    }

    // Stores cash from the temporary data store
    public void StoreCash() {
        this.sc.storeCash();
    }

    // Display a menu with a list of selections
    public void DisplayMenu() {
        this.dm.displayMenu();
    }

    // Displays credit card not approved message
    public void RejectMsg() {
        this.rej.rejectMsg();
    }

    // Set the price for the gas identified by g identifier as in SelectGas(int g)
    public void SetPrice(int g) {
        this.setP.setPrice(g);
    }

    // Set G (or L) and total to 0
    public void SetInitialValues() {
        this.init.setInitialValues();
    }

    // Disposes unit of gas and counts # of units disposed and computes Total
    public void PumpGasUnit() {
        this.pum.pumpGas();
    }

    // Displays the amount of disposed gas
    public void GasPumpedMsg() {
        gpm.gpMsg();
    }

    // Print a receipt
    public void PrintReceipt() {
        this.rec.printReceipt();
    }

    // Displays a cancellation message
    public void CancelMsg() {
        this.can.cancelMessage();
    }

    // Returns the remaining cash
    public void ReturnCash() {
        ret.returnCash();
    }

    // Stores pay type t to variable w in the data store
    public void SetPayType(int t) {
        this.pt.payType(t);
    }

    // Card is ejected
    public void EjectCard() {
        this.ej.ejectCard();
    }
}
