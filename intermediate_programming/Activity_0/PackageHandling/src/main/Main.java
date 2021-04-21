package main;
import math.Arithmetic;
import math.Constants;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        System.out.println(Arithmetic.add(5, 6));
        System.out.println(Arithmetic.sub(10,3));

        System.out.println(Arithmetic.div(Constants.PI, (double) Constants.C));
    }
}
