import edu.iit.project.inputprocessor.GP1;
import edu.iit.project.inputprocessor.GP2;
import edu.iit.project.factories.AbstractFactory;
import edu.iit.project.factories.GP1Factory;
import edu.iit.project.factories.GP2Factory;
import edu.iit.project.mda.MDAEFSM;
import edu.iit.project.mda.OP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        {
            // Menu to choose gas pump to execute
            displayMenu();
            // display menu gives the options
            Scanner sc = new Scanner(System.in);
            char choice = sc.next().charAt(0);
            while (choice != 'q') {
                switch (choice) {
                    case '1': {
                        startGasPump1(sc);
                        choice = 'z';
                        break;
                    }
                    case '2': {
                        startGasPump2(sc);
                        choice = 'z';
                        break;
                    }
                    default: {
                        displayMenu();
                        choice = sc.next().charAt(0);
                        break;
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
        System.out.println("q. Exit");
    }

    // Operate Gas Pump 1
    public static void startGasPump1(Scanner sc) {
        // Initialize Classes
        // Abstract Factory is part of the Abstract Factory Pattern
        // and Strategy Pattern
        AbstractFactory af = new GP1Factory();
        // Op utilizes the Strategy pattern
        OP op = new OP(af);
        // MDAEFSM utilizes the State pattern.
        MDAEFSM m = new MDAEFSM(op);
        GP1 gp1 = new GP1(m,af);

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
            System.out.print("0-Activate,1-Start,2-PayCredit,3-Reject,4-Cancel,5-Approved,6-PayCash,7-StartPump, 8-Pump, 9-StopPump, q-quit");
            System.out.print("\n");
            String currentState = m.state.getClass().getSimpleName();
            System.out.println("Current State: " + currentState);
            ch = sc.next().charAt(0);
            switch (ch) {
                case '0': { //Activate()
                    System.out.print("  Operation:  Activate(int a)");
                    System.out.print("\n");
                    System.out.print("  Enter value of the parameter a:");
                    System.out.print("\n");
                    int a = sc.nextInt();
                    gp1.Activate(a);
                    break;
                }

                case '1': { //Start
                    System.out.print("  Operation:  Start()");
                    System.out.print("\n");
                    gp1.Start();
                    break;
                }

                case '2': { //PayCredit
                    System.out.print("  Operation:  PayCredit()");
                    System.out.print("\n");
                    gp1.PayCredit();
                    break;
                }

                case '3': { //Reject
                    System.out.print("  Operation:  Reject()");
                    System.out.print("\n");
                    gp1.Reject();
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
                    gp1.Approved();
                    break;
                }

                case '6': { //PayCash
                    System.out.print("  Operation:  PayCash(int c)");
                    System.out.print("\n");
                    System.out.print("  Enter value of the parameter c:");
                    System.out.print("\n");
                    int c = sc.nextInt();
                    gp1.PayCash(c);
                    break;
                }

                case '7': { //StartPump
                    System.out.print("  Operation:  StartPump()");
                    System.out.print("\n");
                    gp1.StartPump();
                    break;
                }


                case '8': { //Pump
                    System.out.print("  Operation: Pump()");
                    System.out.print("\n");
                    gp1.Pump();
                    break;
                }

                case '9': { //StopPump
                    System.out.print("  Operation:  StopPump()");
                    System.out.print("\n");
                    gp1.StopPump();
                    break;
                }
            }
            // endswitch

        }
        //endwhile
    }

    // Operate Gas Pump 2
    public static void startGasPump2(Scanner sc) {
        // Initialize Classes
        // Abstract Factory is part of the Abstract Factory Pattern
        // and Strategy Pattern
        AbstractFactory af = new GP2Factory();
        OP op = new OP(af);
        // Op utilizes the Strategy pattern
        MDAEFSM m = new MDAEFSM(op);
        // MDAEFSM utilizes the State pattern.
        GP2 gp2 = new GP2(m, af);

        System.out.print("                          GasPump-2");
        System.out.print("\n");
        System.out.print("                  MENU of Operations");
        System.out.print("\n");
        System.out.print("          0. Activate(float a, float b, float c)");
        System.out.print("\n");
        System.out.print("          1. Start()");
        System.out.print("\n");
        System.out.print("          2. PayCash(int)");
        System.out.print("\n");
        System.out.print("          3. Cancel()");
        System.out.print("\n");
        System.out.print("          4. Regular()");
        System.out.print("\n");
        System.out.print("          5. Diesel()");
        System.out.print("\n");
        System.out.print("          6. Premium()");
        System.out.print("\n");
        System.out.print("          7. StartPump()");
        System.out.print("\n");
        System.out.print("          8. PumpGallon()");
        System.out.print("\n");
        System.out.print("          9. Stop()");
        System.out.print("\n");
        System.out.print("          r. Receipt()");
        System.out.print("\n");
        System.out.print("          n. NoReceipt()");
        System.out.print("\n");
        System.out.print("          q. Quit the program");
        System.out.print("\n");

        System.out.print("  Please make a note of these operations");
        System.out.print("\n");
        System.out.print("           GasPump-2 Execution");
        System.out.print("\n");
        char ch = '1';
        while (ch != 'q') {
            System.out.print("  Select Operation: ");
            System.out.print("\n");
            System.out.print("0-Activate,1-Start,2-PayCash,3-Cancel,4-Regular,5-Diesel,6-Premium,7-StartPump,8-PumpGallon,9-Stop,r-Receipt,n-NoReceipt,q-quit");
            System.out.print("\n");
            String currentState = m.state.getClass().getSimpleName();
            System.out.println("Current State: " + currentState);
            ch = sc.next().charAt(0);
            switch (ch) {
                case '0': { //Activate()
                    System.out.print("  Operation:  Activate(float a, float b, float c)");
                    System.out.print("\n");
                    System.out.print("  Enter value of the parameter a:");
                    System.out.print("\n");
                    float a = sc.nextFloat();
                    System.out.print("  Enter value of the parameter b:");
                    System.out.print("\n");
                    float b = sc.nextFloat();
                    System.out.print("  Enter value of the parameter c:");
                    System.out.print("\n");
                    float c = sc.nextFloat();
                    gp2.Activate(a, b, c);
                    break;
                }

                case '1': { //Start
                    System.out.print("  Operation:  Start()");
                    System.out.print("\n");
                    gp2.Start();
                    break;
                }

                case '2': { //PayCash
                    System.out.print("  Operation:  PayCash(int c)");
                    System.out.print("\n");
                    System.out.print("  Enter value of the parameter c:");
                    System.out.print("\n");
                    int c = sc.nextInt();
                    gp2.PayCash(c);
                    break;
                }

                case '3': { //Cancel
                    System.out.print("  Operation:  Cancel()");
                    System.out.print("\n");
                    gp2.Cancel();
                    break;
                }
                case '4': { //Regular
                    System.out.print("  Operation:  Regular()");
                    System.out.print("\n");
                    gp2.Regular();
                    break;
                }
                case '5': { //Diesel
                    System.out.print("  Operation:  Diesel()");
                    System.out.print("\n");
                    gp2.Premium();
                    break;
                }


                case '6': { //Premium
                    System.out.print("  Operation:  Premium()");
                    System.out.print("\n");
                    gp2.Diesel();
                    break;
                }

                case '7': { //StartPump
                    System.out.print("  Operation:  StartPump()");
                    System.out.print("\n");
                    gp2.StartPump();
                    break;
                }

                case '8': { //PumpGallon
                    System.out.print("  Operation:  PumpGallon()");
                    System.out.print("\n");
                    gp2.PumpGallon();
                    break;
                }

                case '9': { //Stop
                    System.out.print("  Operation:  Stop()");
                    System.out.print("\n");
                    gp2.Stop();
                    break;
                }

                case 'r': { //Receipt
                    System.out.print("  Operation:  Receipt()");
                    System.out.print("\n");
                    gp2.Receipt();
                    break;
                }

                case 'n': { //NoReceipt
                    System.out.print("  Operation:  NoReceipt()");
                    System.out.print("\n");
                    gp2.NoReceipt();
                    break;
                }

            }
            // endswitch

        }
        //endwhile

    }
}