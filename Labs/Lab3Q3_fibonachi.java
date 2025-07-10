import java.util.Scanner;
public class Lab3Q3_fibonachi{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int t1=0;
        int t2=1;
        int nextTerm=0;
        for (int i = 0; i < n; i++) {
            if (i < 1) {
                System.out.print(t1 + " ");
                } 
            else if(i==1){
                System.out.print(t2+" ");
            }
            else {
                nextTerm = t1 + t2;
                System.out.print(nextTerm + " ");
                t1 = t2;
                t2 = nextTerm;
                }
        }
        sc.close();
    }
}