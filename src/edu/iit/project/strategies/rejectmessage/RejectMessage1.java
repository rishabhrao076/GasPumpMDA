package edu.iit.project.strategies.rejectmessage;

public class RejectMessage1 extends RejectMessage {
    @Override
    public void rejectMsg() {
        System.out.println("Choose Payment Method");
        System.out.println("1. Pay by Cash");
        System.out.println("2. Pay by Credit");
    }
}
