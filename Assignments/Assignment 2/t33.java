// Topic 33: Shuffling elements in ArrayList

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class t33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter 5 items:");
        for (int i = 0; i < 5; i++) list.add(sc.nextLine());
        Collections.shuffle(list);
        System.out.println("Shuffled List: " + list);
    }
}
