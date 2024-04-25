package edu.iit.project.inputprocessor;

import edu.iit.project.datastore.DS1;
import edu.iit.project.datastore.DataStore;
import edu.iit.project.factories.AbstractFactory;
import edu.iit.project.mda.MDAEFSM;

public class GP1 {
    MDAEFSM m;
    DataStore d;
    AbstractFactory af;

    public GP1(MDAEFSM m, AbstractFactory af) {
        this.m = m;
        this.af = af;
        this.d = af.GetDataStore();
    }

    //Initialize initial fuel prices
    public void Activate(int a) {
        // Check if the input value 'a' is greater than 0
        if (a > 0) {
            // Set the temporary value 'a' in the data store
            ((DS1) d).temp_a = a;
            // Activate the machine
            m.Activate();
        } else {
            // Print an error message if 'a' is not greater than 0
            System.out.println("Enter value for a > 0");
        }
    }

    // Start the process, show the message
    public void Start() {
        // Start the machine
        m.Start();
    }

    // Pay via Credit
    public void PayCredit() {
        // Set the payment type to credit (1)
        m.PayType(1);
    }

    // Show Card Rejection message
    public void Reject() {
        // Reject the payment
        m.Reject();
    }

    // Cancel the transaction
    public void cancel() {
        // Cancel the transaction
        m.Cancel();
    }

    // Show the Card Approval message and other relevant actions
    public void Approved() {
        // Approve the payment
        m.Approved();
    }

    // Pay via Cash
    public void PayCash(int c) {
        // Check if the input value 'c' is greater than 0
        if (c > 0) {
            // Set the temporary value 'c' in the data store
            ((DS1) d).temp_c = c;
            // Set the payment type to cash (0)
            m.PayType(0);
        }
    }

    // Start Pumping Procedure
    public void StartPump() {
        // Continue the process
        m.Continue();
        // Start pumping
        m.StartPump();
    }

    // Pump one unit of gas
    public void Pump() {
        // Cast the data store to DS1
        DS1 d = (DS1) this.d;

        // Check the value of 'w' in the data store
        if (d.w == 1) {
            // Pump one unit of gas
            m.Pump();
        } else if (d.w == 0 && d.cash < d.price * (d.L + 1)) {
            // Check if its possible to pump more with current balance
            this.StopPump();
        } else {
            // Pump one unit of gas
            m.Pump();
        }
    }

    // Stop Pumping and show the receipt
    public void StopPump() {
        // Stop pumping
        m.StopPump();
        // Print the receipt
        m.Receipt();
    }
}
