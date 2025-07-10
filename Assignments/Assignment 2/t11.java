// Topic 11: Wrapper class ArrayList

import java.util.ArrayList;
import java.util.Scanner;
public class t11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) numbers.add(sc.nextInt());
        System.out.println("Numbers: " + numbers);
    }
}


