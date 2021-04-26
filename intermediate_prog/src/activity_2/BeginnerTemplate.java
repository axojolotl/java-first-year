package activity_2;
import java.util.Scanner;

//THIS IS JUST A TEMPLATE
public class BeginnerTemplate {
        public static void run() {
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

        //static double formula1(double a,double b, double c){
        //// answer = a+b+c;
        ////return answer;
        //}

        //static double formula2(double a,double b, double c){
        //// answer = a+b+c;
        ////return answer;
        //}

        //static double formula3(double a,double b, double c){
        //// answer = a+b+c;
        ////return answer;
        //}

        //static double formula4(double a,double b, double c){
        //// answer = a+b+c;
        ////return answer;
        //}

        //static double formula5(double a,double b, double c){
        //// answer = a+b+c;
        ////return answer;
        //}


        //static double formula6(double a,double b, double c){
        //// answer = a+b+c;
        ////return answer;
        //}

        //static double formula7(double a,double b, double c){
        //// answer = a+b+c;
        ////return answer;
        //}

        //static double formula8(double a,double b, double c){
        //// answer = a+b+c;
        ////return answer;
        //}

        //static double formula9(double a,double b, double c){
        //// answer = a+b+c;
        ////return answer;
        //}

        //static double formula10(double a,double b, double c){
        //// answer = a+b+c;
        ////return answer;
        //}

        static void switchCase(){
            int userChoice = switchInput("Choose from 1 to 10: ");
            double a,b,c,answer;
            switch(userChoice){
                case 1:
                    //a = input("Enter a: ");
                    //b = input("Enter b: ");
                    //c = input("Enter c: ");
                    //answer = formula1(a,b,c);
                    //print("answer is: " + answer);
                    break;
                case 2:
                    //a = input("Enter a: ");
                    //b = input("Enter b: ");
                    //c = input("Enter c: ");
                    //answer = formula2(a,b,c);
                    //print("answer is: " + answer);
                    break;
                case 3:
                    //a = input("Enter a: ");
                    //b = input("Enter b: ");
                    //c = input("Enter c: ");
                    //answer = formula2(a,b,c);
                    //print("answer is: " + answer);
                    break;
                case 4:
                    //a = input("Enter a: ");
                    //b = input("Enter b: ");
                    //c = input("Enter c: ");
                    //answer = formula2(a,b,c);
                    //print("answer is: " + answer);
                    break;
                case 5:
                    //a = input("Enter a: ");
                    //b = input("Enter b: ");
                    //c = input("Enter c: ");
                    //answer = formula2(a,b,c);
                    //print("answer is: " + answer);
                    break;
                case 6:
                    //a = input("Enter a: ");
                    //b = input("Enter b: ");
                    //c = input("Enter c: ");
                    //answer = formula2(a,b,c);
                    //print("answer is: " + answer);
                    break;
                case 7:
                    //a = input("Enter a: ");
                    //b = input("Enter b: ");
                    //c = input("Enter c: ");
                    //answer = formula2(a,b,c);
                    //print("answer is: " + answer);
                    break;
                case 8:
                    //a = input("Enter a: ");
                    //b = input("Enter b: ");
                    //c = input("Enter c: ");
                    //answer = formula2(a,b,c);
                    //print("answer is: " + answer);
                    break;
                case 9:
                    //a = input("Enter a: ");
                    //b = input("Enter b: ");
                    //c = input("Enter c: ");
                    //answer = formula2(a,b,c);
                    //print("answer is: " + answer);
                    break;
                case 10:
                    // a = input("Enter a: ");
                    // b = input("Enter b: ");
                    // c = input("Enter c: ");
                    //answer = formula2(a,b,c);
                    //print("answer is: " + answer);
                    break;
                default:
                    print("Invalid entry");
                    switchCase();
            }
        }
    }