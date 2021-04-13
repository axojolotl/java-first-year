
import java.util.Arrays;

public class insertion_sort{
    
    static int[] insertionSort(int[] list){
        int i, j, key, temp;

        for (i=1; i<list.length;i++){
            key = list[i];
            j = i - 1;
            while(j >= 0 && key < list[j]){
                temp = list[j];
                list[j] = list[j+1];
                list[j+1] = temp;
                j--;
            }
        }
        return list;
    }
    
    public static void main(String[] args) {
        int[] list = {5,3,6,1,2,0,-2};
        System.out.println(Arrays.toString(insertionSort(list)));
    }
}