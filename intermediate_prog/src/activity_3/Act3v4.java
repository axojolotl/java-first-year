package activity_3;
import java.util.Scanner;

public class Act3v4 {
    public static final String[][][] food = {
            { {"Pizza"},{"PHP239 Cheese", "PHP259 Pepperoni", "PHP259 Supreme"} },
            { {"Burger"},{"PHP119 Classic", "PHP139 Cheese", "PHP149 TLC"} },
            { {"Sandwich"},{"PHP79 Cheese", "PHP89 Cheese w/ Egg ", "PHP89 Ham and Cheese"} } };
    public static final int[][] prices = {{239, 259, 259}, {119, 139, 149}, {79, 89, 89}};
    public static int categoryChoice, variantChoice, quantity, price = 0;

    public static void main(String[] args) {
        printMenu();
        System.out.print("Enter number[1-3]: ");
        categoryChoice = userInput();
        printSubMenu();
        System.out.println("Enter number[1-3]: ");
        variantChoice = userInput();
        System.out.println("Enter quantity: ");
        quantity = userInput();
        payBill(prices[categoryChoice-1][variantChoice-1] * quantity);
    }

    public static void printMenu(){
        System.out.println("==============MENU=============");
        for (int i = 0; i < food.length ; i++) {
            System.out.println(i + 1 + ". " + food[i][0][0]);
        }
    }

    public static void printSubMenu(){
        System.out.println("===============================");
        int ctr = 1;
        for (int i = 0; i < food[categoryChoice-1][1].length ; i++) {
            System.out.println(ctr + ". " + food[categoryChoice-1][1][i]);
            ctr++;
        }
    }

    public static int userInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static void payBill(double price){
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Price: " + price + "\nEnter amount to pay: ");
        double amount = sc.nextInt();
        if (amount >= price){
            System.out.println("============RECEIPT============" +
                               "\nChange: " + (amount-price) +
                               "\nEnjoy your meal.");
        } else {
            System.out.println("Insufficient amount.");
            payBill(price);
        }
    }
}