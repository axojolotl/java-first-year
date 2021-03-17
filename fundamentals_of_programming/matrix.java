import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        a1();
    }
    public static void a1(){
        Scanner sc = new Scanner(System.in);

        int n = 0, sqc;

        System.out.print("Enter matrix to generate (n by n): ");
        n = sc.nextInt();
        sc.close();
        
        sqc = n * n;

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++){

                if(n%2==0){
                    if(i%2==0){
                        if(i > 0 && j == 0){
                            sqc = sqc - n - 1;
                        }
                        
                        System.out.print(sqc);
                        sqc--;
                    }
                    
                    else{
                        if(j == 0){
                            sqc = (sqc - n ) +1;
                        }
                        
                        System.out.print(sqc);
                        sqc++;
                    }
                    if( j < n-1){
                        System.out.print("\t");
                    }
                }
                else{
                    if(i%2!=0){
                        if(i > 0 && j == 0){
                            sqc = sqc - n - 1;
                        }
                        
                        System.out.print(sqc);
                        sqc--;
                    }
                    
                    else{
                        if(j == 0){
                            sqc = (sqc - n ) +1;
                        }
                        System.out.print(sqc);
                        sqc++;
                    }
                    if( j < n-1){
                        System.out.print("\t");
                    }
                }
            }
            System.out.println();
        }
    }
}

