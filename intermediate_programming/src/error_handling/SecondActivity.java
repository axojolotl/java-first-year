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

    static void print(String msg){
        System.out.print(msg);
    }

    static int intInput(String msg, Scanner sc){
        print(msg);
        int n = sc.nextInt();
        return n;
    }

    static double doubleInput(String msg, Scanner sc){
        print(msg);
        double n = sc.nextDouble();
        return n;
    }
    
    static void formulas(Scanner sc){
        int userInput = intInput("[Enter choice from 1 to " + choices.length + " ]: ", sc);
        double r, area, circumference;
        switch(userInput){
            case 1: 
                //Area of a Circle (A = pi*r**2)
                r = doubleInput("Enter radius: ", sc);
                area = Math.PI*Math.pow(r,2);
                print("The area is: " + area + "\n");
                break;
            case 2:
                //Circumference of a Circle
                r = doubleInput("Enter radius: ", sc);
                circumference = 2*Math.PI*r;
                print("The circumference is: " + circumference + "\n");
                break;
            case 3: 
                //Area of a Triangle
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
            default:
                print("Invalid choice!!\n");
                formulas(sc);
                
        }
    }

    static void menu(String[] choices){
        print("=========MENU=========\n");

        for (int i = 1; i <= choices.length; i++)
            print(i + "." + choices[i-1] + "\n");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        menu(choices);
        formulas(sc);
    }


}
