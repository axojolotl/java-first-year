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

    static void switchCase(){
        int userChoice = switchInput("Choose from 1 to 10: ");

        //initialize variables here (e.g; double a,b,c,mass,force,acceleration)

        switch(userChoice){
            case 1:
                // double a = input("#");
                // double b = input("#");
                // double c = input("#");
                // answer = a+b+c;
                // print("Answer is: " + answer) ;
                break;
            case 2:
                // double a = input("#");
                // double b = input("#");
                // double c = input("#");
                // answer = a+b+c;
                // print("Answer is: " + answer) ;
                break;
            case 3:
                // double a = input("#");
                // double b = input("#");
                // double c = input("#");
                // answer = a+b+c;
                // print("Answer is: " + answer) ;
                break;
            case 4:
                // double a = input("#");
                // double b = input("#");
                // double c = input("#");
                // answer = a+b+c;
                // print("Answer is: " + answer) ;
                break;
            case 5:
                // double a = input("#");
                // double b = input("#");
                // double c = input("#");
                // answer = a+b+c;
                // print("Answer is: " + answer) ;
                break;
            case 6:
                // double a = input("#");
                // double b = input("#");
                // double c = input("#");
                // answer = a+b+c;
                // print("Answer is: " + answer) ;
                break;
            case 7:
                // double a = input("#");
                // double b = input("#");
                // double c = input("#");
                // answer = a+b+c;
                // print("Answer is: " + answer) ;
                break;
            case 8:
                // double a = input("#");
                // double b = input("#");
                // double c = input("#");
                // answer = a+b+c;
                // print("Answer is: " + answer) ;
                break;
            case 9:
                // double a = input("#");
                // double b = input("#");
                // double c = input("#");
                // answer = a+b+c;
                // print("Answer is: " + answer) ;
                break;
            case 10:
                // double a = input("#");
                // double b = input("#");
                // double c = input("#");
                // answer = a+b+c;
                // print("Answer is: " + answer) ;
                break;
            default:
                print("Invalid entry");
                switchCase();
        }
    }
}
