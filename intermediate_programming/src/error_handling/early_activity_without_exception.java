import java.util.Scanner;

public class early_activity_without_exception {

    public static void main(String... args){
        stringValidatorWithoutException();
    }

    static void stringValidatorWithoutException(){
        Scanner sc = new Scanner(System.in);
            System.out.println("String input: ");
            String str = sc.nextLine();
            int digits = digitCounter(str);

            if (str.length() >= 8 && digits >= 3)
                System.out.println("String is valid: " + str);
            else
                System.out.println("String is invalid.");
    }

    static int digitCounter(String str){
        char[] charStr = str.toCharArray();
        int ctr = 0;
        for(char i : charStr){
            if(i == '0'||i =='1' || i == '2' || 
                i == '3' || i == '4' || i == '5' ||
                i =='6' || i == '7' || i == '8' || 
                i == '9'){ ++ctr;}
        }
        return ctr;
    }
}
