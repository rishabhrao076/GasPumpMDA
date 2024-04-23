package edu.iit.project.mda.states;

import edu.iit.project.mda.MDAEFSM;
import edu.iit.project.mda.OP;

public class S1 extends State {

    public S1(MDAEFSM m, OP op) {
        super(m, op);
    }

    @Override
    public void SetPayType(int t) {
        op.SetPayType(t);
    }

    @Override
    public void StoreCash(){
        op.StoreCash();
    }
}
