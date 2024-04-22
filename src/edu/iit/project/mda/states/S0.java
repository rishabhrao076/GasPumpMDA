package edu.iit.project.mda.states;

import edu.iit.project.mda.MDAEFSM;
import edu.iit.project.mda.OP;

public class S0 extends State {
    public S0(MDAEFSM m, OP op) {
        super(m, op);
    }

    public void PayMsg() {
        op.PayMsg();
    }

}
