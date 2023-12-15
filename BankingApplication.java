package banking.application;

import java.util.*;

//create a class
public class BankingApplication {
    public static void start(){   //    create a method to call automatically code

        System.out.println("Welcome to Banking App:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {           //       swicth case options to choose

            case 1:
                Balance();
                break;

            case 2:
                deposit();
                break;

            case 3:
                withdraw();
                break;
            case 4:
                boolean exit = true;
                System.out.println("Thankyou for using this banking App");
                break;

            default:
                System.out.println("Invalid Choice..Please enter Valid Choice ");
        }
    }


    private static double balance = 0; // Initialize balance zero

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
       boolean loggedIn = login();
       //        Here, create a method for login

        if (loggedIn) {
            start();
        } else {
System.out.println("Invalid");       
        }
    }

    private static boolean login() {           //call login method

        System.out.println("Welcome! Please log in.");
        System.out.print("Enter your username: ");
        String sname = sc.next();
        System.out.print("Enter your password: ");
        int spass = sc.nextInt();
        return true;
    }

    private static void Balance() {  // method for checking balance

        System.out.println("Your Balance is :" + balance);
        start();
    }
    
    private static void deposit() {   // method for deposit balance
        System.out.println("Enter the Amount to Deposit");
        double amt = sc.nextDouble();
        if (amt > 0) {
            balance += amt;
            System.out.println("Amount Deposit Successfully");
            System.out.println("Your Balance is :" + balance);
            start();

        } else {
            System.out.println("Invalid amount. Please enter a positive value..");
        }
    }

    private static void withdraw() {   // method for withdraw balance
        System.out.println("Enter the Amount to Withdraw");
        double amt = sc.nextDouble();
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Amount Withdraw Successfully");
            System.out.println("Your Balance is :" + balance);
            start();

        } else {
            System.out.println("Insufficient balance or Invalid Amount");
        }
    }
}

