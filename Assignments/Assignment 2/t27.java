// Topic 27: Use of HashSet to remove duplicates

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class t27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter 5 items:");
        for (int i = 0; i < 5; i++) list.add(sc.nextLine());
        Set<String> uniqueSet = new HashSet<>(list);
        System.out.println("Unique items: " + uniqueSet);
    }
}
