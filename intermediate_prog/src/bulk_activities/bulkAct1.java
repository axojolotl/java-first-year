package bulk_activities;
import java.util.Scanner;

public class bulkAct1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        checker(n);
    }

    private static void checker(int n){
        if (n < 1 || n > 54) {
            System.out.println("FFF");
            return;
        } else if (n % 5 == 0){
            System.out.println("EEE");
            return;
        } else if (n < 5 || n > 20 && n < 25 || n > 40 && n < 45){
            if (n % 2 == 0){
                System.out.println("AAA");
                return;
            }
            System.out.println("BBB");
        } else {
            if (n % 2 == 0){
                System.out.println("CCC");
                return;
            }
            System.out.println("DDD");
        }
    }
}
