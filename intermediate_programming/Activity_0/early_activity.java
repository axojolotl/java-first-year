import java.util.Scanner;

public class early_activity {
    public static void main(String[] args) throws Exception {
        boolean x = true;
        while(x)
            stringValidatorWithException();
    }

    static void stringValidatorWithException(){
        Scanner sc = new Scanner(System.in);
            try{
                System.out.println("String input: ");
                String str = sc.nextLine();
                sc.close();
                int digits = digitCounter(str);

                if (str.length() >= 8 && digits >= 3)
                    System.out.println("String is valid: " + str);
                else
                    throw new Exception();
                    
            } catch (Exception se){
                System.out.println("String is invalid.");
            }
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
