package activity_0.AccountDebit;

public class AccountRun {
    public static void main(String[] args) {
        Account[] accounts = new Account[2]; // READ ONLY
        float[] balances = {150f, 500.53f}; // ONLY TO ACHIEVE EXPECTED OUTPUT
        int ctr = 0;
        for(Account i : accounts){
            i = new Account();
            i.accountBalance = balances[ctr];
            ctr++;
            Account.numberOfAccounts++;
            i.getBalance();
            i.debit();
            i.getBalance();
        }
    }
}
