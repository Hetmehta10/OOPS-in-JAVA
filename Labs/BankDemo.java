import java.util.Scanner;

interface Bank{
    void deposit (double amount);
    void withdraw(double amount);
}

class Account implements Bank {
    private double balance;
    public Account(){
        balance = 0.0;
    }
    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.printf("Deposited: ", +amount);
        }
        else{
            System.out.println("Amount zero");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: "+ amount);
        }
        else{
            System.out.println("Insufficient amount");
        }
    }
    double checkBalance(){
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Account ac = new Account();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to deposit");
        double DepositAmount = sc.nextDouble();
        ac.deposit(DepositAmount);

        System.out.println("Enter amount to withdraw");
        double WithdrawnAmount = sc.nextDouble();
        ac.withdraw(WithdrawnAmount);

        System.out.println("Balance: " +ac.checkBalance());
    }
}
