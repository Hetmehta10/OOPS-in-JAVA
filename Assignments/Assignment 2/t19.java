// Topic 19: Remove all elements from ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class t19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter 3 items:");
        for (int i = 0; i < 3; i++) list.add(sc.nextLine());
        list.clear();
        System.out.println("List after clear: " + list);
    }
}
