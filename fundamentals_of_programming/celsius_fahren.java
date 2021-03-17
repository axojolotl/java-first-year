import java.util.Scanner;

public class celsius_fahren {
    public static void main(String[] args) {
        loop();
        System.out.println("Goodbye!");

    }

    public static void loop() {
        Scanner sc = new Scanner(System.in);

        for (boolean a = true; a;) {

            System.out.println("\nMain Menu");
            System.out.println("a. Celsius to Fahrenheit\nb. Fahrenheit to Celsius\nc. Exit\n");
            System.out.print("Choose option [a, b, or c]: ");
            char ch = sc.next().toLowerCase().charAt(0);
            sc.close();

            if (ch == 'a') {
                convertToFahrenheit();
            } else if (ch == 'b') {
                convertToCelsius();
            } else if (ch == 'c') {
                a = false;
            } else {
                System.out.println("Invalid input. ");
            }

        }

    }

    public static void convertToCelsius() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("The Celsius equivalent is " + celsius);
        sc.close();

    }

    public static void convertToFahrenheit() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("The Fahrenheit equivalent is " + fahrenheit);
        sc.close();

    }
}
