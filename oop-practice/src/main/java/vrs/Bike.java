package vrs;

public class Bike extends Vehicle{
    Bike(String vehicleId, String brand, double rentalRate) {
        super(vehicleId, brand, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }
}
