public class array_practice {
   public static void main(String... args){
        int n = 2;
        int[][] matrix = new int[5][5];
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                matrix[i][j] = n;
                n+=2;
            }
        }
        //PRINTER
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j<matrix.length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
   } 
}
