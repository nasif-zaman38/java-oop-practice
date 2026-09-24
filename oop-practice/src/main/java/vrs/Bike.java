package vrs;

public class Bike extends Vehicle{
    int engineCC;

    Bike(String vehicleId, String brand, double rentalRate, int engineCC) {
        super(vehicleId, brand, rentalRate);
        this.engineCC = engineCC;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Engine CC: " + engineCC);
    }
}
