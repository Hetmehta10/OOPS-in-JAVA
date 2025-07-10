// Topic 26: Convert Array to ArrayList

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class t26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) arr[i] = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("ArrayList from array: " + list);
    }
}
