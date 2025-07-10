// Topic 16: Insert element at specific index

import java.util.ArrayList;
import java.util.Scanner;
public class t16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter 3 items:");
        for (int i = 0; i < 3; i++) list.add(sc.nextLine());
        System.out.print("Enter item to insert: ");
        String item = sc.nextLine();
        System.out.print("Enter index: ");
        int idx = sc.nextInt();
        if (idx >= 0 && idx <= list.size()) list.add(idx, item);
        System.out.println("Updated List: " + list);
    }
}


