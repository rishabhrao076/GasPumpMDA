package edu.iit.project.mda.states;

import edu.iit.project.mda.OP;

public class S3 extends State {

    public S3(OP op) {
        super(op);
    }

    @Override
    public void CancelMsg() {
        op.CancelMsg();
    }

    @Override
    public void SetPrice(int g) {
        op.SetPrice(g);
    }
}
