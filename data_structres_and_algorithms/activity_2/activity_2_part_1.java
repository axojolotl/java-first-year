package activity_2;

import java.util.Scanner;

public class activity_2_part_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        System.out.print("Sub-array size: ");
        int sub_array_size = sc.nextInt();

        for (int i = 0; i < sub_array_size; i++)
            sum += num[i];

        System.out.println("Sub-array from 0 to " + (sub_array_size-1) + " and sum is " + sum );

        sc.close();
   } 
}
