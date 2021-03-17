import java.util.Scanner;

public class removal_quiz{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);

        char c1=' ',c2=' ';
        int r =0;

        System.out.println("Enter 1st character: ");
        c1 = sc.next().charAt(0);
        System.out.println("Enter 2nd character: ");
        c2 = sc.next().charAt(0);
        System.out.println("Enter number of rows: ");
        r = sc.nextInt();

        sc.close();

        for(int i=0; i<r;i++){
            for(int j=r;j>i;j--){
                System.out.print("-");
            }
            if(i%2!=0){
                System.out.print(c2);
            }
            else{
                System.out.print(c1);
            }
            System.out.println();
        }
    }
}