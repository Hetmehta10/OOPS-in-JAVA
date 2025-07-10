// Topic 24: Find minimum and maximum in ArrayList

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class t24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) list.add(sc.nextInt());
        int min = Collections.min(list);
        int max = Collections.max(list);
        System.out.println("Min: " + min + ", Max: " + max);
    }
}
