package activity2;
import java.util.Scanner;
import java.util.Arrays;

public class part3 {
    public static void run() {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printer(sort(arr)); 
        System.out.print(Arrays.toString(sort(arr)));

        sc.close();
    }

    static int[] sort(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] < arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    static void printer(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ ",");
        }
    }
}
