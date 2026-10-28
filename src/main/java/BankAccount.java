public class BankAccount {
    protected int accountNumber;
    protected String accountHolder;
    protected double balance;
    protected float roi;

    // Default constructor
    BankAccount() {
        accountNumber = 0;
        accountHolder = "";
        balance = 0.0;
        roi = 0.0f;
    }

    // Parameterized constructor
    BankAccount(int accountNumber, String accountHolder,
                double balance, float roi) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.roi = roi;
    }

    // Copy constructor
    BankAccount(BankAccount b) {
        accountNumber = b.accountNumber;
        accountHolder = b.accountHolder;
        balance = b.balance;
        roi = b.roi;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void checkBalance() {
        System.out.println("Balance = " + balance);
    }

    void display() {
        System.out.println("Account Number = " + accountNumber);
        System.out.println("Account Holder = " + accountHolder);
        System.out.println("Balance = " + balance);
        System.out.println("ROI = " + roi + "%");
    }
}