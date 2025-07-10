// Topic 10: Character checks

import java.util.Scanner;
public class t10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);
        System.out.println("Is Letter? " + Character.isLetter(ch));
        System.out.println("Is Digit? " + Character.isDigit(ch));
    }
}


