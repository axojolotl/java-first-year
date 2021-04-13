class SelectionSort{

	static int[] selectionSort(int[] arr){
		int min = 0;
		for(int i = 0; i < arr.length; i++){
			min = i;
			for(int j = 1; j < arr.length; j++){
				if(arr[min] > arr[j]){
					min = j;
					arr = swap(arr,min,j);
				}
			}	
		}
		return arr;
	}
    static int[] swap(int[] arr, int i1, int i2){
		int temp = arr[i1];
		arr[i1] = arr[i2];
		arr[i2] = temp;
		return arr;
    }
}

