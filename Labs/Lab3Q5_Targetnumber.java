import java.util.Scanner;
public class Lab3Q5_Targetnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the targeted value:");
        int num = sc.nextInt();
        int count =0;
        Integer[] arr = {1,15,4,8,13,25,26,4,47,18,4};
        for(int i=0;i<arr.length; i++)
        {
            if(arr[i]==num)
            {
                count++;
            }
            
        }
        System.out.println("The targeted value is found "+count+" times");
    }
}