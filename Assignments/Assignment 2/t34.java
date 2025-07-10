// Topic 34: Retain only common elements between two ArrayLists

import java.util.ArrayList;
import java.util.Scanner;

public class t34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        
        System.out.println("Enter 3 items for list1:");
        for (int i = 0; i < 3; i++) list1.add(sc.nextLine());
        
        System.out.println("Enter 3 items for list2:");
        for (int i = 0; i < 3; i++) list2.add(sc.nextLine());
        
        list1.retainAll(list2);
        System.out.println("Common Elements: " + list1);
    }
}
