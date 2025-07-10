// Topic 15: Reverse ArrayList

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class t15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) list.add(sc.nextInt());
        Collections.reverse(list);
        System.out.println("Reversed: " + list);
    }
}


