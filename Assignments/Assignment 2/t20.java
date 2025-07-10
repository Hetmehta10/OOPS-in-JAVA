// Topic 20: Convert ArrayList to LinkedList

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class t20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Enter 3 items:");
        for (int i = 0; i < 3; i++) list.add(sc.nextLine());
        LinkedList<String> linkedList = new LinkedList<>(list);
        System.out.println("Converted LinkedList: " + linkedList);
    }
}
