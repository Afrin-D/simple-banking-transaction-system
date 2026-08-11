import java.util.ArrayList;
import java.util.Scanner;

public class BankingSystem {

    static ArrayList<BankAccount> accounts = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== SIMPLE BANKING SYSTEM =====");
            System.out.println("1. Create Account");
            System.out.println("2. View Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. View Transaction History");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    createAccount();
                    break;

                case 2:
                    viewAccount();
                    break;

                case 3:
                    depositMoney();
                    break;

                case 4:
                    withdrawMoney();
                    break;

                case 5:
                    checkBalance();
                    break;

                case 6:
                    viewTransactions();
                    break;

                case 7:
                    System.out.println(
                            "Thank you for using the Banking System!"
                    );
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    // Create new account
    public static void createAccount() {

        System.out.println("\n----- CREATE ACCOUNT -----");

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        if (findAccount(accountNumber) != null) {
            System.out.println(
                    "An account with this number already exists!"
            );
            return;
        }

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();

        if (initialBalance < 0) {
            System.out.println(
                    "Initial balance cannot be negative."
            );
            return;
        }

        BankAccount account = new BankAccount(
                accountNumber,
                name,
                initialBalance
        );

        accounts.add(account);

        System.out.println("Account created successfully!");
    }

    // Find account
    public static BankAccount findAccount(String accountNumber) {

        for (BankAccount account : accounts) {

            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }

        return null;
    }

    // View account
    public static void viewAccount() {

        System.out.println("\n----- VIEW ACCOUNT -----");

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        BankAccount account = findAccount(accountNumber);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        account.displayAccountDetails();
    }

    // Deposit money
    public static void depositMoney() {

        System.out.println("\n----- DEPOSIT MONEY -----");

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        BankAccount account = findAccount(accountNumber);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        if (account.deposit(amount)) {
            System.out.printf(
                    "₹%.2f deposited successfully!%n",
                    amount
            );

            System.out.printf(
                    "Current Balance: ₹%.2f%n",
                    account.getBalance()
            );

        } else {
            System.out.println(
                    "Invalid deposit amount!"
            );
        }
    }

    // Withdraw money
    public static void withdrawMoney() {

        System.out.println("\n----- WITHDRAW MONEY -----");

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        BankAccount account = findAccount(accountNumber);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if (account.withdraw(amount)) {

            System.out.printf(
                    "₹%.2f withdrawn successfully!%n",
                    amount
            );

            System.out.printf(
                    "Current Balance: ₹%.2f%n",
                    account.getBalance()
            );

        } else {

            if (amount <= 0) {
                System.out.println(
                        "Amount must be greater than 0."
                );

            } else {
                System.out.println(
                        "Insufficient balance!"
                );
            }
        }
    }

    // Check balance
    public static void checkBalance() {

        System.out.println("\n----- CHECK BALANCE -----");

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        BankAccount account = findAccount(accountNumber);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        System.out.printf(
                "Current Balance: ₹%.2f%n",
                account.getBalance()
        );
    }

    // View transaction history
    public static void viewTransactions() {

        System.out.println("\n----- TRANSACTION HISTORY -----");

        System.out.print("Enter Account Number: ");
        String accountNumber = scanner.nextLine();

        BankAccount account = findAccount(accountNumber);

        if (account == null) {
            System.out.println("Account not found!");
            return;
        }

        account.displayTransactions();
    }
}