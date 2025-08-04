package MultiThreading.ThreadExecutionPrevention;

public class Threadyield extends Thread {
    
    public void run(){
        
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
            Thread.yield(); //this method gives other threads a chance to execute first
        }
    }
}
