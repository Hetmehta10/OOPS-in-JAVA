import java.util.ArrayList;
public class Question_1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(10);
        numbers.add(17);
        numbers.add(20);
        for (Integer num : numbers) {
            if (isPrime(num)) {
                System.out.println(num + " is a prime number.");
            } 
            else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
