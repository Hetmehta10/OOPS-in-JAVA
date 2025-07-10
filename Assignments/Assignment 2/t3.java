// Topic 3: Replace element at index
import java.util.ArrayList;
import java.util.Scanner;
public class t3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter 3 items:");
        for (int i = 0; i < 3; i++) list.add(sc.nextLine());
        System.out.print("Enter index to replace: ");
        int index = sc.nextInt();
        sc.nextLine();
        if (index >= 0 && index < list.size()) {
            System.out.print("Enter new value: ");
            list.set(index, sc.nextLine());
        }
        System.out.println("Updated List: " + list);
    }
}


