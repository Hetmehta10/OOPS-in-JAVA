// Topic 28: Remove elements from ArrayList based on condition

import java.util.ArrayList;
import java.util.Scanner;

public class t28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) list.add(sc.nextInt());
        list.removeIf(n -> n % 2 == 0);
        System.out.println("List after removing even numbers: " + list);
    }
}
