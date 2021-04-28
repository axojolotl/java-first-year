package activity_3;
import java.util.Scanner;

public class Act3v1 {
    public static String[][][] food = {
            { {"Pizza"},{"PHP239 Cheese", "PHP259 Pepperoni", "PHP259 Supreme"} },
            { {"Burger"},{"PHP119 Classic", "PHP139 Cheese", "PHP149 TLC"} },
            { {"Sandwich"},{"PHP79 Cheese", "PHP89 Cheese w/ Egg ", "PHP89 Ham and Cheese"} } };
    public static int[] prices = {239, 259, 259, 119, 139, 149, 79, 89, 89};
    public static int categoryChoice, variantChoice, price = 0;

    public static void run(){
        printMainMenu();
        categoryChoice = userInput();
        categorySwitch(categoryChoice);
    }

    public static void printMainMenu(){
        System.out.println("==============MENU==============");
        for (int i = 0; i < food.length ; i++)
            System.out.println(i+1 + ". " + food[i][0][0]);
    }

    public static void printSubMenu(String[] arr){
        System.out.println("================================");
        for (int i = 0; i < arr.length ; i++)
            System.out.println(i+1 + ". " + arr[i]);
    }

    public static byte userInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter #: ");
        return sc.nextByte();
    }

    public static byte inputQty(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        return sc.nextByte();
    }

    public static void payBill(double price){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to pay: ");
        double amount = sc.nextInt();
        if (amount >= price){
            System.out.println("============RECEIPT=============");
            System.out.println("Change: " + (amount-price));
            System.out.println("Enjoy your meal.");
        } else {
            System.out.println("Insufficient amount.");
            payBill(price);
        }
    }

    public static void variantSwitch(int choice){
        System.out.println("================================");
        System.out.println("Your order:");
        switch(choice){
            case 1:
                System.out.println("-" + food[categoryChoice-1][1][0]);
                price = 0; break;
            case 2:
                System.out.println("-" + food[categoryChoice-1][1][1]);
                price = 1; break;
            case 3:
                System.out.println("-" + food[categoryChoice-1][1][2]);
                price = 2; break;
            default:
                System.out.println("Invalid choice");
                variantSwitch(choice);
        }
    }

    public static void categorySwitch(int choice){
        byte qty;
        double itemPrice;
        switch(choice){
            case 1:
                //pizza
                printSubMenu(food[0][1]);
                variantChoice = userInput();
                variantSwitch(variantChoice);
                qty = inputQty();
                itemPrice = qty * prices[price];
                System.out.println("BILL: PHP" + itemPrice);
                payBill(itemPrice);
                break;
            case 2:
                //burger
                printSubMenu(food[1][1]);
                variantChoice = userInput();
                variantSwitch(variantChoice);
                qty = inputQty();
                itemPrice = qty * prices[price+3];
                System.out.println("BILL: PHP" + itemPrice);
                payBill(itemPrice);
                break;
            case 3:
                //sandwich
                printSubMenu(food[2][1]);
                variantChoice = userInput();
                variantSwitch(variantChoice);
                qty = inputQty();
                itemPrice = qty * prices[price+6];
                System.out.println("BILL: PHP" + itemPrice);
                payBill(itemPrice);
                break;
            default:
                System.out.println("Invalid choice.");
                categorySwitch(choice);
        }
    }
}
