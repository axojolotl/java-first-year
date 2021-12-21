package _Shape.square;
import _Shape.shape.Shape;

public class Square extends Shape {

    private double length, width;

    public Square(String unitOfMeasurement, String color, double length, double width){
        super(unitOfMeasurement,color);
        this.length = length;
        this.width = width;
    }

    public Square(){
        this.length = 1;
        this.width = 1;
    }

    public double getArea() {
        this.area = length*width;
        return this.area;
    }
}
