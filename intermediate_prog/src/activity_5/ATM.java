package activity_5;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ATM {
        static DecimalFormat df = new DecimalFormat("$#,###");
        private static final double[][][] users = {
                {{001},{121651},{20_500}},
                {{002},{542817},{16_790}},
                {{003},{987021},{100_210}}};
        private static double bal;

        private static void pressAnyKeyToContinue() {
                println("Press Enter key to continue...");
                try { System.in.read(); }
                catch(Exception ignored) {}
        }

        public static double inputNum(){
                Scanner n = new Scanner(System.in);
                return n.nextDouble();
        }

        public static void print(String s){
                System.out.print(s);
        }

        public static void println(String s){
                System.out.println(s);
        }

        private static void menu(){
                print("""
                        ==========WELCOME==========
                        1. Check Balance
                        2. Deposit
                        3. Withdraw
                        4. Exit
                        Choice:\s""");
                double n = inputNum();
                switch((int) n){
                        case 1: checkBalance();
                                pressAnyKeyToContinue();
                                menu(); break;
                        case 2: deposit();
                                pressAnyKeyToContinue();
                                menu(); break;
                        case 3: withdraw();
                                pressAnyKeyToContinue();
                                menu(); break;
                        case 4: println("See you again."); break;
                        default: println("Invalid option. "); menu();
                }
        }

        public static void login(){
                print("Enter ID: ");
                double id = inputNum();
                print("Enter PIN: ");
                double pin = inputNum();
                if (accessGranted(id, pin)){
                        println("Access Granted.");
                        menu();
                } else {
                        println("Incorrect login.");
                        login(); }
        }

        private static boolean accessGranted(double id, double pin){
                for (double[][] user : users) {
                        if (id == user[0][0] && pin == user[1][0]) {
                                bal = user[2][0];
                                return true; }
                } return false;
        }

        private static void checkBalance(){
                println("Balance: " + df.format(bal));
        }

        private static void deposit(){
                print("Enter deposit amount: ");
                bal += inputNum();
                println("New Balance: " + df.format(bal));
        }

        private static void withdraw(){
                print("Enter withdraw amount: ");
                double with = inputNum();
                if (with <= bal){
                        println("Previous Balance: " + df.format(bal));
                        bal -= with;
                        println("New Balance: " + df.format(bal));
                } else {
                        println("Insufficient balance!");
                        println("Current Balance: " + df.format(bal));
                        withdraw();
                }
        }
}