package activity_3;

import java.util.Scanner;

public class Act3v3 {
    private static double totalPrice, change, payAmount;
    private static int cat, sub, quantity;
    private static String[] subCat = new String[3];
    private static final String[] categories = {"Pizza", "Steak", "Drinks"},
                                  pizzas = {"Hawaiian", "Bacon", "Eyeballs"},
                                  steak = {"T-bone", "Sirloin", "Rotten Flesh"},
                                  drinks = {"Coke", "Coke Zero", "Water with algae"};
    private static final int[] pizzaPrices = {259, 279, 309},
                               steakPrices = {159, 169, 209},
                               drinkPrices = {45, 55, 69};

    public static void run(){
        printMenu(categories);
        byte userChoice = enterInput();
        mainDecision(userChoice);
    }

    public static void printMenu(String[] arr){
        System.out.println("==========MENU==========");
        int ctr = 0;
        for (String i : arr){
            ctr++;
            System.out.println(ctr + ". " + i);
        }
    }

    public static void printSubMenu(String[] arr, int[] prices){
        System.out.println("========================");
        int ctr = 0;
        for (String i : arr){
            ctr++;
            System.out.println(ctr + ". PHP" + prices[ctr-1] + " = " + i);
        }
    }

    public static byte enterInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choice[1 to 3]: ");
        return sc.nextByte();
    }

    public static int enterQuantity(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        return sc.nextInt();
    }

    public static double payInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount: ");
        return sc.nextDouble();
    }

    public static void billing(){
        System.out.println("=========BILLING=========\n" +
                           "Total price: " + totalPrice);
        payAmount = payInput();
        if (payAmount < totalPrice) {
            System.out.println("Not enough!!");
            billing();
        }
        change = payAmount - totalPrice;
    }

    public static void printReceipt(String[] subCat){
        System.out.println("=========RECEIPT========" +
                        "\nTotal price: " + totalPrice +
                        "\nPrice paid: " + payAmount +
                        "\nPurchased product: " + subCat[sub-1] +
                        "-"+ categories[cat-1] + " x" + quantity +
                        "\nChange: " + change + "\nThank you!");
    }

    public static void mainDecision(byte choice){
        byte subChoice;
        if (choice == 1){
            cat = 1;
            printSubMenu(pizzas, pizzaPrices);
            subChoice = enterInput();
            subDecision(subChoice, pizzas, pizzaPrices);
            printReceipt(pizzas);
        } else if (choice == 2){
            cat = 2;
            printSubMenu(steak, steakPrices);
            subChoice = enterInput();
            subDecision(subChoice, steak, steakPrices);
            printReceipt(steak);
        } else if (choice == 3){
            cat = 3;
            printSubMenu(drinks,drinkPrices);
            subChoice = enterInput();
            subDecision(subChoice, drinks, drinkPrices);
            printReceipt(pizzas);
        } else {
            System.out.println("Invalid choice!");
            mainDecision(choice);
        }
    }

    public static void subDecision(byte choice, String[] subCategories, int[] prices){
        quantity = enterQuantity();
        if (choice == 1){
            sub = 1;
            subCat = subCategories;
            totalPrice = prices[choice-1] * quantity;
        } else if (choice == 2){
            sub = 2;
            subCat = subCategories;
            totalPrice = prices[choice-1] * quantity;
        } else if (choice == 3){
            sub = 3;
            subCat = subCategories;
            totalPrice = prices[choice-1] * quantity;
        } else {
            System.out.println("Invalid choice!");
            mainDecision(choice);
        }
        billing();
    }
}