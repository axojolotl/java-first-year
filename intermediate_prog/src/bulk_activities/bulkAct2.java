package bulk_activities;

import java.util.Scanner;

public class bulkAct2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter starting number: ");
        int s = sc.nextInt();
        System.out.print("Enter increment number: ");
        int i = sc.nextInt();
        System.out.print("Enter loop times: ");
        int l = sc.nextInt();

        whileLoop(s,i,l);
        doWhileLoop();

    }

    public static void whileLoop(int s, int i, int l){
        int j = 1;
        System.out.println("---Result---");
        while (j <= l){
            System.out.println("Loop " + j + ": " + s);
            s += i;
            j++;
        }
        System.out.println("---END---");
    }

    public static void doWhileLoop(){
        int a = 2, b = 20, c = 5, d = 1000;
        int j = 0;
        System.out.println("---Result---");
        do {
            System.out.println( a + ", " + b + ", " + c + ", " + d);
            a *= 2;
            b -= 2;
            c *= 3;
            d /= 2;
            j++;
        } while (j < 10);
        System.out.println("---END---");
    }

   //public static void looper(int s, int i, int l){
   //     System.out.println("---Result----");
   //     for (int j = 1; j <= l ; j++) {
   //         System.out.println("Loop " + j + ": " + s);
   //         s += i;
   //     }
   //     System.out.println("---END----");
   // }

}
