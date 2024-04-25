package edu.iit.project.mda;

import edu.iit.project.mda.states.*;

import java.util.ArrayList;

public class MDAEFSM {
    ArrayList<State> states;
    public State state;

    public MDAEFSM(OP op) {
        this.states = new ArrayList<>();
        this.states.add(new Start(this,op));
        this.states.add(new S0(this,op));
        this.states.add(new S1(this,op));
        this.states.add(new S2(this,op));
        this.states.add(new S3(this,op));
        this.states.add(new S4(this,op));
        this.states.add(new S5(this,op));
        this.states.add(new S6(this,op));
        this.state = states.get(0);
    }

    // Sets the state to input index
    public void setState(int i) {
        this.state = states.get(i);
    }

    // Activates the gas pump
    public void Activate() {
        if (this.state.equals(states.get(0))) {
            state.StorePrices();
            setState(1);
        }
    }

    // Starts the gas pump
    public void Start() {
        if (this.state.equals(states.get(1))) {
            state.PayMsg();
            setState(2);
        }
    }

    // Sets the payment type (credit or cash)
    public void PayType(int t) {
        if (this.state.equals(states.get(2))) {
            // Cash
            if (t == 0) {
                state.SetPayType(t);
                state.StoreCash();
                state.DisplayMenu();
                setState(4);
            }
            // Credit
            else if (t == 1) {
                setState(3);
            }
        }
    }

    // Rejects the payment (credit card not approved)
    public void Reject() {
        if (this.state.equals(states.get(3))) {
            state.RejectMsg();
            state.EjectCard();
            setState(1);
        }
    }

    // Cancels the transaction
    public void Cancel() {
        if (this.state.equals(states.get(4))) {
            state.CancelMsg();
            state.ReturnCash();
            setState(1);
        }
    }

    // Indicates that the credit card payment is approved
    public void Approved() {
        if (this.state.equals(states.get(3))) {
            state.SetPayType(1);
            state.EjectCard();
            state.DisplayMenu();
            setState(4);
        }
    }

    // Starts pumping gas
    public void StartPump() {
        if (this.state.equals(states.get(5))) {
            state.SetInitialValues();
            setState(6);
        }
    }

    // Pumps gas
    public void Pump() {
        if (this.state.equals(states.get(6))) {
            state.PumpGasUnit();
            state.GasPumpedMsg();
        }
    }

    // Stops pumping gas
    public void StopPump() {
        if (this.state.equals(states.get(6))) {
            setState(7);
        }
    }

    // Selects the type of gas (Regular, Diesel, Premium)
    public void SelectGas(int g) {
        if (this.state.equals(states.get(4))) {
            state.SetPrice(g);
        }
    }

    // Prints a receipt
    public void Receipt() {
        if (this.state.equals(states.get(7))) {
            state.PrintReceipt();
            state.ReturnCash();
            setState(1);
        }
    }

    // Does not print a receipt
    public void NoReceipt() {
        if (this.state.equals(states.get(7))) {
            state.ReturnCash();
            setState(1);
        }
    }

    // Continues the EFSM
    public void Continue() {
        if (this.state.equals(states.get(4))) {
            setState(5);
        }
    }
}
