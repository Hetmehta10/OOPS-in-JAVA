// Topic 8: String to Integer conversion

import java.util.Scanner;
public class t8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number as string: ");
        String str = sc.nextLine();
        int value = Integer.parseInt(str);
        System.out.println("Parsed int: " + value);
    }
}

