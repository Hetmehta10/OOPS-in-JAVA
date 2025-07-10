// Topic 9: String to Double conversion

import java.util.Scanner;
public class t9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal as string: ");
        String str = sc.nextLine();
        double d = Double.parseDouble(str);
        System.out.println("Parsed double: " + d);
    }
}

