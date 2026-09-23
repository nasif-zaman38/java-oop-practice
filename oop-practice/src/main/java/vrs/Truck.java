package vrs;

public class Truck extends Vehicle{
    Truck(String vehicleId, String brand, double rentalRate) {
        super(vehicleId, brand, rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 2000;
    }
}
