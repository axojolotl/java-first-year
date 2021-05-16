package activity_4;
import java.util.Scanner;

public class Act4v2 {
    static byte n; static String s;

    public static void print(String s){
        System.out.println(s);
    }

    public static byte bnp(){
        print("Enter byte: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextByte();
    }

    public static String snp(){
        print("Enter string: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public static byte[] anp(byte size){
        print("Enter array[]: ");
        byte[] arr =  new byte[size];
        for (int i = 0; i < size ; i++)
            arr[i] = bnp();
        return arr;
    }

    public static String countNumberOfDuplicates(byte[] arr){
        byte ctr = 0;
        for (byte i = 0; i < arr.length; i++)
            for (int j = i+1; j < arr.length ; j++)
                if (arr[i] == arr[j]) ctr++;
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
        for (int i = 0; i < size ; i++) {
            for (int j = 1; j <= size ; j++)
                matrix += j + " ";
            matrix += "\n";
        }
        return matrix;
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

    public static void main(String[] args) {
        print("PRINTER METHOD");
        print("Hello world");

        print("BYTE INPUT METHOD");
        bnp();

        print("STRING INPUT METHOD");
        snp();

        print("ARRAY INPUT METHOD");
        anp((byte) 5);

        n = bnp();
        byte[] arr2 = anp(n);
        print(countNumberOfDuplicates(arr2));

        s = snp();
        print(reverseString(s));

        s = snp();
        print(Boolean.toString(palindromeChecker(s)));

        n = bnp();
        print(generateMatrix(n));

        n = bnp();
        print(countdownRecursion(n));

        n = bnp();
        print(fizzBuzz(n));
    }
}