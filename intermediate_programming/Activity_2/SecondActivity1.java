import java.util.Scanner;

public class SecondActivity1 {
    public static void main(String[] args) {
        menu();
        switchCase();
    }
    
    static void print(String s){
        System.out.println(s);
    }

    static double input(String s){
        Scanner sc = new Scanner(System.in);
        System.out.print(s);
        double d = sc.nextDouble();
        return d;
    }

    static int switchInput(String s){
        Scanner sc = new Scanner(System.in);
        System.out.println(s);
        int n = sc.nextInt();
        return n;
    }

    static void menu(){
        print("MENU---------------------");
        print("1.");
        print("2.");
        print("3.");
        print("4.");
        print("5.");
        print("6.");
        print("7.");
        print("8.");
        print("9.");
        print("10.");
    }

    static void formula1(double a, double b, double c){

        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }

    static void formula2(double a, double b, double c){

        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }

    static void formula3(double a, double b, double c){
    
        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }

    static void formula4(double a, double b, double c){

        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }
    
    static void formula5(double a, double b, double c){

        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }


    static void formula6(double a, double b, double c){

        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }

    static void formula7(double a, double b, double c){

        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }
    
    static void formula8(double a, double b, double c){

        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }

    static void formula9(double a, double b, double c){

        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }

    static void formula10(double a, double b, double c){

        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }

    static void switchCase(){
        int userChoice = switchInput("Choose from 1 to 10: ");
        double a,b,c;
        switch(userChoice){
            case 1:
                a = input("#");
                b = input("#");
                c = input("#");
                formula1(a,b,c); 
                break;
            case 2:
                a = input("#");
                b = input("#");
                c = input("#");
                formula2(a,b,c); 
                break;
            case 3:
                a = input("#");
                b = input("#");
                c = input("#");
                formula3(a,b,c);
                break;
            case 4:
                a = input("#");
                b = input("#");
                c = input("#");
                formula4(a,b,c);
                break;
            case 5:
                a = input("#");
                b = input("#");
                c = input("#");
                formula5(a,b,c);
                break;
            case 6:
                a = input("#");
                b = input("#");
                c = input("#");
                formula6(a,b,c);
                break;
            case 7:
                a = input("#");
                b = input("#");
                c = input("#");
                formula7(a,b,c);
                break;
            case 8:
                a = input("#");
                b = input("#");
                c = input("#");
                formula8(a,b,c);
                break;
            case 9:
                a = input("#");
                b = input("#");
                c = input("#");
                formula9(a,b,c);
                break;
            case 10:
                a = input("#");
                b = input("#");
                c = input("#");
                formula10(a,b,c);
                break;
            default:
                print("Invalid entry");
                switchCase();
        }
    }
}
