// THIS IS ACTUALLY QUITE ANNOYING
package activity_4;
import java.util.Scanner;

public class Act4v1 {
    static final String[] choices = {
            "Area of a Circle", "Circumference of a Circle","Area of a Triangle", "Perimeter of a Triangle",
            "Area of a Rectangle", "Perimeter of a Rectangle","Volume of a Rectangular Solid",
            "Surface Area of a Rectangular Solid", "Volume of a Sphere", "Surface Area of a Sphere"
    };

    static void println(String msg){
        System.out.println(msg);
    }

    static void print(String msg){
        System.out.print(msg);
    }

    static double nInput(String msg){
        Scanner sc = new Scanner(System.in);
        print(msg);
        double n = sc.nextDouble();
        return n;
    }

    static double add(double a, double b){
        return a+b;
    }

    static double sub(double a, double b){
        return a-b;
    }

    static double mul(double a, double b){
        return a*b;
    }

    static double div(double a, double b){
        return a/b;
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
        return mul(0.5,mul(b,h));
    }

    static double perimeterTriangle(double a, double b, double c){
        return add(a,add(b,c));
    }

    static double areaRectangle(double w, double l){
        return mul(w,l);
    }

    static double perimeterRectangle(double l,double w){
        return mul(2,add(l,w));
    }

    static double volumeRectangle(double l, double w, double h){
        return mul(l,mul(w,h));
    }

    static double surfaceRectangle(double w, double l, double h){
        return mul(2,add(add(mul(w,l),mul(h,l)), mul(h,w)));
    }

    static double volumeSphere(double r){
        return mul(1.33333333333, Math.PI * Math.pow(r,3));
    }

    static double surfaceSphere(double r){
        return mul(4, Math.PI * Math.pow(r,2));
    }

    static double formulas(){
        double userInput = nInput("[Enter choice from 1 to " + choices.length + " ]: "),
                a,b,c,r,w,l,h;

        switch((int)userInput){
            case 1: //Area of a Circle (A = pi*r**2)
                r = nInput("Enter radius: ");
                return areaCircle(r);
            case 2: //Circumference of a Circle (C = 2*pi*r)
                r = nInput("Enter radius: ");
                return circumferenceCircle(r);
            case 3: //Area of a Triangle (A = 1/2*b*h or (b*h/2))
                b = nInput("Enter base: ");
                h = nInput("Enter height: ");
                return areaTriangle(b,h);
            case 4: //Perimeter of a Triangle (P = a+b+c)
                a = nInput("Enter first side: ");
                c = nInput("Enter second side: ");
                b = nInput("Enter base: ");
                return perimeterTriangle(a,b,c);
            case 5: //Area of a Rectangle (A = l*w)
                w = nInput("Enter width: ");
                l = nInput("Enter length: ");
                return areaRectangle(w,l);
            case 6: //Perimeter of a Rectangle (P = 2(l+w))
                l = nInput("Enter length: ");
                w = nInput("Enter width: ");
                return perimeterRectangle(l,w);
            case 7: //Volume of a Rectangular Solid (V = w*l*h)
                l = nInput("Enter length: ");
                w = nInput("Enter width: ");
                h = nInput("Enter height: ");
                return volumeRectangle(l,w,h);
            case 8: //Surface Area of a Rectangular Solid (A = 2*(w*l + h*l + h*w));
                l = nInput("Enter length: ");
                w = nInput("Enter width: ");
                h = nInput("Enter height: ");
                return surfaceRectangle(w,l,h);
            case 9: //Volume of a Sphere (V = (4/3)*pi*r**3)
                r = nInput("Enter radius: ");
                return volumeSphere(r);
            case 10: //Surface Area of a Sphere (A = 4*pi*r**2)
                r = nInput("Enter radius: ");
                return surfaceSphere(r);
            default:
                println("Invalid choice!!");
                formulas();
        }
        return -1;
    }
    public static void run() {
        menu(choices);
        println("= " + formulas());
    }
}
