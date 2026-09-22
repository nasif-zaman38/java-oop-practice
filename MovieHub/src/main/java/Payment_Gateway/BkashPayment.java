package Payment_Gateway;

import java.util.Random;

public class BkashPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("\nbKash payment is being processed...");
        System.out.println("Please wait...");

        Random random = new Random();
        int delay= random.nextInt(8)+3;

        try{
            Thread.sleep(delay * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Payment processing was interrupted.");
            return;
        }

        System.out.println("\nPayment completed for "+amount+" using bKash.");
    }
}
