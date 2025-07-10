import java.util.ArrayList;
class Employee {
    String name;
    int id;
    double salary;
    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}
public class Question_2 {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Lakshya", 101, 40000));
        employeeList.add(new Employee("Parth", 102, 50000));
        employeeList.add(new Employee("Purvi", 103, 60000));
        for (Employee emp : employeeList) {
            if (emp.id == 102) {
                emp.salary = 58000;  
                System.out.println("Updated salary for " + emp.name);
            }
        }
        employeeList.removeIf(emp -> emp.id == 103);
        System.out.println("Removed employee with ID 103");
        System.out.println("\nRemaining Employees:");
        for (Employee emp : employeeList) {
            emp.display();
        }
    }
}

