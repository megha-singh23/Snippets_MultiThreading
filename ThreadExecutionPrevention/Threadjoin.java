package MultiThreading.ThreadExecutionPrevention;

public class Threadjoin extends Thread {
    
    static Thread mt;

    public void run(){

        try {
            mt.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for(int i=0;i<5;i++){

            System.out.println("Child Thread");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}
