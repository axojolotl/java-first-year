import java.util.Scanner;

public class SecondActivity{

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

    static void areaCircle(){ 
        double r = nInput("Enter radius: "),
        area = Math.PI*Math.pow(r,2);
        println("The area is: " + area);
    }

    static void circumferenceCircle(){
        double r = nInput("Enter radius: "),
        circumference = 2*Math.PI*r;
        println("The circumference is: " + circumference );
    }

    static void areaTriangle(){
        double b = nInput("Enter base: "),
        h = nInput("Enter height: "),
        area = 0.5*b*h;
        println("The area is: " + area);
    }

    static void perimeterTriangle(){
        double a = nInput("Enter first side: "),
        c = nInput("Enter second side: "),
        b = nInput("Enter base: "),
        perimeter = a+b+c;
        println("The perimeter is: " + perimeter);
    }

    static void areaRectangle(){
        double w = nInput("Enter width: "),
        l = nInput("Enter length: "),
        area = w*l;
        println("The area is: " + area);
    }

    static void perimeterRectangle(){
        double l = nInput("Enter length: "),
        w = nInput("Enter width: "),
        perimeter = 2*(l+w);
        println("The perimeter is: " + perimeter);
    }

    static void volumeRectangle(){
        double l = nInput("Enter length: "),
        w = nInput("Enter width: "),
        h = nInput("Enter height: "),
        volume = l*w*h;
        println("The volume is: " + volume);
    }
    
    static void surfaceRectangle(){
        double l = nInput("Enter length: "),
        w = nInput("Enter width: "),
        h = nInput("Enter height: "),
        area = 2*(w*l + h*l + h*w);
        println("The surface area is: " + area);
    }

    static void volumeSphere(){
        double r = nInput("Enter radius: "),
        volume = 1.33333333333 * Math.PI * Math.pow(r,3);
        println("The volume is: " + volume);
    }

    static void surfaceSphere(){
        double r = nInput("Enter radius: "),
        area = 4 * Math.PI * Math.pow(r,2);
        println("The surface area is: " + area);
    }

    static void formulas(){
        double userInput = nInput("[Enter choice from 1 to " + choices.length + " ]: ");
        switch((int)userInput){
            case 1: //Area of a Circle (A = pi*r**2)
                areaCircle();
                break;
            case 2: //Circumference of a Circle (C = 2*pi*r)
                circumferenceCircle();
                break;
            case 3: //Area of a Triangle (A = 1/2*b*h or (b*h/2))
                areaTriangle();
                break;
            case 4: //Perimeter of a Triangle (P = a+b+c)
                perimeterTriangle();
                break;
            case 5: //Area of a Rectangle (A = l*w)
                areaTriangle();
                break;
            case 6: //Perimeter of a Rectangle (P = 2(l+w))
                perimeterRectangle();
                break;
            case 7: //Volume of a Rectangular Solid (V = w*l*h)
                volumeRectangle();
                break;
            case 8: //Surface Area of a Rectangular Solid (A = 2*(w*l + h*l + h*w));
                surfaceRectangle();
                break;
            case 9: //Volume of a Sphere (V = (4/3)*pi*r**3)
                volumeSphere();
                break;
            case 10: //Surface Area of a Sphere (A = 4*pi*r**2)
                surfaceSphere();
                break;
            default:
                println("Invalid choice!!");
                formulas();
        }
    }
    public static void main(String[] args) {
        menu(choices);
        formulas();
    }
}