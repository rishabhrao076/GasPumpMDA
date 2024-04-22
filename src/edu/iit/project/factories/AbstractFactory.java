package edu.iit.project.factories;

import edu.iit.project.datastore.DataStore;
import edu.iit.project.strategies.storeprice.StorePrice;


public abstract class AbstractFactory {

    public abstract DataStore GetDataStore();
    public abstract StorePrice StorePrices();

    // Displays a type of payment method
    public abstract void PayMsg();

    // Stores cash from the temporary data store
    public void StoreCash() {
    }

    // Display a menu with a list of selections
    public void DisplayMenu() {
    }

    // Displays credit card not approved message
    public void RejectMsg() {
    }

    // Set the price for the gas identified by g identifier as in SelectGas(int g)
    public void SetPrice(int g) {
    }

    // Set G (or L) and total to 0
    public void SetInitialValues() {
    }

    // Disposes unit of gas and counts # of units disposed and computes Total
    public void PumpGasUnit() {
    }

    // Displays the amount of disposed gas
    public void GasPumpedMsg() {
    }

    // Print a receipt
    public void PrintReceipt() {
    }

    // Displays a cancellation message
    public void CancelMsg() {
    }

    // Returns the remaining cash
    public void ReturnCash() {
    }

    // Stores pay type t to variable w in the data store
    public void SetPayType(int t) {
    }

    // Card is ejected
    public void EjectCard() {
    }
}
