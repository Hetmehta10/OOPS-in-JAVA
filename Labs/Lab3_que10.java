//copying elements from one array to another using loop


public class Lab3_que10 {
    public static void main(String[] args) {
        int[] arr1 = {28,13,40,10,9};
        int[] arr2 = new int[arr1.length];
        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("Elements of Second array: ");
        for(int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        } 
    }
}
