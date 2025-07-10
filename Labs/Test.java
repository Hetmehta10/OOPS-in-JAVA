public class Test {
    Test(double d){
        this(10);
        System.out.println("Test constructor called with " + d);
    }
    Test(int i){
        this();
        System.out.println("Test constructor called with " + i);
    }
    Test(){
        System.out.println("Default constructor called");
    }
    public static void main(String[] args){
        Test t1 = new Test(10.5);
    }
}