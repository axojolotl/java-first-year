import java.util.Scanner;
public class SecondActivity{
    static String[] choices = {
    "Area of a Circle", "Circumference of a Circle",
    "Area of a Triangle", "Perimeter of a Triangle",
    "Area of a Rectangle", "Perimeter of a Rectangle",
    "Volume of a Rectangular Solid", 
    "Surface Area of a Rectangular Solid",
    "Volume of a Sphere", "Surface of a Sphere"
    };

    static void println(String msg){
        System.out.println(msg);
    }

    static int intInput(String msg, Scanner sc){
        System.out.print(msg);
        int n = sc.nextInt();
        return n;
    }

    static double doubleInput(String msg, Scanner sc){
        System.out.print(msg);
        double n = sc.nextDouble();
        return n;
    }
    
    static void formulas(Scanner sc){
        int userInput = intInput("[Enter choice from 1 to " + choices.length + " ]: ", sc);
        double r, area, circumference, b, h;
        switch(userInput){
            case 1: 
                //Area of a Circle (A = pi*r**2)
                r = doubleInput("Enter radius: ", sc);
                area = Math.PI*Math.pow(r,2);
                println("The area is: " + area);
                break;
            case 2:
                //Circumference of a Circle (C = 2*pi*r)
                r = doubleInput("Enter radius: ", sc);
                circumference = 2*Math.PI*r;
                println("The circumference is: " + circumference );
                break;
            case 3: 
                //Area of a Triangle (A = 1/2*b*h)
                b = doubleInput("Enter base: ", sc);
                h = doubleInput("Enter height: ", sc);
                area = (1/2)*b*h;
                println("The area is: " + area);
                break;
            case 4:
                //Perimeter of a Triangle
                break;
            case 5:     
                //Area of a Rectangle
                break;
            case 6: 
                //Perimeter of a Rectangle
                break;
            case 7: 
                //Volume of a Rectangular Solid
                break;
            case 8: 
                //Surface Area of a Rectangular Solid
                break;
            case 9: 
                //Volume of a Sphere
                break;
            case 10: 
                //Surface of a Sphere
                break;
            case 0:
                break;
            default:
                println("Invalid choice!!");
                formulas(sc);
                
        }
    }

    static void menu(String[] choices){
        println("=========MENU=========");

        for (int i = 1; i <= choices.length; i++)
            println(i + "." + choices[i-1]);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu(choices);
        formulas(sc);
    }


}
