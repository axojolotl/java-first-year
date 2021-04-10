package activity_2_1;

import java.util.Scanner;

public class Activity_2_part_1{
    static void printer(int size, int total){
        System.out.print("Sub-array from 0 to " + (size-1) + " and sum is: " + total);
    }

    static void process(int size, int[] arr){
        int total = 0;
        for (int i = 0; i < size; i++) {
            total += arr[i];
        }
        printer(size, total);
    }

    static int userInput(Scanner sc){
        System.out.print("Sub-array size: ");
        int subArraySize = sc.nextInt();

        return subArraySize;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = {1,2,3,4,5,6,7,8,9,10};

        int size = userInput(sc);

        process(size, num);
    }
}