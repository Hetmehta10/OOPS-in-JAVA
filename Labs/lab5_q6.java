class Vehicle {
    String brand;
    String model;
    double price;
    public Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Price: $" + price);
    }
}
class Car extends Vehicle {
    int seatingCapacity;
    String fuelType;
    public Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
    }
}
class ElectricCar extends Car {
    int batteryCapacity;
    double chargingTime; 
    public ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, int batteryCapacity, double chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh, Charging Time: " + chargingTime + " hours");
    }
}
class Motorcycle extends Vehicle {
    int engineCapacity; // in cc
    String type; 
    public Motorcycle(String brand, String model, double price, int engineCapacity, String type) {
        super(brand, model, price);
        this.engineCapacity = engineCapacity;
        this.type = type;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc, Type: " + type);
    }
}
public class lab5_q6 {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Generic", "BaseModel", 10000);
        v.displayDetails();
        System.out.println();

        Car c = new Car("Toyota", "Camry", 25000, 5, "Petrol");
        c.displayDetails();
        System.out.println();

        ElectricCar ec = new ElectricCar("Tesla", "Model S", 80000, 5, "Electric", 100, 1.5);
        ec.displayDetails();
        System.out.println();

        Motorcycle m = new Motorcycle("Yamaha", "YZF-R1", 20000, 998, "Sport");
        m.displayDetails();
    }
}
