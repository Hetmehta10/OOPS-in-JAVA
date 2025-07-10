import java.util.Scanner;

// Abstract class to handle payment processes
abstract class Payment {
    // Abstract method to process a payment
    abstract void makePayment(double amount);

    // Common method to simulate transaction processing
    protected void processTransaction(String method, double amount) {
        System.out.println(method + " payment of $" + amount + " processed successfully.");
    }
}

// Concrete class for handling payments with a credit card
class CreditCardPayment extends Payment {
    @Override
    void makePayment(double amount) {
        // Simulating credit card processing
        System.out.println("Processing credit card payment...");
        processTransaction("Credit Card", amount);
    }
}

// Concrete class for handling payments via PayPal
class PayPalPayment extends Payment {
    @Override
    void makePayment(double amount) {
        // Simulating PayPal processing
        System.out.println("Processing PayPal payment...");
        processTransaction("PayPal", amount);
    }
}

// Main class to take user input and test payments
public class payment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User selects payment method
        System.out.println("Select Payment Method: 1. Credit Card  2. PayPal");
        int choice = scanner.nextInt();

        // Enter payment amount
        System.out.print("Enter payment amount: ");
        double amount = scanner.nextDouble();

        // Processing based on user choice
        Payment payment;
        if (choice == 1) {
            payment = new CreditCardPayment();
        } else {
            payment = new PayPalPayment();
        }

        payment.makePayment(amount); // Process payment
        scanner.close();
    }
}
