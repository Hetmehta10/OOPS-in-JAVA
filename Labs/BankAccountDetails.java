import java.util.Scanner;

class BankAccount{
    private double balance;
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited the amount");
        }
        else{
            System.out.println("Amount is zero");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn done");
        }
        else{
            System.out.println("Insufficient Fund");
        }
    }
    double checkBalance(){
        return balance;
    }
}

public class BankAccountDetails {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount to deposit");
        double DepositAmount = sc.nextDouble();
        account.deposit(DepositAmount);

        System.out.println("Enter amount to withdraw");
        double WithdrawnAmount = sc.nextDouble();
        account.withdraw(WithdrawnAmount);

        System.out.println("Balance: " +account.checkBalance());
    }
}

