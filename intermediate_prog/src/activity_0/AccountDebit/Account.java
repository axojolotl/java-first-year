package activity_0.AccountDebit;
import java.util.Scanner;

public class Account {
    public float accountBalance = 0f;
    public static int numberOfAccounts = 0;

    public void debit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter withdrawal amount for account" + numberOfAccounts + " ");
        double withdrawAmount = sc.nextFloat();
        if (this.accountBalance < withdrawAmount){
            System.out.println("Debit amount exceeded account" + numberOfAccounts + " balance.");
            return;
        }
        System.out.println("Subtracting $" + withdrawAmount + " from account" + numberOfAccounts + " balance");
        this.accountBalance -= withdrawAmount;
    }

    public void getBalance(){
        System.out.println("account" + numberOfAccounts + " balance: $" + this.accountBalance);
    }
}
