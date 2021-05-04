package midterm_exam.bscs;

import java.util.Scanner;

public class CarUpgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car a = new Car();

        System.out.println("Available Amount Before Upgrade: ");
        a.upgradeAccessories(sc.nextDouble());
    }
}
