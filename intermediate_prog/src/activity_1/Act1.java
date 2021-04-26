package activity_1;

import java.util.Scanner;

public class Act1 {
        static int a = 0, b = 0, c = 0;
        static String op = "";

        public static void run() {
            //main method
            input();
            computation();
            output();
        }

        static void input(){
            //input
            Scanner sc = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);

            printer("Enter first number: "); a = sc.nextInt();
            printer("Enter second number: "); b = sc.nextInt();
            printer("Enter operator(+,-,*,/,%) "); op = sc2.nextLine();
            sc.close();
            sc2.close();
        }

        static void computation(){
            //computation
            c = 0;
            switch(op){
                case "+": c = a + b; break;
                case "-": c = a - b; break;
                case "*": c = a * b; break;
                case "/": c = a / b; break;
                case "%": c = a % b; break;
            }
        }

        static void output(){
            //output
            printer("Result: " + c + "\n");
        }

        static void printer(String msg){
            System.out.print(msg);
        }
}
