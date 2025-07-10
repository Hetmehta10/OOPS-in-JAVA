/// Modify Example 1 to print even numbers from 2 to 10.
class MyThread1 extends Thread {
    public void run() {
        for (int i = 2; i <= 10; i += 2) {  // Printing even numbers from 2 to 10
            System.out.println("Thread 1 is running: " + i);
            try {
                Thread.sleep(1000);  // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class assig_q3 {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        System.out.println("Thread state before start: " + t1.getState());
        t1.start();
        System.out.println("Thread state after start: " + t1.getState());
    }
}