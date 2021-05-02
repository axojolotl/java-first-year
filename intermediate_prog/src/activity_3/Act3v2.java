package activity_3;
import activity_3.oop.Pizza;

import java.util.Scanner;

public class Act3v2 {
    public static void run(){
        myMenu();
        int pickAFood = numInput();
        mainSwitch(pickAFood);
    }

    public static void myMenu(){
        System.out.println("""
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                1. Pizza
                2. Steak
                3. Drinks
                """);
    }

    public static int numInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice: ");
        return sc.nextInt();
    }

    public static void mainSwitch(int choice){
        int varChoice; int qty; double finalPrice;

        switch(choice){
            case 1:
                pizzaMenu();
                varChoice = numInput();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                switch (varChoice){
                    case 1:
                        System.out.println("HAWAIIAN-Pizza");
                        qty = qtyInput();
                        finalPrice = qty * 259;
                        System.out.println("Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                    case 2:
                        System.out.println("BACON-Pizza");
                        qty = qtyInput();
                        finalPrice = qty * 279;
                        System.out.println("Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                    case 3:
                        System.out.println("EYEBALLS-Pizza");
                        qty = qtyInput();
                        finalPrice = qty * 309;
                        System.out.println("Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                }
                break;
            case 2:
                steakMenu();
                varChoice = numInput();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                switch (varChoice){
                    case 1:
                        System.out.println("T-BONE-Steak");
                        qty = qtyInput();
                        finalPrice = qty * 159;
                        System.out.println("Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                    case 2:
                        System.out.println("Sirloin-Steak");
                        qty = qtyInput();
                        finalPrice = qty * 269;
                        System.out.println("Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                    case 3:
                        System.out.println("ROTTEN FLESH-Steak");
                        qty = qtyInput();
                        finalPrice = qty * 209;
                        System.out.println("Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                }
                break;
            case 3:
                drinksMenu();
                varChoice = numInput();
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                switch (varChoice){
                    case 1:
                        System.out.println("COKE-Drinks");
                        qty = qtyInput();
                        finalPrice = qty * 45;
                        System.out.println("Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                    case 2:
                        System.out.println("COKE ZERO-Drinks");
                        qty = qtyInput();
                        finalPrice = qty * 55;
                        System.out.println("Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                    case 3:
                        System.out.println("WATER W/ ALGAE-Drinks");
                        qty = qtyInput();
                        finalPrice = qty * 69;
                        System.out.println("Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                }
                break;
        }
    }

    public static void pizzaMenu(){
        System.out.println("""
                ------------------------
                1. PHP.259 : Hawaiian
                2. PHP.279 : Bacon
                3. PHP.309 : Eyeballs""");
    }

    public static void steakMenu(){
        System.out.println("""
                ------------------------
                1. PHP.159 : T-Bone
                2. PHP.169 : Sirloin
                3. PHP.209 : Rotten Flesh""");
    }

    public static void drinksMenu(){
        System.out.println("""
                ------------------------
                1. PHP.45 : Coke
                2. PHP.55 : Coke Zero
                3. PHP.69 : Water w/ Algae""");
    }

    public static int qtyInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        return sc.nextInt();
    }

    public static void priceInput(double price){
        Scanner sc = new Scanner(System.in);
        System.out.print("""
                ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
                Enter amount to pay:\040\040
                """);
        double amount = sc.nextDouble();

        if (amount >= price){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Total change: " + (amount-price));
            System.out.println("Thank you for dining!");
        } else {
            System.out.println("Not enough!!");
            priceInput(price);
        }
    }
}