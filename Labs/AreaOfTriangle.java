import java.util.Scanner;
class AreaOTriangle{
    public double CalculateArea(int base, int height){
        return (base * height) / 2.0;
    }
}

public class AreaOfTriangle{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the base of the triangle:");
        int base = Sc.nextInt();
        System.out.println("Enter the height of the triangle:");
        int height = Sc.nextInt();
        AreaOTriangle calculatAreaOTriangle = new AreaOTriangle();
        double area = calculatAreaOTriangle.CalculateArea(base, height);
        System.out.println("The area of a Triangle is: " + area);
}
}