import java.util.Scanner;   
import java.text.DecimalFormat;

public class switchStatementActivity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,##0.00");

        double discount = 0, fare = 0, newFare = 0; char passengerType,businessClass; 
        String passengerTypeStr, businessClassStr; int businessClassCharge = 0;

        System.out.println("Enter fare: ");
        fare = sc.nextDouble();

        System.out.println("Passenger type [O: Ordinary, S: Student, C: Senior Citizen]: ");
        passengerTypeStr = sc.next();

        System.out.print("Travelling in business class? [Y/N]:\n");
        businessClassStr = sc.next();
        
        passengerTypeStr = passengerTypeStr.toLowerCase();
        passengerType = passengerTypeStr.charAt(0);
        businessClassStr = businessClassStr.toLowerCase();
        businessClass = businessClassStr.charAt(0);

        switch(businessClass){

            case 'y':
                switch (passengerType){
                    case 'o':
                        discount = 0;
                        businessClassCharge = 1000;
                        newFare = fare - discount + businessClassCharge;
                        break;
                    case 's':
                        discount = fare*.05;
                        businessClassCharge = 700;
                        newFare = fare - discount + businessClassCharge;
                        break;
                    case 'c':
                        discount = fare*.1;
                        businessClassCharge = 500;
                        newFare = fare - discount + businessClassCharge;
                        break;
                }
                break;

            case 'n':
                switch (passengerType){
                    case 'o':
                        businessClassCharge = 0;
                        discount = 0;
                        newFare = fare - discount;
                        break;
                    case 's':
                        businessClassCharge = 0;
                        discount = fare*.05;
                        newFare = fare - discount;
                        break;
                    case 'c':
                        businessClassCharge = 0;
                        discount = fare*.1;
                        newFare = fare - discount;
                        break;
                }
                break;
        }
        System.out.println("Discount: " + df.format(discount));
        System.out.println("Business class charge: " + df.format(businessClassCharge));
        System.out.println("New fare: " + df.format(newFare));
        sc.close();
    }
}
