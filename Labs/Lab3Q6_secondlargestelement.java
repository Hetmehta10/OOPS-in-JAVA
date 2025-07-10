public class Lab3Q6_secondlargestelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int max = Integer.MIN_VALUE;
            int secondmax = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    secondmax = max;
                    max = arr[i];
                } 
                    else if (arr[i] > secondmax && arr[i] != max) {
                        secondmax = arr[i];
                    }
            }
            System.out.println("Second largest element is " + secondmax);
    }
}