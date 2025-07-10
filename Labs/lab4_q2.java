public class lab4_q2 {
    private double balance; 

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

   
    protected void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

  
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        lab4_q2 account = new lab4_q2();

        account.deposit(500);   
        account.withdraw(200);   
        account.checkBalance();    

    }
}