import java.util.Scanner;

public class surface_area_volume {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter diameter: ");
        double diameter = sc.nextDouble();
        double radius = diameter / 2;

        System.out.print("Enter height: ");

        double height = sc.nextDouble();
        sc.close();

        computeLateralSurface(radius, height);
        computeVolume(radius, height);

    }

    public static void computeLateralSurface(double radius, double height) {
        double lateralArea = 2 * 3.1416 * radius * (radius + height);
        System.out.println("Lateral surface of the cylinder is " + lateralArea);

    }

    public static void computeVolume(double radius, double height) {
        double volume = 3.1416 * radius * radius * height;
        System.out.println("Volume of the cylinder is " + volume);
    }
}
