// Topic 29: Sublist of ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class t29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter 5 items:");
        for (int i = 0; i < 5; i++) list.add(sc.nextLine());
        ArrayList<String> sublist = new ArrayList<>(list.subList(1, 4));
        System.out.println("Sublist: " + sublist);
    }
}
