package edu.iit.project.factories;

import edu.iit.project.datastore.DataStore;
import edu.iit.project.strategies.displaymenu.DisplayMenu;
import edu.iit.project.strategies.initialvalues.InitialValues;
import edu.iit.project.strategies.paymessage.PayMessage;
import edu.iit.project.strategies.paytype.PayType;
import edu.iit.project.strategies.setprice.SetPrice;
import edu.iit.project.strategies.storecash.StoreCash;
import edu.iit.project.strategies.storeprice.StorePrice;


public abstract class AbstractFactory {

    public abstract DataStore GetDataStore();

    public abstract StorePrice StorePrices();

    // Displays a type of payment method
    public abstract PayMessage PayMsg();

    // Stores cash from the temporary data store
    public abstract StoreCash StoreCash();

    // Display a menu with a list of selections
    public abstract DisplayMenu DisplayMenu();

    // Displays credit card not approved message
    public abstract void RejectMsg();

    // Set the price for the gas identified by g identifier as in SelectGas(int g)
    public abstract SetPrice SetPrice();

    // Set G (or L) and total to 0
    public abstract InitialValues SetInitialValues();

    // Disposes unit of gas and counts # of units disposed and computes Total
    public abstract void PumpGasUnit();

    // Displays the amount of disposed gas
    public abstract void GasPumpedMsg();

    // Print a receipt
    public abstract void PrintReceipt();

    // Displays a cancellation message
    public abstract void CancelMsg();

    // Returns the remaining cash
    public void ReturnCash() {
    }

    // Stores pay type t to variable w in the data store
    public abstract PayType SetPayType(int t);

    // Card is ejected
    public void EjectCard() {
    }
}
