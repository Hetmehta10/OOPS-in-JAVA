// Create a thread by implementing the Runnable interface to print numbers from 1 to 5.


class MyR implements Runnable{
    public void run() {
        for(int i=1; i<=5;i++)
        {
            System.out.println("Runnable thread "+ i);
            
        }
    }
}

public class assig_q4 {
    public static void main(String[] args) {
        MyR r1 = new MyR();
        Thread t = new Thread(r1);
        t.start();
    }
}