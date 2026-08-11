import java.util.ArrayList;

public class BankAccount {

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    private ArrayList<String> transactions;

    public BankAccount(String accountNumber, String accountHolderName,
                       double initialBalance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;

        transactions = new ArrayList<>();

        transactions.add(
                "Account created with balance: ₹" +
                String.format("%.2f", initialBalance)
        );
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount) {

        if (amount <= 0) {
            return false;
        }

        balance += amount;

        transactions.add(
                "Deposited: ₹" +
                String.format("%.2f", amount)
        );

        return true;
    }

    public boolean withdraw(double amount) {

        if (amount <= 0 || amount > balance) {
            return false;
        }

        balance -= amount;

        transactions.add(
                "Withdrawn: ₹" +
                String.format("%.2f", amount)
        );

        return true;
    }

    public void displayAccountDetails() {

        System.out.println("\n----- ACCOUNT DETAILS -----");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.printf("Balance        : ₹%.2f%n", balance);
        System.out.println("---------------------------");
    }

    public void displayTransactions() {

        System.out.println("\n----- TRANSACTION HISTORY -----");

        if (transactions.isEmpty()) {
            System.out.println("No transactions available.");
            return;
        }

        for (String transaction : transactions) {
            System.out.println(transaction);
        }

        System.out.println("-------------------------------");
    }
}