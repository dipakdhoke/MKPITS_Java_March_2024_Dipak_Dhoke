package abstractbankingsys;

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1000, 0.05);
        CurrentAccount currentAccount = new CurrentAccount(500, 100);

        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Current Account Balance: " + currentAccount.getBalance());

        savingsAccount.deposit(200);
        currentAccount.deposit(300);

        System.out.println("After Deposits:");
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Current Account Balance: " + currentAccount.getBalance());

        savingsAccount.withdraw(300);
        currentAccount.withdraw(600);

        System.out.println("After Withdrawals:");
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
    }
}