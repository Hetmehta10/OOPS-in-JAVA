// Topic 12: Remove duplicates using Set

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class t12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) numbers.add(sc.nextInt());
        Set<Integer> unique = new HashSet<>(numbers);
        System.out.println("Unique: " + unique);
    }
}


