// Topic 35: Using forEach loop with ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class t35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter 3 items:");
        for (int i = 0; i < 3; i++) list.add(sc.nextLine());
        
        System.out.println("ArrayList using forEach:");
        list.forEach(item -> System.out.println(item));
    }
}
