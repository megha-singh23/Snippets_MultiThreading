package MultiThreading.ThreadExecutionPrevention;

public class InterruptionThread extends Thread{
    
    public void run(){
        try {
            for(int i=0;i<5;i++){
                System.out.println("I am a lazy Thread...");
                Thread.sleep(2000);
        }
    }
        catch (InterruptedException e) {
               System.out.println("I get interrupted");
            }
    }
}
