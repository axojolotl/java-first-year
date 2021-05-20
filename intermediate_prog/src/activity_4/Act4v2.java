package activity_4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Act4v2 {

    public static void print(String s){
        System.out.println(s);
    }

    public static byte byteIn(){
        print("Enter byte: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextByte();
    }

    public static String strIn(){
        print("Enter string: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static byte[] arrIn(byte size){
        print("Enter array[]: ");
        byte[] arr =  new byte[size];
        for (int i = 0; i < size ; i++)
            arr[i] = byteIn();
        return arr;
    }

    public static String countNumberOfDuplicates(byte[] arr){
        byte ctr = 0;
        for (byte i = 0; i < arr.length; i++)
            for (int j = i+1; j < arr.length ; j++)
                if (arr[i] == arr[j]) ctr++;
        System.out.println(Arrays.toString(arr));
        return "The number of duplicates: " + ctr;
    }

    public static String reverseString(String n){
        char[] arr = n.toCharArray();
        String r = "";
        for (int i = arr.length-1; i >= 0; i--)
            r += arr[i];
        return r;
    }

    public static boolean palindromeChecker(String n){
        String rev = reverseString(n);
        if (n.equalsIgnoreCase(rev)) return true;
        return false;
    }

    public static String generateMatrix(byte size){
        String matrix = "";
        int ctr = size*size;
        for (int i = 0; i < size ; i++) {
            for (int j = 1; j <= size ; j++){
                matrix += ctr + "\t";
                ctr--;
            } matrix += "\n";
        } return matrix;
    }

    public static String countdownRecursion(byte n){
        if (n == 0){ return Integer.toString(0); }
        print(Byte.toString(n));
        return countdownRecursion((byte)(n-1));
    }

    public static String fizzBuzz(byte n){
        String s = "";
        for (int i = 1; i <= n; i++){
            if (i % 5 == 0 && i % 3 == 0) s += "fizzBuzz\n";
            else if (i % 3 == 0) s += "fizz\n";
            else if (i % 5 == 0) s += "buzz\n";
            else s += i + "\n";
        }
        return s;
    }

    public static int factorial(byte n){
        int total = 1;
        for (int i = n; i > 1; i--) total *= i;
        return total;
    }
    
    public static void pyramid(int n){
    for(int i = 0; i < n; i++){
        for(int j = 0; j < n-i; j++) System.out.print(" ");
        for(int k = 0; k <= i+i;k++) System.out.print("*");
        System.out.println();
      }
    }

    public static String randomBandNameGenerator(){
        String[] desc = {"Cool", "Ghastly", "Tenacious", "Loaded", "Burning", "Explosive"},
                 obj = {"Machine", "Dipper", "Toilet", "Astronauts", "Chickens", "Refrigerator"};

        int rnd1 = new Random().nextInt(desc.length);
        int rnd2 = new Random().nextInt(obj.length);

        return desc[rnd1]+obj[rnd2];
    }

    public static String coinFlip(){
        int rnd = new Random().nextInt(2);
        if (rnd == 1) return "Heads!";
        return "Tails!";
    }

    public static void run() {
        print("\nCOUNT NUMBER OF DUPLICATES");
        byte[] arr2 = arrIn(byteIn());
        print(countNumberOfDuplicates(arr2));

        print("\nREVERSE A STRING");
        print(reverseString(strIn()));

        print("\nPALINDROME CHECKER");
        print(Boolean.toString(palindromeChecker(strIn())));

        print("\nGENERATE DESCENDING MATRIX");
        print(generateMatrix(byteIn()));

        print("\nCOUNTDOWN");
        print(countdownRecursion(byteIn()));

        print("\nFIZZ-BUZZ");
        print(fizzBuzz(byteIn()));

        print("\nFACTORIAL");
        print(Integer.toString(factorial(byteIn())));

        print("\nPYRAMID");
        pyramid(byteIn());

        print("\nBAND NAME GENERATOR");
        print(randomBandNameGenerator());

        print("\nCOIN FLIP");
        print(coinFlip());
    }
}