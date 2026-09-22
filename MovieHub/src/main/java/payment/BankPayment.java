package payment;

public class BankPayment implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("\nBank payment is being processed...");
        System.out.println("Please wait...");

        int delay = getProcessingDelay();

        try {
            Thread.sleep(delay * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Payment processing was interrupted.");
            return;
        }

        System.out.println("\nPayment completed for "+ amount +" using Bank.");

    }
}
