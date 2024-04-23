package edu.iit.project.strategies.paymessage;


public class PayMessage1 extends PayMessage {
    @Override
    public void payMsg() {
        System.out.println("Choose Payment Method");
        System.out.println("6. Pay by Cash");
        System.out.println("2. Pay by Credit");
    }
}
