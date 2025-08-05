package MultiThreading.ThreadExecutionPrevention;

public class ThreadSleep extends Thread{
    
    public void run(){

        for(int i=0;i<1000;i++){
            System.out.println("I am a lazy Thread!!!!"+i);
        }

        System.out.println("I am entering into sleeping state");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("I got interrupted");
        }
    }
}
 