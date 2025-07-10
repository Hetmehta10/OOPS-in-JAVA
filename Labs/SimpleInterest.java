import java.util.Scanner;


class Cominterest{
    public double calculateinterest(double p, double r, double t){
        return (p*r*t)/100;
    }
}

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double p = sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double r = sc.nextDouble();
        System.out.println("Enter the time");
        double t = sc.nextDouble();

        Cominterest calinterest = new Cominterest();
        double interest = calinterest.calculateinterest(p, r, t);
        System.out.println("The simple interest is " + interest);

        


 }
}