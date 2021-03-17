import java.util.Scanner;
import java.text.DecimalFormat;

public class assessment_3 {
    public static void main(String[] args){

        //INSTANCES

        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$" + "#,###,###.00" + " dollars");

        //INPUT

        System.out.print("Enter name of student: "); 
        String name = input.nextLine();

        System.out.print("Enter number of units: ");
        int numUnits = input.nextInt();

        System.out.print("Enter price per unit: ");
        double pricePerUnit = input.nextDouble();

        //OUTPUT

        double computedFee = numUnits*pricePerUnit;
        System.out.println("The computed tuition fee: " + df.format(computedFee));

        System.out.println(name + " ,you may now avail the following payment mode:\n\nPayment method: ");

        double cashPay = computedFee - computedFee*0.10;
        System.out.println("Cash Payment: " + df.format(cashPay));

        double twoInst = computedFee + computedFee*0.05;
        System.out.println("2-installments: " + df.format(twoInst));

        double threeInst = computedFee + computedFee*0.10;
        System.out.println("3-installments: " + df.format(threeInst));

        input.close();
        
    }
}
