package edu.iit.project.mda.states;

import edu.iit.project.mda.MDAEFSM;
import edu.iit.project.mda.OP;

public class Start extends State {
    public Start(MDAEFSM m, OP op) {
        super(m, op);
    }

    public void StorePrices() {
        op.StorePrices();
    }

}
