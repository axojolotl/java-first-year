import java.util.Scanner;

public class Array2dLab {
   public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");    
        int numRows = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int numCols = sc.nextInt();

        int[][] myArray = new int[numRows][numCols];

        Matrix(myArray, sc);
        printMatrix(myArray);
    }

    public static void Matrix(int[][] myArray, Scanner sc){
        int ctr = 1;

        for(int i = 0 ; i < myArray.length; i++)
            for(int j = 0 ; j < myArray[i].length; j++){
                System.out.println("Enter element " + ctr);
                myArray[i][j] = sc.nextInt();
                ctr++;
            }
        sc.close();
    }

    public static void printMatrix(int[][] myArray){
        System.out.println("Matrix input:\n");

        for(int i = 0; i < myArray.length; i++){
            for(int j = 0; j < myArray[i].length; j++){
                System.out.print("\t" + myArray[i][j]);
            }
            System.out.println();
        }

        System.out.println("Transposed matrix \n");

        for(int i = 0 ; i < myArray[i].length; i++){
            int j = 0;
            while(j<myArray.length){
                System.out.print("\t"+ myArray[j][i]);
                j++;
            }
            System.out.println();
        }
   } 
}
