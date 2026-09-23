package bams;

import java.util.Scanner;

public class Main {
    static void main() {
        BankAccount account = new BankAccount(123456, "John Doe", 1000.0);

        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== Bank Account Management =====\n");

        account.displayAccountInfo();

        System.out.print("\nEnter deposit amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("\nEnter withdrawal amount: ");
        double withdrawalAmount = sc.nextDouble();
        account.withdraw(withdrawalAmount);
    }
}
