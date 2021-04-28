package activity_3;
import java.util.Scanner;

public class Act3v2 {
    public static void run(){
        printMenu();
        byte categoryChoice = numInput();
        mainSwitch(categoryChoice);
    }

    public static void printMenu(){
        System.out.println("----------Menu----------");
        System.out.println("1. Bread");
        System.out.println("2. Doughnut");
        System.out.println("3. Cake");
    }

    public static byte numInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        return sc.nextByte();
    }

    public static void mainSwitch(byte choice){
        byte varChoice; int qty; double finalPrice;

        switch(choice){
            case 1:
                //bread
                breadMenu();
                varChoice = numInput();
                System.out.println("------------------------");
                switch (varChoice){
                    case 1:
                        System.out.println("You chose Plain.");
                        qty = qtyInput();
                        finalPrice = qty * 59;
                        System.out.println("Total Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                    case 2:
                        System.out.println("You chose Ube.");
                        qty = qtyInput();
                        finalPrice = qty * 69;
                        System.out.println("Total Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                    case 3:
                        System.out.println("You chose Garlic.");
                        qty = qtyInput();
                        finalPrice = qty * 79;
                        System.out.println("Total Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                }
                break;
            case 2:
                //doughnut
                doughnutMenu();
                varChoice = numInput();
                System.out.println("------------------------");
                switch (varChoice){
                    case 1:
                        System.out.println("You chose Plain.");
                        qty = qtyInput();
                        finalPrice = qty * 39;
                        System.out.println("Total Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                    case 2:
                        System.out.println("You chose Glazed.");
                        qty = qtyInput();
                        finalPrice = qty * 49;
                        System.out.println("Total Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                    case 3:
                        System.out.println("You chose Chocolate.");
                        qty = qtyInput();
                        finalPrice = qty * 49;
                        System.out.println("Total Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                }
                break;
            case 3:
                //cake
                cakeMenu();
                varChoice = numInput();
                System.out.println("------------------------");
                switch (varChoice){
                    case 1:
                        System.out.println("You chose Mocha.");
                        qty = qtyInput();
                        finalPrice = qty * 239;
                        System.out.println("Total Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                    case 2:
                        System.out.println("You chose Black Forest.");
                        qty = qtyInput();
                        finalPrice = qty * 249;
                        System.out.println("Total Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                    case 3:
                        System.out.println("You chose Cookies and Cream.");
                        qty = qtyInput();
                        finalPrice = qty * 259;
                        System.out.println("Total Price: " + finalPrice);
                        priceInput(finalPrice);
                        break;
                }
                break;
        }
    }

    public static void breadMenu(){
        System.out.println("------------------------");
        System.out.println("1. PHP.59 Plain\n2. PHP.69 Ube\n3. PHP.79 Garlic");
    }

    public static void doughnutMenu(){
        System.out.println("------------------------");
        System.out.println("1. PHP.39 : Plain\n2. PHP.49 : Glazed\n3. PHP.49 : Chocolate");
    }

    public static void cakeMenu(){
        System.out.println("------------------------");
        System.out.println("1. PHP.239 : Mocha\n2. PHP.249 : Black Forest\n3. PHP.259 : Cookies and Cream");
    }

    public static int qtyInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        return sc.nextInt();
    }

    public static void priceInput(double price){
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------");
        System.out.println("Enter amount to pay: ");
        double amount = sc.nextDouble();

        if (amount >= price){
            System.out.println("------------------------");
            System.out.println("Your change: " + (amount-price));
            System.out.println("Come again.");
        } else {
            System.out.println("Insufficient amount.");
            priceInput(price);
        }
    }
}