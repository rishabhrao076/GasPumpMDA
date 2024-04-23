package edu.iit.project.strategies.receipt;

public class PrintReceipt1 extends PrintReceipt {
    @Override
    public void printReceipt() {
        System.out.println("Choose Payment Method");
        System.out.println("1. Pay by Cash");
        System.out.println("2. Pay by Credit");
    }
}
