// Topic 17: Accessing each element using for-each

import java.util.ArrayList;
import java.util.Scanner;
public class t17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> items = new ArrayList<>();
        System.out.println("Enter 3 strings:");
        for (int i = 0; i < 3; i++) items.add(sc.nextLine());
        System.out.println("You entered:");
        for (String s : items) System.out.println(s);
    }
}