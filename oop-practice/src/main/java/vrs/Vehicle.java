package vrs;

abstract class Vehicle {
    String vehicleId;
    String brand;
    double rentalRate;

    public static final String COMPANY_NAME = "ABC Vehicle Rentals";

    private static int totalVehicles = 0;

    public Vehicle(String vehicleId, String brand, double rentalRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.rentalRate = rentalRate;

        totalVehicles++;
    }

    public abstract double calculateRentalCost(int days);

    public static int getTotalVehicles() {
        return totalVehicles;
    }

    public final void displayVehicleInfo() {
        System.out.println("\nVehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Rental Rate: " + rentalRate + " per day");
    }
}
