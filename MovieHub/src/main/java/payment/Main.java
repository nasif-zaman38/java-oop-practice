package payment;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n===== Simple Payment Gateway =====\n");

        System.out.print("Enter payment amount : ");
        double amount= sc.nextDouble();

        System.out.println("\nSelect payment method:");
        System.out.println("1. bKash");
        System.out.println("2. Nagad");
        System.out.println("3. Bank");

        System.out.print("\nEnter your choice : ");
        int choice= sc.nextInt();

        String paymentMethod;
        Payment payment;

        switch (choice) {
            case 1:
                paymentMethod = "bKash";
                payment = new BkashPayment();
                break;
            case 2:
                paymentMethod = "Nagad";
                payment =  new NagadPayment();
                break;
            case 3:
                paymentMethod = "Bank";
                payment = new BankPayment();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid payment method.");
                return;
        }

        System.out.println("\nPayment amount : "+amount);
        System.out.println("Payment method : "+paymentMethod);

        System.out.print("\nConfirm payment? (Y/N): ");
        String confirm=sc.next();

        if(confirm.equalsIgnoreCase("Y")) {
            payment.pay(amount);
        }
        else if(confirm.equalsIgnoreCase("N")) {
            System.out.println("Payment cancelled.");
        }
        else{
            System.out.println("Invalid confirmation.");
        }
    }
}
