// Java program to rotate an array right by K positions.

public class Lab3_que12 {
    public static void main(String[] args) {        
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        k = k % arr.length;
        int[] rotatedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotatedArray[(i + k) % arr.length] = arr[i];
        }
        System.out.print("Rotated Array: ");
        for (int num : rotatedArray) {
            System.out.print(num + " ");
        }
    }  
}
