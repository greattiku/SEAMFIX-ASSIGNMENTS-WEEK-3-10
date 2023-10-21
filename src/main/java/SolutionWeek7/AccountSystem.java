package SolutionWeek7;

import SolutionWeek10.InputErrorException;

import java.time.Duration;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AccountSystem extends FixedAccount {
    FixedAccount acc = new FixedAccount();

    Scanner sc = new Scanner(System.in);
    void displayAccount(){
        try {
            while (true) {
                System.out.println("SavingsAccount enter 1 \nFixedAccount enter 2 \nExit enter 3>>");
                int opt = sc.nextInt();

                switch (opt) {
                    case 1:
                        calculateInterest();
                        break;
                    case 2:
                        calculateInterestRate();
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        System.exit(0);
                        break;
                    default:
                        throw new InputMismatchException("Unexpected value: input should be between 1, 2, 3");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Something went wrong: Input Mismatch \nReload and try again.");
        }
    }

    public void calculateInterest(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter AccountNo: ");
        acc.setAccountNo(sc.nextInt());

        System.out.println("Enter AccountName: ");
        acc.setAccountHolder(sc.next());

        System.out.println("Enter Savings Balance: ");
        acc.setSavingsBalance(sc.nextInt());

        System.out.println("Enter savings duration in days");
        acc.setDuration(sc.nextInt());
        System.out.println();

        System.out.println("Savings Interest Rate is 10% per annum: ");
        acc.setInterestRate(0.1);//Fixed Interest rate
        System.out.println();

        System.out.println("Computing result...");
        System.out.println("-----------------------------------------------------");

        float Interest = (float) ((acc.savingsBalance * acc.interestRate * acc.duration)/365);
        System.out.println("Your Savings account Interest is: " + Interest);

        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println("AccountHolder: " + acc.getAccountHolder() +
                "\nAccountNumber: " + acc.getAccountNo() +
                "\nAmount: " + acc.getSavingsBalance() +
                "\nInterestRate: " + acc.getInterestRate() +
                "\nDuration: " + acc.getDuration() + "days.");

        System.out.println();
    }

    public void calculateInterestRate() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter AccountNo: ");
        acc.setAccountNo(sc.nextInt());

        System.out.println("Enter AccountName: ");
        acc.setAccountHolder(sc.next());

        System.out.println("Enter Principal amount: ");
        acc.setPrincipal(sc.nextDouble());

        System.out.println("Fixed Interest Rate is 15% per annum: ");
        acc.setInterestRate(0.15);//Fixed Interest rate
        System.out.println();


        System.out.println("Enter duration based on 90 days, 180 days or 365 days: ");
       // acc.setDuration(sc.nextInt());
        acc.duration = sc.nextInt();

        switch (acc.duration) {
            case 90:
                System.out.println();
                break;
            case 180:
                System.out.println(" ");
                break;
            case 365:
                System.out.println("-");
                break;
            default:
                throw new InputMismatchException("Unexpected value: input should be between 90, 180, 365");
        }

        System.out.println("Computing result...");

        System.out.println("-----------------------------------------------------");

        float Interest = (float) ((acc.Principal * acc.interestRate * acc.duration)/365);
        System.out.println("Your Fixed account Interest is: " + Interest);

        System.out.println("-----------------------------------------------------");
        System.out.println("AccountHolder: " + acc.getAccountHolder() +
                "\nAccountNumber: " + acc.getAccountNo() +
                "\nAmount: " + acc.getPrincipal() +
                "\nInterestRate: " + acc.getInterestRate() +
                "\nDuration: " + acc.getDuration() + "days.");
        System.out.println();

    }
}

