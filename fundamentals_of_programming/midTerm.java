import java.util.Scanner;
import java.text.DecimalFormat;

public class midTerm {
    public static void main(String[] args) {

        String chosenItem = "", paymentMode = "cash/3mnths/6/12";
        double itemPrice = 0, disOrInt = 0, totalAmount = 0 ;
        int months = 0;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("$" + "###,###,##0.00");

        System.out.print("Sales Input: ");

        System.out.print("\n\nEnter Product 1: ");
        String product1 = sc.next();
        System.out.print("Enter Price: ");
        String price1 = sc.next();
        price1 = price1.replaceAll("[$,]", "");
        Double p1 = Double.parseDouble(price1);

        System.out.print("\nEnter Product 2: ");
        String product2 = sc.next();
        System.out.print("Enter Price: ");
        String price2 = sc.next();
        price2 = price2.replaceAll("[$,]", "");
        Double p2 = Double.parseDouble(price2);

        System.out.print("\nEnter Product 3: ");
        String product3 = sc.next();
        System.out.print("Enter Price: ");
        String price3 = sc.next();
        price3 = price3.replaceAll("[$,]", "");
        Double p3 = Double.parseDouble(price3);

        System.out.print("\nInput Mode of Payment Terms");

        System.out.print("\n\nCash Discount(Percent): ");
        int cashDiscount = sc.nextInt();
        System.out.print("You input " + cashDiscount + "% for Cash Discount" );

        System.out.print("\n\n3 Months Installment(Percent): ");
        int threeMonthsInstallment = sc.nextInt();
        System.out.print("You input " + threeMonthsInstallment + "% interest for 3 Months Installment" );

        System.out.print("\n\n6 Months Installment(Percent): ");
        int sixMonthsInstallment = sc.nextInt();
        System.out.print("You input " + sixMonthsInstallment + "% interest for 6 Months Installment");

        System.out.print("\n\n12 Months Installment(Percent): ");
        int twelveMonthsInstallment = sc.nextInt();
        System.out.print("You input " + twelveMonthsInstallment + "% interest for 12 Months Installment");

        System.out.println("\n\nMain Menu\n");

        System.out.println("Press I: " + product1);
        System.out.println("Press S: " + product2);
        System.out.println("Press X: " + product3);

        System.out.print("\nEnter Item: ");
        String chosenItemStr = sc.next();
        char chosenItemChar = chosenItemStr.toUpperCase().charAt(0);

        switch(chosenItemChar){
            case 'I': System.out.println(product1 + " " +  df.format(p1));
                chosenItem = product1;
                itemPrice = p1; 
                break;
            case 'S': System.out.println(product2 + " " + df.format(p2));
                chosenItem = product2;
                itemPrice = p2; 
                break;
            case 'X': System.out.println(product3 + " " + df.format(p3));
                chosenItem = product3;
                itemPrice = p3; 
                break;
        }

        System.out.println("Your Item: " + chosenItem);
        System.out.println("Price: " + df.format(itemPrice));

        System.out.println("\nSelect Mode of Payment\n");

        System.out.println("Press 1: Cash " + cashDiscount + "% Discount");
        System.out.println("Press 2: 3 Months Installment " + threeMonthsInstallment + "% Interest");
        System.out.println("Press 3: 6 Months Installment " + sixMonthsInstallment + "% Interest");
        System.out.println("Press 4: 12 Months Installment " + twelveMonthsInstallment + "% Interest");

        System.out.print("\nEnter Mode of Payment: ");
        int modeOfPayment = sc.nextInt();

        switch(modeOfPayment){
            case 1: paymentMode = "Cash"; 
                    months = 0;
                    disOrInt = itemPrice * (cashDiscount*.01); 
                    totalAmount = itemPrice - disOrInt;
                    break;
            case 2: paymentMode = "3 Months Installment";
                    months = 3;
                    disOrInt = itemPrice * (threeMonthsInstallment*.01); 
                    totalAmount = disOrInt + itemPrice;
                    System.out.println(disOrInt);
                    break;
            case 3: paymentMode = "6 Months Installment";
                    months = 6;
                    disOrInt = itemPrice * (sixMonthsInstallment*.01); 
                    totalAmount = disOrInt + itemPrice;
                    break;
            case 4: paymentMode = "12 Months Installment";
                    months = 12;
                    disOrInt = itemPrice * (twelveMonthsInstallment*.01); 
                    totalAmount = disOrInt + itemPrice;
                    break;
        }

        System.out.println("\nMode of Payment: " + paymentMode);
        System.out.println("\nItem: " + chosenItem);
        System.out.println("Discount/Interest: " + df.format(disOrInt));
        System.out.println("Total Amount: " + df.format(totalAmount));

        switch(months){
            case 0:
                System.out.println("Monthly: Fully Paid"); break;
            case 3: 
                System.out.println("Monthly: " + df.format(totalAmount/months)); break;
            case 6:
                System.out.println("Monthly: " + df.format(totalAmount/months)); break;
            case 12:
                System.out.println("Monthly: " + df.format(totalAmount/months)); break;
        }
    }
}