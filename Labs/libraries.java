//math and random library
import java.util.Scanner;
import java.util.Random;

public class libraries {
    public static void main(String[] args){
        // Scanner Sc = new Scanner(System.in);
        // System.out.println("Enter the first number:");
        // int n1 = Sc.nextInt();
        // System.out.println("Enter the second number:");
        // int n2 = Sc.nextInt();
        // int max = Math.max(n1,n2);
        // System.out.println("Maximum Between " + n1 + " and " + n2 + " is " + max);
        // Sc.close();
        Random rand = new Random();
        int random_n3 = rand.nextInt(100);
        int random_n4 = rand.nextInt(100);
        System.out.println("Random Number Between 0 and 99 is " + random_n3);
        System.out.println("Random Number Between 0 and 99 is " + random_n4);
        double sqrt1 = Math.sqrt(random_n3);
        double sqrt2 = Math.sqrt(random_n4);
        System.out.println("Sqrt of random _n3 is " + sqrt1);
        System.out.println("Sqrt of random _n4 is " + sqrt2);
        double square1 = Math.pow(random_n3,2);
        double square2 = Math.pow(random_n4, 2);
        System.out.println("Square of random _n3 is " + square1);
        System.out.println("square of random_n4 is " + square2);
    }
    
}

