// Topic 2: Remove element by index from ArrayList
import java.util.ArrayList;
import java.util.Scanner;
public class t2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter 3 elements:");
        for (int i = 0; i < 3; i++) {
            list.add(sc.nextLine());
        }
        System.out.print("Enter index to remove: ");
        int idx = sc.nextInt();
        if (idx >= 0 && idx < list.size()) list.remove(idx);
        System.out.println("List: " + list);
    }
}

