public class CurrentAccount extends BankAccount {

    // Default constructor
    CurrentAccount() {
        super();
    }

    // Parameterized constructor
    CurrentAccount(int accountNumber, String accountHolder,
                   double balance, float roi) {
        super(accountNumber, accountHolder, balance, roi);
    }

    // Copy constructor
    CurrentAccount(CurrentAccount c) {
        super(c);
    }

    void display() {
        System.out.println("Current Account");
        super.display();
    }
}