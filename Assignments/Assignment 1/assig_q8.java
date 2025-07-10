/// What happens if you call run() instead of start()? Demonstrate with a program.

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running.");
    }
}

public class assig_q8 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        System.out.println("Calling run():");
        t1.run();  // Runs in the main thread
        t2.run();  // Runs in the main thread

        System.out.println("\nCalling start():");
        t1.start();  // Runs in a separate thread
        t2.start();  // Runs in a separate thread
    }
}




/// If you call run() instead of start(), the thread will not execute concurrently. Instead, it will run like a normal method call within the main thread, meaning no separate thread is created.

// Calling run() directly:
    // The method executes like a normal function inside the main thread.
    // No new thread is created. Both t1.run() and t2.run() execute sequentially inside the main thread.

// Calling start():
    // It creates a new thread and calls run() internally.
    // t1.start() and t2.start() execute concurrently in separate threads (Thread-0, Thread-1).