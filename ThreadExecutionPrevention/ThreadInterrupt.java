package MultiThreading.ThreadExecutionPrevention;

public class ThreadInterrupt {
    
    public static void main(String[] args) {
        
        InterruptionThread  t=new InterruptionThread();
        t.start();

        t.interrupt();
        System.out.println("End of main");
        
    }
}
