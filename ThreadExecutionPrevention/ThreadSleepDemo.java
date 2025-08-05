package MultiThreading.ThreadExecutionPrevention;

public class ThreadSleepDemo {
    
    public static void main(String[] args) {
        ThreadSleep t=new ThreadSleep();
        t.start();

        t.interrupt();
        

        System.out.println("End of main");

        //whenever we calling interrupt() method if the target thread is not in the waiting state and sleeping state 
        // then there is no impact at all ,no interruption occur
        //Interrupt call will be waited until target thread entered into waiting and sleeping state if the target 
        // thread entered into sleeping and waiting state then immediately interrupt call will interrupt the target thread

        //**if the target thread never entered into sleeping and waiting state in its lifetime then there is no impact
        //  of interrupt call ,this is the only case where interrupt call will be wasted
    }
}
