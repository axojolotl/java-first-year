package midterm;

import java.util.Arrays;

public class MergeSort {

    private static void merge(int[] arr, int low, int mid, int high) {
        int[] leftArray = new int[mid-low+1];
        int[] rightArray = new int[high-mid];

        for (int i = 0; i < leftArray.length ; i++) { leftArray[i] = arr[low+i]; }
        for (int j = 0; j < rightArray.length; j++) { rightArray[j] = arr[mid+j+1]; }

        int i=0, j=0, k=low;

        while (i < leftArray.length && j < rightArray.length){
            if (leftArray[i] <= rightArray[j]){
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftArray.length){
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < rightArray.length){
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private static void mergeSort(int[] arr, int low, int high){
        if (low < high){
            int mid = (low + high)/2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid+1, high);

            merge(arr,low,mid,high);

        }
    }

    public static void main(String[] args) {
        int[] nums = {6,4,2,1,45,2,3,6,7,8,9,5,345,53,42,42,12,453,89,0};

        System.out.println(Arrays.toString(nums));
        mergeSort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
