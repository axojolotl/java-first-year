
import java.util.Arrays;

public class bubble_sort {

    static void bubbleSort(int[] arr){
        int temp;
        for(int i = arr.length; i > 0; i--)
            for (int j = 0; j < i-1; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 3,5,6,9,8,7};
        int[] arr2 = {5,0,1,2,3,4,-2};

        bubbleSort(arr);
        bubbleSort(arr2);
   } 
}
