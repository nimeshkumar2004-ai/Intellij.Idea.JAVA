public class SavingAccount extends BankAccount {

    // Default constructor
    SavingAccount() {
        super();
    }

    // Parameterized constructor
    SavingAccount(int accountNumber, String accountHolder,
                  double balance, float roi) {
        super(accountNumber, accountHolder, balance, roi);
    }

    // Copy constructor
    SavingAccount(SavingAccount s) {
        super(s);
    }

    void display() {
        System.out.println("Saving Account");
        super.display();
    }
}