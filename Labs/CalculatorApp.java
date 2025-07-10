import java.util.Scanner;

class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int subtract(int n1, int n2) {
        return n1 - n2;
    }

    public int multiply(int n1, int n2) {
        return n1 * n2;
    }
}

public class CalculatorApp {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: <number1> <operator> <number2>");
            return;
        }

        try {
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[2]);
            String operator = args[1];
            

            Calculator cal = new Calculator();
            int result;

            switch (operator) {
                case "+":
                    result = cal.add(n1, n2);
                    break;
                case "-":
                    result = cal.subtract(n1, n2);
                    break;
                case "*":
                    result = cal.multiply(n1, n2);
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, -, or *.");
                    return;
            }

            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
}
}
}