// public class main {
//     public static void main(String[] args) {
//         int x = 10;
//         int y = ++x;
//         if (y == 11 && x++ == 11) {
//             System.out.println(x);
//         } else {
//             System.out.println(++x);
//         }
//     }
// } o/p:12

// public class main {
//     public static void main (String[] args) {
//         for(int i=0; i<=10; i++){
//             System.out.println(" ");
//         }
//     }
// } o/p: 10 blank lines

// import java.util.Scanner;
// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of elements in the array: ");
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array: ");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//             }
//         System.out.println("The array is: " + java.util.Arrays.toString(arr));
//         System.out.println("The maximum element in the array is: " + findMax(arr));
//     }
//     public static int findMax(int[] arr) {
//         int max = arr[0];
//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
// } o/p: working

// public class main {
//     public static void main(String[] args) {
//         try{
//             int a = 10;
//             int b = 0;
//             System.out.println(a / b);
//         }
//         catch(Exception e){
//             System.out.println("Something went wrong!");
//         }
//     }
// } o/p: Something went wrong!


