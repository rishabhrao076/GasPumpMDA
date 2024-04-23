package edu.iit.project.mda;

import edu.iit.project.datastore.DataStore;
import edu.iit.project.factories.AbstractFactory;
import edu.iit.project.strategies.displaymenu.DisplayMenu;
import edu.iit.project.strategies.paymessage.PayMessage;
import edu.iit.project.strategies.storeprice.StorePrice;

public class OP {
    AbstractFactory af;
    DataStore d;
    StorePrice sp;
    PayMessage pm;
    DisplayMenu dm;

    public OP(AbstractFactory af, DataStore d) {
        this.af = af;
        this.d = d;
        this.sp = this.af.StorePrices();
        this.pm = this.af.PayMsg();
        this.dm = this.af.DisplayMenu();
    }

    // Stores price(s) for the gas from the temporary data store
    public void StorePrices() {
        this.sp.setDataStore(this.d);
        this.sp.storePrice();
    }

    // Displays a type of payment method
    public void PayMsg() {
        this.pm.payMsg();
    }

    // Stores cash from the temporary data store
    public void StoreCash() {
        // Implementation goes here
    }

    // Display a menu with a list of selections
    public void DisplayMenu() {
        // Implementation goes here
    }

    // Displays credit card not approved message
    public void RejectMsg() {
        // Implementation goes here
    }

    // Set the price for the gas identified by g identifier as in SelectGas(int g)
    public void SetPrice(int g) {
        // Implementation goes here
    }

    // Set G (or L) and total to 0
    public void SetInitialValues() {
        // Implementation goes here
    }

    // Disposes unit of gas and counts # of units disposed and computes Total
    public void PumpGasUnit() {
        // Implementation goes here
    }

    // Displays the amount of disposed gas
    public void GasPumpedMsg() {
        // Implementation goes here
    }

    // Print a receipt
    public void PrintReceipt() {
        // Implementation goes here
    }

    // Displays a cancellation message
    public void CancelMsg() {
        // Implementation goes here
    }

    // Returns the remaining cash
    public void ReturnCash() {
        // Implementation goes here
    }

    // Stores pay type t to variable w in the data store
    public void SetPayType(int t) {
        // Implementation goes here
    }

    // Card is ejected
    public void EjectCard() {
        // Implementation goes here
    }
}
