public class ATM {
    private double balance;

    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    public void displayBalance() {
        System.out.println("Current balance: $" + balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: $" + balance);
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: $" + balance);
        } else {
            System.out.println("Invalid amount or insufficient funds. Withdrawal failed.");
        }
    }
}
