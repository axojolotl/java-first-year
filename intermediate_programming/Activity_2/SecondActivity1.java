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

    static void formula1(){
        // double a = input("#");
        // double b = input("#")
        // double c = input("#");
        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }

    static void formula2(){
        // double a = input("#");
        // double b = input("#")
        // double c = input("#");
        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }

    static void formula3(){
        // double a = input("#");
        // double b = input("#")
        // double c = input("#");
        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }

    static void formula4(){
        // double a = input("#");
        // double b = input("#")
        // double c = input("#");
        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }
    
    static void formula5(){
        // double a = input("#");
        // double b = input("#")
        // double c = input("#");
        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }


    static void formula6(){
        // double a = input("#");
        // double b = input("#")
        // double c = input("#");
        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }

    static void formula7(){
        // double a = input("#");
        // double b = input("#")
        // double c = input("#");
        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }
    
    static void formula8(){
        // double a = input("#");
        // double b = input("#")
        // double c = input("#");
        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }

    static void formula9(){
        // double a = input("#");
        // double b = input("#")
        // double c = input("#");
        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }

    static void formula10(){
        // double a = input("#");
        // double b = input("#")
        // double c = input("#");
        // answer = a+b+c;
        // print("Answer is: " + answer) ;
    }

    static void switchCase(){
        int userChoice = switchInput("Choose from 1 to 10: ");

        switch(userChoice){
            case 1:
                formula1(); 
                break;
            case 2:
                formula2(); 
                break;
            case 3:
                formula3();
                break;
            case 4:
                formula4();
                break;
            case 5:
                formula5();
                break;
            case 6:
                formula6();
                break;
            case 7:
                formula7();
                break;
            case 8:
                formula8();
                break;
            case 9:
                formula9();
                break;
            case 10:
                formula10();
                break;
            default:
                print("Invalid entry");
                switchCase();
        }
    }
}
