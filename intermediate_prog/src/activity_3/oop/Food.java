package activity_3.oop;
import java.util.Scanner;

public abstract class Food {

    public static String[] food ={"Burger", "Pizza", "Sandwich"};

    public static void printMenu(String[] arr){
        int ctr = 1;
        for(String i : arr){
            System.out.println(ctr + " " + i);
            ctr++;
        }
    }

    public static byte categoryInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter #: ");
        return sc.nextByte();
    }

    public static int quantityInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity: ");
        return sc.nextInt();
    }

}
