//Calculate avg marks

import java.util.Scanner;

public class Lab3_que8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of English: ");
        int e = sc.nextInt();
        System.out.println("Enter the marks of Maths: ");
        int m = sc.nextInt();
        System.out.println("Enter the marks of Science: ");
        int s = sc.nextInt();

        int avg = (e+m+s)/3;

        if(avg>= 90){
            System.out.println("Your marks are: " + avg + " and Grade is: A ");
        }
        else if(avg>=75 && avg<90){
            System.out.println("Your marks are: " + avg + " and Grade is: B ");
        }
        else if(avg>=50 && avg<75){
            System.out.println("Your marks are: " + avg + " and Grade is: C ");
        }
        else{
            System.out.println("Your marks are: " + avg + " and Grade is: F ");
        }
    }
}