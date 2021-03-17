import java.util.Arrays;
public class RemoveDuplicates{
    public void execute(){
        int[] myArray = {3,1,2,5,0,2,1,5,4,0};

        for (int i = 0; i < myArray.length; i++) 
            for (int j = i+1; j < myArray.length; j++) 
                if(myArray[i] == myArray[j])
                    myArray = pop(j, myArray);
        
        System.out.println(Arrays.toString(myArray));
    }

    public int[] pop(int index, int[] originArray){
        int[] tempArray = new int[originArray.length-1];

        for (int i = 0, j = 0; i < tempArray.length; j++,i++) {
            if(i == index)
                j--;
            else
                tempArray[j] = originArray[i];
        }
        return tempArray;
    }
}

/**
import java.util.Arrays;
public class Main{
    public static void main(String... args){
        int[] myArray = {3,1,2,5,0,2,1,5,4,0};

        for (int i = 0; i < myArray.length; i++) 
            for (int j = i+1; j < myArray.length; j++) 
                if(myArray[i] == myArray[j])
                    myArray = pop(j, myArray);
        
        System.out.println(Arrays.toString(myArray));
    }

    public static int[] pop(int index, int[] originArray){
        int[] tempArray = new int[originArray.length-1];

        for (int i = 0, j = 0; i < tempArray.length; j++,i++) {
            if(i == index)
                j--;
            else
                tempArray[j] = originArray[i];
        }
        return tempArray;
    }
}
*/
