package activity_3.oop;
import java.util.Scanner;

public abstract class Food {

    public static String[] food ={"Burger", "Pizza", "Sandwich"};

    private static void payBillReturnChange(double price){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amount to pay: ");
        double amount = sc.nextInt();
        System.out.println("########################");
        if (amount >= price){
            System.out.println("Change: PHP" + (amount-price));
            System.out.println("Enjoy your meal.");
        } else {
            System.out.println("Insufficient amount.");
            payBillReturnChange(price);
        }
        System.out.println("########################");
    }

    public static void printMenu(String[] arr){
        System.out.println("##########MENU##########");
        byte ctr = 1;
        for(String i : arr){
            System.out.println(ctr + ". " + i);
            ctr++;
        }
    }

    public static void printSubMenu(String[] arr, int[] prices){
        System.out.println("##########OPT###########");
        for (byte i = 0; i < arr.length ; i++) {
            System.out.println((i+1) + " PHP" + prices[i] + "\t" + arr[i] );
        }
    }

    public static void printAndPayBill(double price){
        System.out.println("Total Price: PHP" + price );
        payBillReturnChange(price);
    }

    public static byte categoryInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter #: ");
        return sc.nextByte();
    }

    public static int quantityInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("########################");
        System.out.print("Enter quantity: ");
        return sc.nextInt();
    }
}
