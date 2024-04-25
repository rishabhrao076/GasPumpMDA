package edu.iit.project.mda.states;

import edu.iit.project.mda.MDAEFSM;
import edu.iit.project.mda.OP;

public class S6 extends State {

    public S6(OP op) {
        super(op);
    }

    @Override
    public void PrintReceipt() {
        op.PrintReceipt();
    }

    @Override
    public void ReturnCash() {
        op.ReturnCash();
    }
}
