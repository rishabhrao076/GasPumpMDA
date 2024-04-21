import edu.iit.project.GasPump1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            displayMenu();
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            while (choice != 3) {
                switch (choice) {
                    case 1: {
                        startGasPump1(sc);
                    }
                    case 2: {
                        startGasPump2(sc);
                    }
                    default: {
                        displayMenu();
                        choice = sc.nextInt();
                    }
                }
            }
            sc.close();
            System.out.println("Bye Bye");
        }
    }

    public static void displayMenu() {
        System.out.println("Select Gas Pump");
        System.out.println();
        System.out.println("1. GP-1");
        System.out.println("2. GP-2");
        System.out.println("3. Exit");
    }

    public static void startGasPump1(Scanner sc) {
        // partial driver
        GasPump1 gp1 = new GasPump1();

        System.out.print("                          GasPump-1");
        System.out.print("\n");
        System.out.print("                  MENU of Operations");
        System.out.print("\n");
        System.out.print("          0. Activate(int)");
        System.out.print("\n");
        System.out.print("          1. Start()");
        System.out.print("\n");
        System.out.print("          2. PayCredit");
        System.out.print("\n");
        System.out.print("          3. Reject()");
        System.out.print("\n");
        System.out.print("          4. Cancel()");
        System.out.print("\n");
        System.out.print("          5. Approved()");
        System.out.print("\n");
        System.out.print("          6. PayCash(int)");
        System.out.print("\n");
        System.out.print("          7. StartPump()");
        System.out.print("\n");
        System.out.print("          8. Pump()");
        System.out.print("\n");
        System.out.print("          9. StopPump()");
        System.out.print("\n");
        System.out.print("          q. Quit the program");
        System.out.print("\n");

        System.out.print("  Please make a note of these operations");
        System.out.print("\n");
        System.out.print("           GasPump-1 Execution");
        System.out.print("\n");
        char ch = '1';
        while (ch != 'q') {
            System.out.print("  Select Operation: ");
            System.out.print("\n");
            System.out.print("0-Activate,1-Start,2-PayCredit,3-Reject,                                                          4-Cancel,5-Approved,6-PayCash,7-StartPump, 8-Pump, 9-StopPump, q-quit");
            System.out.print("\n");
            ch = sc.next().charAt(0);
            switch (ch) {
                case '0': { //Activate()
                    System.out.print("  Operation:  Activate(int a)");
                    System.out.print("\n");
                    System.out.print("  Enter value of the parameter a:");
                    System.out.print("\n");
                    int a = sc.nextInt();
                    gp1.activate(a);
                    break;
                }

                case '1': { //Start
                    System.out.print("  Operation:  Start()");
                    System.out.print("\n");
                    gp1.start();
                    break;
                }

                case '2': { //PayCredit
                    System.out.print("  Operation:  PayCredit()");
                    System.out.print("\n");
                    gp1.payCredit();
                    break;
                }

                case '3': { //Reject
                    System.out.print("  Operation:  Reject()");
                    System.out.print("\n");
                    gp1.reject();
                    break;
                }

                case '4': { //Cancel
                    System.out.print("  Operation:  Cancel()");
                    System.out.print("\n");
                    gp1.cancel();
                    break;
                }

                case '5': { //Approved
                    System.out.print("  Operation:  Approved()");
                    System.out.print("\n");
                    gp1.approved();
                    break;
                }

                case '6': { //PayCash
                    System.out.print("  Operation:  PayCash(int c)");
                    System.out.print("\n");
                    System.out.print("  Enter value of the parameter c:");
                    System.out.print("\n");
                    int c = sc.nextInt();
                    gp1.payCash(c);
                    break;
                }

                case '7': { //StartPump
                    System.out.print("  Operation:  StartPump()");
                    System.out.print("\n");
                    gp1.startPump();
                    break;
                }


                case '8': { //Pump
                    System.out.print("  Operation: Pump()");
                    System.out.print("\n");
                    gp1.pump();
                    break;
                }

                case '9': { //StopPump
                    System.out.print("  Operation:  StopPump()");
                    System.out.print("\n");
                    gp1.stopPump();
                    break;
                }
            }
            ; // endswitch

        }
        ; //endwhile
    }


    public static void startGasPump2(Scanner sc) {
        // partial driver
        GasPump1 gp1 = new GasPump1();

        System.out.print("                          GasPump-1");
        System.out.print("\n");
        System.out.print("                  MENU of Operations");
        System.out.print("\n");
        System.out.print("          0. Activate(int)");
        System.out.print("\n");
        System.out.print("          1. Start()");
        System.out.print("\n");
        System.out.print("          2. PayCredit");
        System.out.print("\n");
        System.out.print("          3. Reject()");
        System.out.print("\n");
        System.out.print("          4. Cancel()");
        System.out.print("\n");
        System.out.print("          5. Approved()");
        System.out.print("\n");
        System.out.print("          6. PayCash(int)");
        System.out.print("\n");
        System.out.print("          7. StartPump()");
        System.out.print("\n");
        System.out.print("          8. Pump()");
        System.out.print("\n");
        System.out.print("          9. StopPump()");
        System.out.print("\n");
        System.out.print("          q. Quit the program");
        System.out.print("\n");

        System.out.print("  Please make a note of these operations");
        System.out.print("\n");
        System.out.print("           GasPump-1 Execution");
        System.out.print("\n");
        char ch = '1';
        while (ch != 'q') {
            System.out.print("  Select Operation: ");
            System.out.print("\n");
            System.out.print("0-Activate,1-Start,2-PayCredit,3-Reject,                                                          4-Cancel,5-Approved,6-PayCash,7-StartPump, 8-Pump, 9-StopPump, q-quit");
            System.out.print("\n");
            ch = sc.next().charAt(0);
            switch (ch) {
                case '0': { //Activate()
                    System.out.print("  Operation:  Activate(int a)");
                    System.out.print("\n");
                    System.out.print("  Enter value of the parameter a:");
                    System.out.print("\n");
                    int a = sc.nextInt();
                    gp1.activate(a);
                    break;
                }

                case '1': { //Start
                    System.out.print("  Operation:  Start()");
                    System.out.print("\n");
                    gp1.start();
                    break;
                }

                case '2': { //PayCredit
                    System.out.print("  Operation:  PayCredit()");
                    System.out.print("\n");
                    gp1.payCredit();
                    break;
                }

                case '3': { //Reject
                    System.out.print("  Operation:  Reject()");
                    System.out.print("\n");
                    gp1.reject();
                    break;
                }

                case '4': { //Cancel
                    System.out.print("  Operation:  Cancel()");
                    System.out.print("\n");
                    gp1.cancel();
                    break;
                }

                case '5': { //Approved
                    System.out.print("  Operation:  Approved()");
                    System.out.print("\n");
                    gp1.approved();
                    break;
                }

                case '6': { //PayCash
                    System.out.print("  Operation:  PayCash(int c)");
                    System.out.print("\n");
                    System.out.print("  Enter value of the parameter c:");
                    System.out.print("\n");
                    int c = sc.nextInt();
                    gp1.payCash(c);
                    break;
                }

                case '7': { //StartPump
                    System.out.print("  Operation:  StartPump()");
                    System.out.print("\n");
                    gp1.startPump();
                    break;
                }


                case '8': { //Pump
                    System.out.print("  Operation: Pump()");
                    System.out.print("\n");
                    gp1.pump();
                    break;
                }

                case '9': { //StopPump
                    System.out.print("  Operation:  StopPump()");
                    System.out.print("\n");
                    gp1.stopPump();
                    break;
                }
            }
            ; // endswitch

        }
        ; //endwhile

    }
}