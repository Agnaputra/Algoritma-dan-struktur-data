package UTS;

import java.util.Arrays;
import java.util.Comparator;

public class AccountManager {
    Account[] accounts;
    int count;
    static final int MAX_ACCOUNTS = 100; 

    public AccountManager() {
        accounts = new Account[MAX_ACCOUNTS];
        count = 0;
    }

    // Add a new account
    public void addAccount(Account account) {
        if (count < MAX_ACCOUNTS) {
            accounts[count] = account;
            count++;
            System.out.println("Account added successfully.");
        } else {
            System.out.println("Account array is full. Cannot add more accounts.");
        }
    }

    // Display all accounts
    public void displayAllAccounts() {
        for (int i = 0; i < count; i++) {
            System.out.println(accounts[i]);
        }
    }

    // Sort accounts by balance in descending order
    public void sortAccountsByBalance() {
        Arrays.sort(accounts, 0, count, Comparator.comparingDouble((Account account) -> account.balance).reversed());
        System.out.println("Accounts sorted by balance (descending):");
        displayAllAccounts();
    }

    // Display accounts with zero balance
    public void displayZeroBalanceAccounts() {
        System.out.println("Accounts with zero balance:");
        boolean foundZeroBalance = false;
        for (int i = 0; i < count; i++) {
            if (accounts[i].balance == 0) {
                System.out.println(accounts[i]);
                foundZeroBalance = true;
            }
        }
        if (!foundZeroBalance) {
            System.out.println("No accounts with zero balance found.");
        }
    }

    // Search accounts by name keyword
    public void searchAccountByName(String nameKeyword) {
        System.out.println("Accounts matching the name keyword '" + nameKeyword + "':");
        boolean foundMatch = false;
        for (int i = 0; i < count; i++) {
            if (accounts[i].name.toLowerCase().contains(nameKeyword.toLowerCase())) {
                System.out.println(accounts[i]);
                foundMatch = true;
            }
        }
        if (!foundMatch) {
            System.out.println("No accounts matching the name keyword found.");
        }
    }

    // Withdraw from an account
    public void withdraw(long accountNumber, double amount) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber == accountNumber) {
                accounts[i].withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    // Deposit into an account
    public void deposit(long accountNumber, double amount) {
        for (int i = 0; i < count; i++) {
            if (accounts[i].accountNumber == accountNumber) {
                accounts[i].deposit(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }
}