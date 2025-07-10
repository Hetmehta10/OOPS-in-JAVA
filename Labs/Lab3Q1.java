public class Lab3Q1 {
    public static void main(String[] args) {
        int a = 0;
        int num[] = new int[54];
        int count = 0; 
        for (int i = 10; i <= 950; i++) {
            if (i % 6 == 0 && i % 9 == 0) {
                if (count < num.length) { 
                    num[count] = i;
                    count++;
                }
                a = a + i;
            }
        }
        System.out.println("Sum of all the numbers between 10 and 950 which are divisible by 6 and 9 is: " + a);
        System.out.println("Array is: ");
        for (int j = 0; j < count; j++) {
            System.out.print(" "+num[j]);
        }
        }
    }