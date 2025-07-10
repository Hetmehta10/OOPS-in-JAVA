//Store a list of integers in an ArrayList<Integer> using autoboxing. 
//Iterate through the list, unbox each value, and determine if it is a prime number, printing the results.

import java.util.ArrayList;
import java.util.Scanner;

public class lab10_q1{
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the list: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the list: ");
        for (int i = 0; i < n; i++) {
            num.add(sc.nextInt());
            }
        for(Integer number : num){
            int numb = (Integer) num.get(number);
            if(isPrime(numb)){
                System.out.println(number + " is a prime number");
            }
            else{
                System.out.println(number + " is not a prime number");
            }   
        }
    }
}
public static boolean isPrime(int x){
    if(x<=1) return false;
    if (x == 2) return true;
    if (x % 2 == 0) return false;
    for (int i = 3; i <= Math.sqrt(x); i += 2) {
        if (x % i == 0) return false;
    }
}