package midterm_exam.bscs;
import java.util.Scanner;
public class Car {
    public String owner, yearModel;
    public double amountLeft;
    public void owner(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Owner: ");
        this.owner = sc.nextLine();
        System.out.print("Year Model: ");
        this.yearModel = sc.nextLine();
    }

    public double upgradeAccessories(double availableAmount){
        this.amountLeft = availableAmount;
        double ac = 21_500, leatherSeats = 14_400,
                backWipers = 6_250, fogLights = 3_300;
        boolean acInstalled = false, lsInstalled = false,
                bwInstalled = false, flInstalled = false;

        if(amountLeft >= ac){
            acInstalled = true;
            amountLeft -= ac;
        }
        System.out.println("Installed AC: " + acInstalled);
        if (amountLeft >= leatherSeats && acInstalled){
            lsInstalled = true;
            amountLeft -= leatherSeats;
        }
        System.out.println("Installed Leather Seats: " + lsInstalled);
        if (amountLeft >= backWipers && acInstalled && lsInstalled){
            bwInstalled = true;
            amountLeft -= backWipers;
        }
        System.out.println("Installed Back Wipers: " + bwInstalled);

        if (amountLeft >= fogLights && acInstalled && lsInstalled && bwInstalled){
            flInstalled = true;
            amountLeft -= fogLights;
        }
        System.out.println("Installed Fog Lights: " + flInstalled);

        return amountLeft;
    }
}
