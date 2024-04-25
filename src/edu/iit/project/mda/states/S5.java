package edu.iit.project.mda.states;

import edu.iit.project.mda.MDAEFSM;
import edu.iit.project.mda.OP;

public class S5 extends State {

    public S5(OP op) {
        super(op);
    }

    @Override
    public void PumpGasUnit() {
        op.PumpGasUnit();
    }

    @Override
    public void GasPumpedMsg() {
        op.GasPumpedMsg();
    }
}
