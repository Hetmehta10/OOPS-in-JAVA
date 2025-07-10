//Demonstrate the difference between calling start() and run() on a thread.
public class threads_q2 {
        public static void main(String[] args) {
            System.out.println(Thread.currentThread().getName());  // Default thread (main)
    
            Thread t1 = new Thread();  // Object of thread
            System.out.println(Thread.activeCount());  // still number of threads is 1 as we have not started it yet we have only declared it.
            t1.start();  // start the thread
            System.out.println(Thread.activeCount());  // Now count is 2 , as we have started the thread (t1)
    
    
            Thread t2 = new Thread();
            Thread t3 = new Thread();
            Thread t4 = new Thread();
            t2.start();
            t3.start();
            t4.start();
            System.out.println(Thread.activeCount());  // 5 , as we have started 4 threads
    
    }
}
