import java.util.Scanner;

class s1 {
    private int privateVar = 100; 

    public int getPrivateVar() { 
        return privateVar;
        
    }
}

class s2 extends s1 {
    void display() {
        System.out.println("Enter the Password ");
        Scanner scanner = new Scanner(System.in);
        int pass = scanner.nextInt();
        
        if(pass==123)
        {
            System.out.println("Your Private Variable is: " + getPrivateVar());
        }
        else{
            System.out.println("Incorrect Password Cannot access Private Variable");
        }
        
    }
}

public class lab5_q1 {
    public static void main(String[] args) {
        s2 obj = new s2();
        obj.display();
    }
} 
    

