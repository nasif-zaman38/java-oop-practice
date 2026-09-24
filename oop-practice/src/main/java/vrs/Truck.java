package vrs;

public class Truck extends Vehicle{
    double loadCapacity;

    Truck(String vehicleId, String brand, double rentalRate, double loadCapacity) {
        super(vehicleId, brand, rentalRate);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 2000;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Load capacity: " + loadCapacity + " tons");
    }
}
