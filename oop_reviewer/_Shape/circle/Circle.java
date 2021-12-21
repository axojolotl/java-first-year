package _Shape.circle;

import _Shape.shape.Shape;

//this class inherits from the shape class.
public class Circle extends Shape {
    
    protected double radius;


    public Circle(String unitOfMeasurement, String color, double radius){
        
        super(unitOfMeasurement, color);
        //these are the constructor attributes that this class will inherit from the shape class.
        //super() <- acts as the super constructor

        //this.radius is exclusive to the circle class. which is why we added double radius 
        //in the constructor parameter.
        this.radius = radius;
    }

    //this is a constructor that will be called if there are no arguments in the constructor.
    public Circle(){
        this.radius = 1;
    }

    //this is the method that we overrode from the shape class. 
    public double getArea(){
        this.area = Math.PI*this.radius*this.radius;
        return this.area;
    }
}
