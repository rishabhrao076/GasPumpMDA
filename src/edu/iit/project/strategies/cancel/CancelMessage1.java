package edu.iit.project.strategies.cancel;

public class CancelMessage1 extends CancelMessage {
    @Override
    public void cancelMessage() {
        System.out.println("Printing Receipt of GP-1");
    }
}
