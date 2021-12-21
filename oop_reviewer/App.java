import java.awt.*;
import _Shape.circle.Circle;
import _Shape.shape.Shape;
import _Shape.square.Square;

public class App {
    public static void main(String... args) {

        //create object instance.
        Shape c1 = new Circle("Meters", "Blue", 2);

        System.out.println(c1.getColor());
        System.out.println(c1.getUnit());

        System.out.println("=======================new attribute values=======================");
        c1.setColor("White");
        System.out.println(c1.getColor());

        c1.setUnit("Centimeters");
        System.out.println(c1.getUnit());

        System.out.println("=============constructor overloading/no arguments used=================");
        Shape anotherOne = new Circle();
        System.out.println(anotherOne.getColor());

        System.out.println("The area of c1: " + c1.getArea());

        Shape squarePizza = new Square("meters","yellow",12,3);
        System.out.println(squarePizza.getArea());

        //Shape aCircle = new Circle("meters", "blue", 2);
        //Shape aSquare = new Square("millimeters","yellow",5,5);
        //Shape anotherCircle = new Circle();
        //Shape anotherSquare = new Square();

        //ARRAY OF OBJECTS
        Shape[] smallPizza = new Circle[5];

        for(int i = 0 ; i < smallPizza.length; i++){
            smallPizza[i] = new Circle("inches", "yellow", i+3);
            System.out.println(smallPizza[i].getArea());
        }

        for(Shape i : smallPizza){
            System.out.println(i.getColor());
        }
    }
}
