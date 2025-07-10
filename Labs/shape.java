import java.util.Scanner;

// Abstract class Shape
abstract class Shape {
    abstract double area(); // Abstract method for area calculation
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Square class extending Shape
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }
}

// Main class to take user input and display results
public class shape{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Circle
        System.out.print("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);
        System.out.println("Circle Area: " + circle.area());

        // Input for Square
        System.out.print("Enter side length of the square: ");
        double side = scanner.nextDouble();
        Shape square = new Square(side);
        System.out.println("Square Area: " + square.area());

        scanner.close();
    }
}
