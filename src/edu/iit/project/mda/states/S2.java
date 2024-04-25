package edu.iit.project.mda.states;

import edu.iit.project.mda.MDAEFSM;
import edu.iit.project.mda.OP;

public class S2 extends State {

    public S2(OP op) {
        super(op);
    }

    @Override
    public void DisplayMenu() {
        op.DisplayMenu();
    }

    @Override
    public void RejectMsg() {
        op.RejectMsg();
    }

    @Override
    public void EjectCard() {
        op.EjectCard();
    }

    @Override
    public void SetPayType(int t) {
        op.SetPayType(t);
    }

}
