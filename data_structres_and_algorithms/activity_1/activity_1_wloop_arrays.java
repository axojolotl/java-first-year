package activity_1;
import java.util.Arrays;

public class activity_1_wloop_arrays {

    public static void main(String[] args) {
        fibonacciIterative();
        System.out.print(fibonacciRecursive(14));
    }
        //RECURSIVE
    static int fibonacciRecursive(int n){
        if ( n < 2) return n;
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
    static void fibonacciIterative(){
       //ITERATIVE
        int[] arr = new int[15];

        int x=0, y=1, z=0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = x;
            z = x+y;
            x = y;
            y = z;
        }
        System.out.println(Arrays.toString(arr));
    }
}