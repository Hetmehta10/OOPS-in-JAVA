public class lab4_q3 {  
  
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
 
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public static void main(String[] args) {
        lab4_q3 calc = new lab4_q3();
        System.out.println("Addition of two integers: " + calc.add(5, 10));         
        System.out.println("Addition of two doubles: " + calc.add(5.5, 10.2));      
        System.out.println("Addition of three integers: " + calc.add(3, 6, 9));
    }
}