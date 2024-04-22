package edu.iit.project.mda.states;

import edu.iit.project.mda.MDAEFSM;
import edu.iit.project.mda.OP;

public class S4 extends State {

    public S4(MDAEFSM m, OP op) {
        super(m, op);
    }

    @Override
    public void SetInitialValues() {
        op.SetInitialValues();
    }
}
