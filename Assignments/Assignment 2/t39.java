// Topic 39: Working with Arrays and Wrapper Classes

import java.util.Scanner;

public class t39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] arr = new Integer[3];
        System.out.println("Enter 3 integers:");
        for (int i = 0; i < 3; i++) arr[i] = sc.nextInt();
        
        int sum = 0;
        for (int num : arr) sum += num;
        System.out.println("Sum of array elements: " + sum);
    }
}
