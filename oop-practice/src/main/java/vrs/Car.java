package vrs;

public class Car extends Vehicle {
    int numberOfDoors;

    Car(String vehicleId, String brand, double rentalRate, int numberOfDoors) {
        super(vehicleId, brand, rentalRate);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}
