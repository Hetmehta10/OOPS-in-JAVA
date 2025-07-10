import java.util.Scanner;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //sum of an array
        int [] j= {1,3,2,5,9,9,8,10};
        int sum =0;
        for(int i=0; i<j.length; i++) {
            sum = sum+j[i];

        }
        System.out.println("Sum of an array is: "+sum);


    // sum of even and odd number in an array

    int [] y = {1,3,2,5,9,9,8,10};
    int sum1 =0;
    int sum2 =0;
    for(int i=0; i<y.length; i++) {
        if(y[i]%2==0) {
            sum1 = sum1+y[i];
            }
        else {
            sum2 = sum2+y[i];
            }
     }
     System.out.println("Sum of even numbers "+sum1);
     System.out.println("Sum of odd numbers "+sum2);


     // maximum and minimum number in an array

     int [] z = {1,3,2,5,9,9,8,10};
     int max = z[0];
        int min = z[0];
        int maxIndex = 0;
        int minIndex = 0;
        
        for (int i = 1; i < z.length; i++) {
            if (z[i] > max) {
                max = z[i];
                maxIndex = i;
            }
            if (z[i] < min) {
                min = z[i];
                minIndex = i;
            }
        }
        
        System.out.println("Maximum value: " + max + " at index: " + maxIndex);
        System.out.println("Minimum value: " + min + " at index: " + minIndex);

        
}
}