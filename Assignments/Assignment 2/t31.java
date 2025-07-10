// Topic 31: Check if ArrayList is empty

import java.util.ArrayList;
import java.util.Scanner;

public class t31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter 3 items:");
        for (int i = 0; i < 3; i++) list.add(sc.nextLine());
        list.clear();
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
