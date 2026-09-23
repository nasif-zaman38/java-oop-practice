package payment;

import java.util.Random;

public interface Payment {
    int MIN_DELAY = 3;
    int MAX_DELAY = 8;

    void pay(double amount);

    default int getProcessingDelay(){
        Random random = new Random();
        return random.nextInt(MAX_DELAY - MIN_DELAY + 1) + MIN_DELAY;
    }
}
