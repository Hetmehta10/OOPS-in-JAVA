// Topic 14: Sum of ArrayList

import java.util.ArrayList;
import java.util.Scanner;
public class t14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) list.add(sc.nextInt());
        int sum = 0;
        for (int x : list) sum += x;
        System.out.println("Sum: " + sum);
    }
}


