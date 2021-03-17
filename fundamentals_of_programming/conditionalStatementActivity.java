import java.util.Scanner;
import java.text.DecimalFormat;

public class conditionalStatementActivity {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###,###.00");

        String product;
        double price = 0, discounted = 0, discount = 0;

        System.out.println("Enter product: ");
        product = sc.nextLine();

        System.out.println("Enter price: ");
        price = sc.nextDouble();
        System.out.println("\nPrice of " + product + " is " + df.format(price));

        if (price <= 10000){
            discount = 0;
            discounted = price;
        }
        else if (price > 10000 && price <= 20000){
            discount = price*.05;
            discounted = price - (price*.05);
        }
        else if (price > 20000 && price <= 50000){
            discount = price*.1;
            discounted = price - (price*.1);
        }
        else if (price > 50000 && price <= 100000){
            discount = price*.15;
            discounted = price - (price * .15);
        }
        else if (price > 100000){
            discount = price*.2;
            discounted = price - (price*.2);
        }
        System.out.println("Discount is " + df.format(discount));
        System.out.println("Net Price is " + df.format(discounted));

    }
} 