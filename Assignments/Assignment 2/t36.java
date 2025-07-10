// Topic 36: Add elements from another collection to ArrayList

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class t36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        
        System.out.println("Enter 3 items for list:");
        for (int i = 0; i < 3; i++) list.add(sc.nextLine());
        
        set.add("newItem1");
        set.add("newItem2");
        
        list.addAll(set);
        System.out.println("ArrayList after adding from set: " + list);
    }
}
