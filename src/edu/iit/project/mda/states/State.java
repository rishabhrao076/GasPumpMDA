package edu.iit.project.mda.states;

import edu.iit.project.mda.MDAEFSM;
import edu.iit.project.mda.OP;

public abstract class State {
    MDAEFSM m;
    OP op;

    // Initialize the State
    public State(MDAEFSM m, OP op) {
        this.m = m;
        this.op = op;
    }

    public void StorePrices() {
        // Store prices in the system
    }

    // Displays a type of payment method
    public void PayMsg() {
        // Display payment instructions
    }

    // Stores cash from the temporary data store
    public void StoreCash() {
        // Store cash received
    }

    // Display a menu with a list of selections
    public void DisplayMenu() {
        // Display menu options
    }

    // Displays credit card not approved message
    public void RejectMsg() {
        // Display credit card rejection message
    }

    // Set the price for the gas identified by g identifier as in SelectGas(int g)
    public void SetPrice(int g) {
        // Set the price for the selected gas
    }

    // Set G (or L) and total to 0
    public void SetInitialValues() {
        // Initialize gas and total to zero
    }

    // Disposes unit of gas and counts # of units disposed and computes Total
    public void PumpGasUnit() {
        // Dispense gas and calculate total
    }

    // Displays the amount of disposed gas
    public void GasPumpedMsg() {
        // Display message indicating gas pumped
    }

    // Print a receipt
    public void PrintReceipt() {
        // Print a transaction receipt
    }

    // Displays a cancellation message
    public void CancelMsg() {
        // Display cancellation message
    }

    // Returns the remaining cash
    public void ReturnCash() {
        // Return remaining cash to customer
    }

    // Stores pay type t to variable w in the data store
    public void SetPayType(int t) {
    }

    // Card is ejected
    public void EjectCard() {
        // Eject the credit card
    }

}
