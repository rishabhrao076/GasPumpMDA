package edu.iit.project.strategies.cancel;

public abstract class CancelMessage {
    public void cancelMessage(){
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║     Transaction Cancelled      ║");
        System.out.println("╚════════════════════════════════╝");
    };
}
