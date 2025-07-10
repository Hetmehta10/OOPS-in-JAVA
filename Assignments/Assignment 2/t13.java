// Topic 13: ArrayList to array conversion

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class t13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter 4 numbers:");
        for (int i = 0; i < 4; i++) list.add(sc.nextInt());
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) arr[i] = list.get(i);
        System.out.println("Array: " + Arrays.toString(arr));
    }
}


