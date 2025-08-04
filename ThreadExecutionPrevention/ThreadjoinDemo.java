package MultiThreading.ThreadExecutionPrevention;

public class ThreadjoinDemo {
    
    public static void main(String[] args) throws InterruptedException {
        
        Threadjoin.mt=Thread.currentThread(); //gives main thread reference to Threadjoin(child thread)

        //Thread.currentThread().join();if a thread calls join method on the same thraed itself then the program 
        //will be stucked(This is something like deadlock).In this case the threa has to wait infinite amount of time.

        Threadjoin t=new Threadjoin();
        t.start();

        // t.join(); //main thread will wait until completing child thread
        //  t.join(4000); // main thread will wait until given time expired
        
        for(int i=0;i<5;i++){
            System.out.println("Main Thread");
        }
    }

    //If main thread calls join method on child thread object and child thread also calls join method on main thread 
    // object then both threads will wait forever and program will be paused or stucked(This is something like deadlock)
}
