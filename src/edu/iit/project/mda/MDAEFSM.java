package edu.iit.project.mda;

import edu.iit.project.mda.states.*;

import java.util.ArrayList;

public class MDAEFSM {
    OP op;
    ArrayList<State> states;
    State state;

    public MDAEFSM() {
        this.op = new OP();
        this.states = new ArrayList<State>();
        this.states.add(new Start());
        this.states.add(new S1());
        this.states.add(new S2());
        this.states.add(new S3());
        this.states.add(new S4());
        this.states.add(new S5());
        this.states.add(new S6());
    }

    // Activates the gas pump
    public void Activate() {
        if (this.state != null) {
            this.state = states.get(0);
            state.StorePrices();
        }
    }

    // Starts the gas pump
    public void Start() {
        if (this.state.equals(states.get(0))) {
            state.PayMsg();
        }
    }

    // Sets the payment type (credit or cash)
    public void PayType(int t) {
        if (this.state.equals(states.get(1))) {
            // Cash
            if (t == 0) {
                state.StoreCash();
                state.DisplayMenu();
                state.SetPayType(t);
                this.state = states.get(3);
            }
            // Credit
            else if (t == 1) {
                this.state = states.get(2);
            }
        }
    }

    // Rejects the payment (credit card not approved)
    public void Reject() {
        if (this.state.equals(states.get(2))) {
            state.RejectMsg();
            state.EjectCard();
            this.state = states.get(0);
        }
    }

    // Cancels the transaction
    public void Cancel() {
        if (this.state.equals(states.get(3))) {
            state.CancelMsg();
            this.state = states.get(0);
        }
    }

    // Indicates that the credit card payment is approved
    public void Approved() {
        if (this.state.equals(states.get(2))) {
            state.DisplayMenu();
            state.SetPayType(1);
            state.EjectCard();
        }
    }

    // Starts pumping gas
    public void StartPump() {
        if (this.state.equals(states.get(4))) {
            state.SetInitialValues();
            this.state = states.get(5);
        }
    }

    // Pumps gas
    public void Pump() {
        if (this.state.equals(states.get(5))) {
            state.PumpGasUnit();
            state.GasPumpedMsg();
        }
    }

    // Stops pumping gas
    public void StopPump() {
        if (this.state.equals(states.get(5))) {
            this.state = states.get(6);
        }
    }

    // Selects the type of gas (Regular, Diesel, Premium)
    public void SelectGas(int g) {
        if (this.state.equals(states.get(3))) {
            state.SetPrice(g);
        }
    }

    // Prints a receipt
    public void Receipt() {
        if (this.state.equals(states.get(6))) {
            state.PrintReceipt();
            state.ReturnCash();
            this.state = states.get(0);
        }
    }

    // Does not print a receipt
    public void NoReceipt() {
        if (this.state.equals(states.get(6))) {
            state.ReturnCash();
            this.state = states.get(0);
        }
    }

    // Continues the transaction
    public void Continue() {
        if (this.state.equals(states.get(3))) {
            this.state = states.get(4);
        }
    }
}
