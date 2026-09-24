package bams;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        BankAccount account1 = new BankAccount(123456, "John Doe", 1000.0);

        System.out.println("\n===== Bank Account Management =====\n");

        account1.displayAccountInfo();

        System.out.print("\nEnter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account1.deposit(depositAmount);

        System.out.print("\nEnter withdrawal amount: ");
        double withdrawalAmount = sc.nextDouble();
        account1.withdraw(withdrawalAmount);

        System.out.println("\n===== Second Account =====\n");

        BankAccount account2 = new BankAccount();

        account2.setAccountNumber(654321);
        account2.setAccountHolderName("John Doe");
        account2.setBalance(500);

        account2.displayAccountInfo();

        account2.deposit(200);
        account2.withdraw(100);
    }
}
