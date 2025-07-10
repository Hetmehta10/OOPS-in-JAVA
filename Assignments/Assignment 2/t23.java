// Topic 23: Clone an ArrayList

import java.util.ArrayList;
import java.util.Scanner;

public class t23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter 3 items:");
        for (int i = 0; i < 3; i++) list.add(sc.nextLine());
        ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned ArrayList: " + clonedList);
    }
}
