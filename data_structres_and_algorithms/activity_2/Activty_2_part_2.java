package activity_2;

import java.util.Arrays;

public class Activty_2_part_2 {
    public static void main(String[] args) {
        int[] num1 = {3,5,6,9,8,7};
        int[] num2 = {5,0,1,2,3,4,-2};

        System.out.print(Arrays.toString(sort(num1)));
        System.out.print(Arrays.toString(sort(num2)));


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

}
