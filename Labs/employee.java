import java.util.Scanner;

// Abstract class representing an employee
abstract class Employee {
    protected String name;

    // Constructor to initialize employee name
    public Employee(String name) {
        this.name = name;
    }

    // Abstract method defining work done by the employee
    abstract void work();

    // Common method for employee to report to work
    public void reportToWork() {
        System.out.println(name + " has reported to work.");
    }
}

// Concrete class representing a developer
class Developer extends Employee {
    public Developer(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is writing and debugging code.");
    }
}

// Concrete class representing a manager
class Manager extends Employee {
    public Manager(String name) {
        super(name);
    }

    @Override
    void work() {
        System.out.println(name + " is managing teams and projects.");
    }
}

// Main class to take user input and test
public class employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User selects employee type
        System.out.println("Select Employee Type: 1. Developer  2. Manager");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Enter employee name
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        Employee employee;
        if (choice == 1) {
            employee = new Developer(name);
        } else {
            employee = new Manager(name);
        }

        employee.reportToWork();
        employee.work();

        scanner.close();
    }
}
