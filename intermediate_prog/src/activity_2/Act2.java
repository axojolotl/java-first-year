package activity_2;

import java.util.Scanner;

public class Act2 {

    static String[] choices = {
            "Area of a Circle", "Circumference of a Circle","Area of a Triangle", "Perimeter of a Triangle",
            "Area of a Rectangle", "Perimeter of a Rectangle","Volume of a Rectangular Solid",
            "Surface Area of a Rectangular Solid", "Volume of a Sphere", "Surface Area of a Sphere"
    };

    static void println(String msg){
        System.out.println(msg);
    }

    static double nInput(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(msg);
        double n = sc.nextDouble();
        return n;
    }

    static void menu(String[] choices){
        println("=========MENU=========");

        for (int i = 1; i <= choices.length; i++)
            println(i + "." + choices[i-1]);
    }

    static double areaCircle(double r){
        return Math.PI*Math.pow(r,2);
    }

    static double circumferenceCircle(double r){
        return 2*Math.PI*r;

    }

    static double areaTriangle(double b, double h){
        return 0.5*b*h;
    }

    static double perimeterTriangle(double a, double b, double c){
        return a+b+c;
    }

    static double areaRectangle(double w, double l){
        return w*l;
    }

    static double perimeterRectangle(double l,double w){
        return 2*(l+w);
    }

    static double volumeRectangle(double l, double w, double h){
        return l*w*h;
    }

    static double surfaceRectangle(double w, double l, double h){
        return 2*(w*l + h*l + h*w);
    }

    static double volumeSphere(double r){
        return 1.33333333333 * Math.PI * Math.pow(r,3);
    }

    static double surfaceSphere(double r){
        return 4 * Math.PI * Math.pow(r,2);
    }

    static void formulas(){
        double userInput = nInput("[Enter choice from 1 to " + choices.length + " ]: "),
                a,b,c,r,w,l,h;

        switch((int)userInput){
            case 1: //Area of a Circle (A = pi*r**2)
                r = nInput("Enter radius: ");
                println("The area of your circle is: " + areaCircle(r));
                break;
            case 2: //Circumference of a Circle (C = 2*pi*r)
                r = nInput("Enter radius: ");
                println("The circumference of your circle is: " + circumferenceCircle(r));
                break;
            case 3: //Area of a Triangle (A = 1/2*b*h or (b*h/2))
                b = nInput("Enter base: ");
                h = nInput("Enter height: ");
                println("The area of your triangle is: " + areaTriangle(b,h));
                break;
            case 4: //Perimeter of a Triangle (P = a+b+c)
                a = nInput("Enter first side: ");
                c = nInput("Enter second side: ");
                b = nInput("Enter base: ");
                println("The perimeter of your triangle is: " + perimeterTriangle(a,b,c));
                break;
            case 5: //Area of a Rectangle (A = l*w)
                w = nInput("Enter width: ");
                l = nInput("Enter length: ");
                println("The area of your rectangle is: " + areaRectangle(w,l));
                break;
            case 6: //Perimeter of a Rectangle (P = 2(l+w))
                l = nInput("Enter length: ");
                w = nInput("Enter width: ");
                println("The perimeter of your rectangle is: " + perimeterRectangle(l,w));
                break;
            case 7: //Volume of a Rectangular Solid (V = w*l*h)
                l = nInput("Enter length: ");
                w = nInput("Enter width: ");
                h = nInput("Enter height: ");
                println("The volume of your rectangle is: " + volumeRectangle(l,w,h));
                break;
            case 8: //Surface Area of a Rectangular Solid (A = 2*(w*l + h*l + h*w));
                l = nInput("Enter length: ");
                w = nInput("Enter width: ");
                h = nInput("Enter height: ");
                println("The surface area of your rectangle is: " + surfaceRectangle(w,l,h));
                break;
            case 9: //Volume of a Sphere (V = (4/3)*pi*r**3)
                r = nInput("Enter radius: ");
                println("The volume of your sphere is: " + volumeSphere(r));
                break;
            case 10: //Surface Area of a Sphere (A = 4*pi*r**2)
                r = nInput("Enter radius: ");
                println("The surface area of your sphere is: " + surfaceSphere(r));
                break;
            default:
                println("Invalid choice!!");
                formulas();
        }
    }
    public static void run() {
        menu(choices);
        formulas();
    }
}