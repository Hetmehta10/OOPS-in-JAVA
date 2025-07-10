// Topic 1: Add elements to an ArrayList
import java.util.ArrayList;
import java.util.Scanner;
public class t1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter item: ");
            list.add(sc.nextLine());
        }
        System.out.println("List: " + list);
    }
}


