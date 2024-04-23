package edu.iit.project.strategies.rejectmessage;

public class RejectMessage1 extends RejectMessage {
    @Override
    public void rejectMsg() {
        System.out.println("╔════════════════════════════════╗");
        System.out.println("║     Card has been Rejected     ║");
        System.out.println("╚════════════════════════════════╝");
    }
}
