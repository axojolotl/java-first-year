package activity_3.oop;
import java.util.Scanner;

public abstract class Food {
    public static String[] food ={"Burger", "Pizza", "Sandwich"};

    protected static void payBill(double price, int qty, String variant,String category){
        System.out.println("Total Price: PHP" + price );
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to pay: ");
        double amount = sc.nextInt();
        printReceipt(amount,price,qty,variant,category);
    }

    private static void printReceipt(double amount, double price, int qty, String variant, String category){
        System.out.println("#########RECEIPT##########");
        System.out.println("Purchase: " + qty +"pcs " + variant + " " + category);
        if (amount >= price){
            System.out.println("Price: " + price +"\nPaid Amount: " + amount);
            System.out.println("Change: PHP" + (amount-price));
            System.out.println("Enjoy your meal!");
        } else {
            System.out.println("Insufficient amount.");
            payBill(price,qty,variant,category);
        }
    }

    public static void printMenu(String[] arr){
        System.out.println("###########MENU###########");
        byte ctr = 1;
        for(String i : arr){
            System.out.println(ctr + ". " + i);
            ctr++;
        }
    }

    static void printSubMenu(String[] arr, int[] prices){
        System.out.println("###########OPT############");
        for (byte i = 0; i < arr.length ; i++) {
            System.out.println((i+1) + " PHP" + prices[i] + "\t" + arr[i] );
        }
    }

    static byte categoryInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter #: ");
        return sc.nextByte();
    }

    static int quantityInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("##########################");
        System.out.print("Enter quantity: ");
        return sc.nextInt();
    }
}