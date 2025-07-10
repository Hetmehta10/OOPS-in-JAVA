//polymorphism ->2 types -> compilation & runtime 
//overloading (for compilation) -> same method name with different parameters
//overriding (for runtime) -> same method name with different parameters in child class
// import java.util.*;

// public class polymorphism {
//     public static void main(String[] args) {
//         //1. method overloading
//         int a = 10;
//         int b = 20;
//         int c = 30;
//         add(a, b, c);
//         //2. method overriding
//         sound();
//     }
//     //1. method overloading
//     public static void add(int a, int b, int c) {
//         System.out.println("sum of three numbers: " + (a + b + c));

//     }
//     //2. method overriding
//     public static void sound() {
//         System.out.println("animal makes a sound");
//     }
// }

class cal{
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    float sum(float a, float b){
        return a+b;
    }
    void sum(int a, String f){
        System.out.println(a+f);
    }
    
}

public class polymorphism{
    public static void main(String[] args) {
        cal calc = new cal();
        System.out.println(calc.sum(10, 20)); 
        System.out.println(calc.sum(10, 20, 30));
        System.out.println(calc.sum(10.5f, 20.5f));
        calc.sum(20,"Twenty");
    }
}