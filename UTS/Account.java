package UTS;

public class Account {
    long accountNumber;
    String name;
    String motherName;
    String phone;
    String email;
    double balance;

    // Constructor
    public Account(long accountNumber, String name, String motherName, String phone, String email, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.motherName = motherName;
        this.phone = phone;
        this.email = email;
        this.balance = balance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    // Withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + balance);
            } else {
                System.out.println("Insufficient funds for withdrawal.");
            }
        } else {
            System.out.println("Invalid amount. Please enter a positive number.");
        }
    }

    @Override
    public String toString() {
        return "AccountNumber: " + accountNumber + ", Name: " + name + ", MotherName: " + motherName + 
               ", Phone: " + phone + ", Email: " + email + ", Balance: " + balance;
    }
}
