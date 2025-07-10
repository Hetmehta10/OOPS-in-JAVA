// Topic 25: Find element index in ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class t25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter 3 items:");
        for (int i = 0; i < 3; i++) list.add(sc.nextLine());
        System.out.print("Enter element to find index: ");
        String search = sc.nextLine();
        System.out.println("Index of element: " + list.indexOf(search));
    }
}
