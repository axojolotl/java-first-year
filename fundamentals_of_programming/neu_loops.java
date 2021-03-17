import java.util.Scanner;
import java.text.DecimalFormat;

public class neu_loops {
    public static void main(String[] args) {

        lab_assessment_2();

    }

    public static void loop1() {
        Scanner input = new Scanner(System.in);

        int n, ctr = 1;
        int square = 0, cube = 0;
        System.out.println("Enter n: ");
        n = input.nextInt();
        input.close();
        System.out.println("\nInteger\tSquare\tCube\n");
        while (ctr <= n) {
            square = ctr * ctr;
            cube = square * ctr;
            System.out.println(ctr + "\t" + square + "\t" + cube);
            ctr++;
        }
    }

    public static void lec_assesment_1() {

        int i = 1, n = 4, s = 1, p = 0;

        while (i <= n) {
            System.out.print("n = " + n + ", ");
            System.out.print("i = " + i + ", ");
            System.out.print("p = " + p + ", ");
            System.out.println("s = " + s);
            s = i * i;
            p += s;
            i++;
        }
        System.out.println("value of s is " + s);
        System.out.println("value of p is " + p);

    }

    public static void lec_assessment_2() {

        int a = 1, ctr = 5, t = 0, cb = 0;
        do {
            cb = a * a * a;
            System.out.println("Number is " + a + " and the cube of " + a + " is " + cb);
            a++;
            t += cb;
        } while (a <= ctr);
        System.out.println("\nThe total of the cubed number is " + t);
    }

    public static void lec_assessment_3() {

        DecimalFormat df = new DecimalFormat("##, ###.00");
        int year = 6;
        double $my_investment = 1000.0, interest = 0.0, $money = 0.0;
        // Printing of the Headers
        System.out.print("Year\t");
        System.out.print("Amount\t\t");
        System.out.print("Interest\t");
        System.out.print("Year-end Money");
        // Place the cursor to the next line
        System.out.println();
        // Loop details
        for (year = 1; year <= 5; year++) {
            interest = $my_investment * 0.1;
            $money = $my_investment + interest;
            // Printing of Details
            System.out.print(year + "\t");
            System.out.print(df.format($my_investment) + "\t");
            System.out.print(df.format(interest) + "\t\t" + df.format($money));
            // Cursor to proceed on the next line
            System.out.println();
            $my_investment = $money; // Set current money
        } // to investment
    }

    public static void lab_assessment_1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        int i = 1;
        while (n >= 1) {
            System.out.print(n + " ");
            System.out.print(i + " ");
            i++;
            n--;
        }
    }

    public static void lab_assessment_2() {
        Scanner sc = new Scanner(System.in);
        int i = 1, number = 0, sumOfOdds = 0, odds;

        System.out.print("Enter number: ");
        number = sc.nextInt();
        System.out.print("Odd numbers are: ");
        do {
            odds = i * 2 - 1;
            System.out.print(odds + " ");
            sumOfOdds += odds;
            i++;
        } while (i <= number);
        System.out.println("\nThe sum of odd numbers up to " + number + " term is " + sumOfOdds);
    }

}
