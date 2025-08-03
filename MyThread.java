package MultiThreading;

public class MyThread extends Thread{
    
    public void run(){

        for(int i=0;i<=10;i++){
            // System.out.println("Child Thread..........");
            System.out.println(Thread.currentThread().getName());

        }    
        // Thread.currentThread().setPriority(4);
        System.out.println(Thread.currentThread().getPriority());
    }

    public void run(int i){
        System.out.println("Overloaded method....");
    }

    // public void start(){ //it is not recommended to override start() method otherwise don't go for multithreadng concept
    // super.start(); responsible for executing run() method 
    //System.out.println("start method..."); this is still executed by main thread
    // }
}
