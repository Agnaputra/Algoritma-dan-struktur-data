package UTS;
import java.util.Scanner;

public class BankingInformationSystem {
    public static void main(String[] args) {
        AccountManager accountManager = new AccountManager();
        Scanner scanner = new Scanner(System.in);

        accountManager.addAccount(new Account(16030927, "Wallace", "3084", "1-458-264-3263", "ligula.Nullam@tacitisociosqu.edu", 10000));
        accountManager.addAccount(new Account(16100617, "Darius", "0573", "1-357-843-0547", "nec@lectusjusto.org", 7000));
        accountManager.addAccount(new Account(16240401, "Fuller", "2243", "571-7062", "convallis@Vestibulumanteipsum.org", 5000));
        accountManager.addAccount(new Account(16270525, "Malcolm", "0112", "623-0234", "porttitor.tellus.non@Curabitur.ca", 44000));
        accountManager.addAccount(new Account(16971204, "Geoffrey", "2416", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com", 50000));
        accountManager.addAccount(new Account(16100727, "Rudyard", "8862", "650-5379", "Proin.eget@velitegestaslacinia.ca", 123000));
        accountManager.addAccount(new Account(16460329, "Troy", "4259", "897-7608", "pede.Suspendisse.dui@a.ca", 100000));
        accountManager.addAccount(new Account(16320421, "Alec", "3437", "792-4447", "non@mus.com", 34000));
        accountManager.addAccount(new Account(16180729, "Walter", "7229", "863-8209", "Pellentesque.ut.ipsum@neque.ca", 334544));
        accountManager.addAccount(new Account(16950313, "Simon", "6823", "592-6919", "tellus.justo.sit@commodoauctor.net", 23444));
        accountManager.addAccount(new Account(16850708, "Kamal", "3528", "1-115-339-7678", "dictum@nec.edu", 567770));

        // Menu loop
        boolean running = true;
        while (running) {
            System.out.println("\nBanking Information System");
            System.out.println("1. Add an account");
            System.out.println("2. Display all accounts");
            System.out.println("3. Sort accounts by balance");
            System.out.println("4. Display accounts with zero balance");
            System.out.println("5. Search accounts by name keyword");
            System.out.println("6. Withdraw from an account");
            System.out.println("7. Deposit into an account");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    // Add an account
                    System.out.println("Enter account number:");
                    long accountNumber = scanner.nextLong();
                    scanner.nextLine(); 
                    System.out.println("Enter name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter mother's name:");
                    String motherName = scanner.nextLine();
                    System.out.println("Enter phone:");
                    String phone = scanner.nextLine();
                    System.out.println("Enter email:");
                    String email = scanner.nextLine();
                    System.out.println("Enter balance:");
                    double balance = scanner.nextDouble();
                    Account newAccount = new Account(accountNumber, name, motherName, phone, email, balance);
                    accountManager.addAccount(newAccount);
                    break;

                case 2:
                    // Display all accounts
                    System.out.println("\nAll accounts:");
                    accountManager.displayAllAccounts();
                    break;

                case 3:
                    // Sort accounts by balance
                    System.out.println("\nSorting accounts by balance:");
                    accountManager.sortAccountsByBalance();
                    break;

                case 4:
                    // Display accounts with zero balance
                    System.out.println("\nDisplaying accounts with zero balance:");
                    accountManager.displayZeroBalanceAccounts();
                    break;

                case 5:
                    // Search accounts by name keyword
                    System.out.println("\nEnter name keyword to search:");
                    String nameKeyword = scanner.nextLine();
                    accountManager.searchAccountByName(nameKeyword);
                    break;

                case 6:
                    // Withdraw from an account
                    System.out.println("\nEnter account number to withdraw from:");
                    long accountNumberToWithdraw = scanner.nextLong();
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    accountManager.withdraw(accountNumberToWithdraw, withdrawAmount);
                    break;

                case 7:
                    // Deposit into an account
                    System.out.println("\nEnter account number to deposit into:");
                    long accountNumberToDeposit = scanner.nextLong();
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    accountManager.deposit(accountNumberToDeposit, depositAmount);
                    break;

                case 8:
                    // Exit
                    System.out.println("Exiting the program.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }

        scanner.close();
    }
}

    

