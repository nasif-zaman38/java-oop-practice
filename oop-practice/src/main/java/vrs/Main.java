package vrs;

import java.util.Scanner;

import static vrs.Vehicle.COMPANY_NAME;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        Car car = new Car("C001", "Toyota", 3000, 4);
        Bike bike = new Bike("B001", "Honda", 1000, 150);
        Truck truck = new Truck("T001", "Ford", 5000, 10);

        System.out.println("\n===== ABC Vehicle Rentals =====");

        System.out.println("\nCompany: " + COMPANY_NAME);

        car.displayVehicleInfo();
        bike.displayVehicleInfo();
        truck.displayVehicleInfo();

        System.out.print("\nEnter rental days: ");
        int days = sc.nextInt();

        System.out.println("\nCar rental cost: " + car.calculateRentalCost(days));
        System.out.println("Bike rental cost: " + bike.calculateRentalCost(days));
        System.out.println("Truck rental cost: " + truck.calculateRentalCost(days));

        System.out.println("\nTotal vehicles created: " + Vehicle.getTotalVehicles());
    }
}
