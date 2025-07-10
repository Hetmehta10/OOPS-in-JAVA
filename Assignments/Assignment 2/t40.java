// Topic 40: String to Character array conversion

import java.util.Scanner;

public class t40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        System.out.println("Character Array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
