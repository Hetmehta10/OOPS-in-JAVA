// Topic 38: Working with a List of Wrapper Classes

import java.util.ArrayList;
import java.util.Scanner;

public class t38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        System.out.println("Enter 3 decimal numbers:");
        for (int i = 0; i < 3; i++) list.add(sc.nextDouble());
        
        double sum = 0;
        for (double num : list) sum += num;
        System.out.println("Sum of numbers: " + sum);
    }
}
