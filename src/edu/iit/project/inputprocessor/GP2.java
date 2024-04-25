package edu.iit.project.inputprocessor;

import edu.iit.project.datastore.DS2;
import edu.iit.project.datastore.DataStore;
import edu.iit.project.factories.AbstractFactory;
import edu.iit.project.mda.MDAEFSM;

public class GP2 {
    MDAEFSM m;
    DataStore d;
    AbstractFactory af;

    public GP2(MDAEFSM m, AbstractFactory af) {
        this.m = m;
        this.af = af;
        // Set the DataStore
        this.d = af.GetDataStore();
    }

    // Activate the machine with initial fuel prices
    public void Activate(float a, float b, float c) {
        // Check if all input values are greater than 0
        if ((a > 0) && (b > 0) && (c > 0)) {
            // Set the temporary values in the data store
            ((DS2) d).temp_a = a;
            ((DS2) d).temp_b = b;
            ((DS2) d).temp_c = c;
            // Activate the machine
            m.Activate();
        }
    }

    // Start the process, show the message
    public void Start() {
        // Start the machine
        m.Start();
    }

    // Cancel the transaction
    public void Cancel() {
        // Cancel the transaction
        m.Cancel();
    }

    // Pay via Cash
    public void PayCash(int c) {
        // Check if the input value 'c' is greater than 0
        if (c > 0) {
            // Set the temporary cash value in the data store
            ((DS2) d).temp_cash = c;
            // Set the payment type to cash (0)
            m.PayType(0);
        }
    }

    // Select Regular gas type
    public void Regular() {
        // Select gas type 1 (Regular)
        m.SelectGas(1);
        // Continue the process go to S4
        m.Continue();
    }

    // Select Premium gas type
    public void Premium() {
        // Select gas type 3 (Premium)
        m.SelectGas(3);
        // Continue the process go to S4
        m.Continue();
    }

    // Select Diesel gas type
    public void Diesel() {
        // Select gas type 2 (Diesel)
        m.SelectGas(2);
        // Continue the process go to S4
        m.Continue();
    }

    // Start Pumping Procedure
    public void StartPump() {
        m.StartPump();
    }

    // Pump one gallon of gas
    public void PumpGallon() {
        DS2 d = (DS2) this.d;
        // Check if its possible to pump more with current balance
        if (d.cash < d.price * (d.G + 1)) {
            m.StopPump();
        } else {
            // Pump one gallon of gas
            m.Pump();
        }
    }

    // Stop Pumping
    public void Stop() {
        m.StopPump();
    }

    // Print the receipt
    public void Receipt() {
        m.Receipt();
    }

    // Do not print the receipt
    public void NoReceipt() {
        m.NoReceipt();
    }
}
