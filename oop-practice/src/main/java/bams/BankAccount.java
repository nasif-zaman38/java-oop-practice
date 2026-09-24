package bams;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        setBalance(balance);
    }

    BankAccount(){

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance < 0){
            this.balance = 0;
            System.out.println("Initial balance is invalid. Setting balance to 0.");
        }
        else {
            this.balance = balance;
        }    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;

            System.out.println("\nDeposit successful.");
            System.out.println("Deposited amount: " + amount);
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
            balance -= amount;

            System.out.println("\nWithdrawal successful.");
            System.out.println("Withdrawn amount: " + amount);
            System.out.println("\nCurrent balance: " + balance);
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
