// Topic 22: Convert ArrayList to String

import java.util.ArrayList;
import java.util.Scanner;

public class t22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter 3 items:");
        for (int i = 0; i < 3; i++) list.add(sc.nextLine());
        String listString = String.join(", ", list);
        System.out.println("ArrayList as String: " + listString);
    }
}
