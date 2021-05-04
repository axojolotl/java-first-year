package midterm_exam.bscs;

import java.util.Scanner;

public class CarUpgrade {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        Car a = new Car();
        a.owner();
        System.out.print("Available Amount Before Upgrade: ");
        double startAmount = sc.nextDouble();
        double amountLeft = a.upgradeAccessories(startAmount);
        System.out.println("Amount Remaining After Upgrade: " + amountLeft);

    }
}
