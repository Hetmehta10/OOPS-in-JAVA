// Topic 21: ArrayList with Wrapper Classes

import java.util.ArrayList;
import java.util.Scanner;

public class t21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();
        System.out.println("Enter 3 decimal numbers:");
        for (int i = 0; i < 3; i++) list.add(sc.nextDouble());
        System.out.println("ArrayList of Doubles: " + list);
    }
}
