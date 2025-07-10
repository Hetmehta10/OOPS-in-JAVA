import java.util.ArrayList;
import java.util.Scanner;

// Base class for all vehicles
class Vehicle {
    protected String make, model;
    protected int year;
    protected double mileage;

    public Vehicle(String make, String model, int year, double mileage) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public void displayInfo() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Mileage: " + mileage);
    }
}

// Car subclass
class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String make, String model, int year, double mileage, int seatingCapacity) {
        super(make, model, year, mileage);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seating Capacity: " + seatingCapacity);
    }
}

// Truck subclass
class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String make, String model, int year, double mileage, double loadCapacity) {
        super(make, model, year, mileage);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}

// Fleet management class
class FleetManager {
    private ArrayList<Vehicle> fleet = new ArrayList<>();

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
        System.out.println("Vehicle added successfully!");
    }

    public void displayAllVehicles() {
        if (fleet.isEmpty()) {
            System.out.println("No vehicles in the fleet.");
            return;
        }
        for (Vehicle v : fleet) {
            v.displayInfo();
            System.out.println("---------------------");
        }
    }

    public Vehicle findVehicle(String make, String model) {
        for (Vehicle v : fleet) {
            if (v.make.equalsIgnoreCase(make) && v.model.equalsIgnoreCase(model)) {
                return v;
            }
        }
        return null;
    }
}

// Main application
public class VehicleManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FleetManager manager = new FleetManager();
        
        while (true) {
            System.out.println("1. Add Car\n2. Add Truck\n3. View All Vehicles\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter make: ");
                    String carMake = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String carModel = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int carYear = scanner.nextInt();
                    System.out.print("Enter mileage: ");
                    double carMileage = scanner.nextDouble();
                    System.out.print("Enter seating capacity: ");
                    int seatingCapacity = scanner.nextInt();
                    manager.addVehicle(new Car(carMake, carModel, carYear, carMileage, seatingCapacity));
                    break;
                case 2:
                    System.out.print("Enter make: ");
                    String truckMake = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String truckModel = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int truckYear = scanner.nextInt();
                    System.out.print("Enter mileage: ");
                    double truckMileage = scanner.nextDouble();
                    System.out.print("Enter load capacity: ");
                    double loadCapacity = scanner.nextDouble();
                    manager.addVehicle(new Truck(truckMake, truckModel, truckYear, truckMileage, loadCapacity));
                    break;
                case 3:
                    manager.displayAllVehicles();
                    break;
                case 4:
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
