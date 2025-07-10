// Topic 18: ArrayList from Command-Line Arguments

import java.util.ArrayList;

public class t18 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        for (String arg : args) {
            list.add(arg);
        }
        System.out.println("ArrayList from arguments: " + list);
    }
}
