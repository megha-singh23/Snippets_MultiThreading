package MultiThreading.DaemonThreads;

public class DaemonThreadDemo {
    public static void main(String[] args) {
        
        MyThread t=new MyThread();
        t.setDaemon(true); //line 1
        t.start(); 
        System.out.println("end of main thread");


        //If we are commenting line 1, then both main thread and child thread are not daemon and hence, both 
        // threads will be executed until their completion.

        // If we are not commenting line 1, then main thraed is non-daemon and child thread is daemon hence, 
        // whenever main thread terminated then automatically child thread will be terminated.

    }
}
