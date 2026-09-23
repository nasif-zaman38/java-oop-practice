package bams;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        if(balance < 0){
            this.balance = 0;
            System.out.println("Initial balance is invalid. Setting balance to 0.");
        }
        else {
            this.balance = balance;
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            System.out.println("\nDeposit successful.");
            System.out.println("Deposited amount: " + amount);

            balance += amount;
            System.out.println("\nCurrent balance: " + balance);
        }
        else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount){
        if(amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        }
        else if (amount > balance) {
            System.out.println("Insufficient balance.");

        }
        else {
            System.out.println("\nWithdrawal successful.");
            System.out.println("Withdrawn amount: " + amount);

            balance -= amount;
            System.out.println("\nCurrent balance: " + balance);
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
