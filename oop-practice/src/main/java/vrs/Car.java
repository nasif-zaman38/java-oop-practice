package vrs;

public class Car extends Vehicle {
    Car(String vehicleId, String brand, double rentalRate) {
        super(vehicleId, brand, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}
