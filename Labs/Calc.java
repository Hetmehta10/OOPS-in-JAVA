import java.util.Scanner;
public class Calc {
    public int addNum(int A, int B) {
        int Sum = A + B;
        return Sum;
    }

    public int subNum(int A, int B) {
        int Diff = A - B;
        return Diff;
    }

    public int mulNum(int A, int B) {
        int Product = A * B;
        return Product;
    }

    public float divNum(int A, int B) {
        if (B != 0) {
            float Quotient = (float) A / B;
            return Quotient;
        } else {
            System.out.println("Error: Division by zero is not allowed");
            return Float.NaN; // Return NaN (Not a Number) to indicate an error
        }
    }
    
    public static void main(String[] args) {
        Calc cal = new Calc();
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter 1st Num");
        int n1 = Sc.nextInt();

        System.out.println("Enter 2nd Num");
        int n2 = Sc.nextInt();

        int sum = cal.addNum(n1, n2);
        System.out.println("Sum: " + sum);

        int diff = cal.subNum(n1, n2);
        System.out.println("Difference: " + diff);

        int product = cal.mulNum(n1, n2);
        System.out.println("Product: " + product);

        float quotient = cal.divNum(n1, n2);
        if (!Float.isNaN(quotient)) {
            System.out.println("Quotient: " + quotient);
        }

        Sc.close();
    }
}



