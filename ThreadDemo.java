package MultiThreading;

public class ThreadDemo {
    
    public static void main(String[] args) {
        
        MyThread t=new MyThread();
        t.start();
        t.run(5);

        for(int i=0;i<=10;i++){
            System.out.println("Main Thread..........");
        }
        //After starting a thread if we are trying to restart a same thread then we will get 
        //RuntimeException saying IllegalThreadStateException
        //t.start(); //RE: IllegalThreadStateException because same Thread cannot be started again

        MyRunnable r=new MyRunnable();
        Thread t1=new Thread(r, "Runnable thread");
        t1.start();

        
        
    }

}
