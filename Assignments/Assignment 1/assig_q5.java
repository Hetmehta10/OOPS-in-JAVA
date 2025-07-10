// Extending Thread Class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Class: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}

// Implementing Runnable Interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Interface: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}

public class assig_q5 {
    public static void main(String[] args) {
        // Creating and starting thread using Thread class
        MyThread t1 = new MyThread();
        t1.start();

        // Creating and starting thread using Runnable interface
        MyRunnable r1 = new MyRunnable();
        Thread t2 = new Thread(r1);
        t2.start();
    }
}



/// Extending the Thread class
    /// Inheritance:	Not possible to extend another class (since Java supports single inheritance).
    /// Code Reusability:	Less reusable, as the thread behavior is tightly coupled with the class.
    /// Best Practice:	Not recommended unless thread-specific behavior needs to be modified.

/// Implementing the Runnable interface
    /// Inheritance:Can still extend another class since Runnable is an interface.
    /// Code Reusability: More reusable, as the thread behavior is separate from the class logic.
    /// Best Practice: Preferred approach in real-world applications.