package MultiThreading.Locks;

import java.util.concurrent.locks.ReentrantLock;

public class Display {
    
    ReentrantLock l=new ReentrantLock();

    public void wish(String name){

        l.lock();//---1

        for (int i = 0; i < 10; i++) {
            System.out.print("Good Morning: ");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(name);

        }
        l.unlock();//---2
    }

    // If we comment line 1 and line 2, then threads will be executed simultaneously and we will get irregular 
    // output and if we are not commenting line 1 and line 2 then threads will be executed one by one and we 
    // will get regular output.
}
