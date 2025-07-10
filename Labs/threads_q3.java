//Modify Example 1 to print even numbers from 2 to 10.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class Mythread1 extends Thread{
    public void run(){ //run method is called when thread is started
        for(int i=2; i<=10;i++) //starting from 2 to 10
        {
            System.out.println("Thread 1 is runing: "+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

public class threads_q3 {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        System.out.println(t1.getState()); //to check the state,if it's working or not
        t1.start();
        System.out.println(t1.getState());
}

}
