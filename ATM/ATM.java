
// package INTERNSHIP.Osis Infobyte;
import java.util.*;

public class ATM {

    double balance = 0.0, deposite_amt = 0.0, withdraw_amt = 0.0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int atmnum = 00, atmp;
        int atmnumber = 975242, atmpin = 4141;
        
        Balance b = new Balance();
        Deposit d = new Deposit();
        Withdraw w = new Withdraw();
        TransHistory h = new TransHistory();
        
        ATM a = new ATM();
        while (true) {
            System.out.println("Enter the ATM Number ");
            atmnum = sc.nextInt();
            System.out.println("Enter the ATM Pin ");
            atmp = sc.nextInt();

            if ((atmnum == atmnumber) && (atmp == atmpin)) {
                while (true) {
                    int choice;
                    System.out.println(
                            "\n1. Check Balance \n2. Deposit Money  \n3. Withdraw Money \n4. Transfer History  \n5. Quite");
                    choice = sc.nextInt();

                    switch (choice) {

                        case 1:
                            b.checkBalance(a);
                            break;

                        case 2:
                            d.depositMoney(a);
                            break;

                        case 3:
                            w.withdrawMoney(a);
                            break;

                        case 4:
                            h.showTransHistory(a);
                            break;

                        case 5:
                            System.exit(0);
                            break;
                    }
                }
            }

            else if ((atmnum != atmnumber) && (atmp != atmpin)) {
                System.out.println("You Enter wrong ATM Number and Pin");
            }

            else if (atmnum != atmnumber) {
                System.out.println("You Enter wrong ATM Number ");
            }

            else if (atmp != atmpin) {
                System.out.println("You Enter wrong ATM Pin");
            }
        }
    }
}

class Balance extends ATM {

    void checkBalance(ATM a) {

        System.out.println("\nCurrent Balance is " + a.balance);
    }
}

class Deposit extends ATM {

    void depositMoney(ATM a) {

        double dpst;
        // ATM a = new ATM();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Ammount ");
        dpst = sc.nextDouble();

        a.balance += dpst;
        System.out.println("Successfuly, Ammount is Deposite ");

    }
}

class Withdraw extends ATM {

    void withdrawMoney(ATM a) {

        double widr;
        // ATM a = new ATM();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter the Ammount ");
        widr = sc.nextDouble();

        a.balance -= widr;
        System.out.println("Successfuly, Ammount is Withdraw ");
        System.out.println("Collect Your Money ");

    }
}

class TransHistory extends ATM {

    void showTransHistory(ATM a) {
        // for(Map.Entry<Double,String> m:ministmt.entrySet()){
        //     System.out.println(m.getKey()+""+m.getValue());
        // }
    }
}