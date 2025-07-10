/// Demonstrate the difference between calling start() and run() on a thread.

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }
}

public class assig_q2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        // Calling start() - runs in a new thread
        t1.start();

        // Calling run() directly - runs in the main thread
        t1.run();

        System.out.println("Main thread: " + Thread.currentThread().getName());
    }
}



/// Key Differences
// Using start():
    // It creates a new thread and calls the run() method on that new thread.
    // It enables actual multithreading.
    // The JVM schedules the thread execution.
    // Conclusion - Creates a new thread and executes run() in that thread.

// Using run() directly:
    // It does not create a new thread.
    // The run() method is executed in the same thread that called it.
    // No multithreading occurs.
    // Conclusion - Just calls run() like a normal method, executing in the same thread that invoked it.