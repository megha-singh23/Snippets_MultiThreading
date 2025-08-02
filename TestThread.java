package MultiThreading;

public class TestThread {
    
    public static void main(String[] args) {
        
        //Hybrid Approach
        MyThread t=new MyThread();
        Thread t1=new Thread(t); //By default t is also a runnable object as t is a child of Thread class
        //and Thread class is a child of Runnable Interface So, t is also a child of Runnable interface

        t1.start();

        Thread.currentThread().setName("Megha Singh");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Main Thread");
        System.out.println(10/0.0);
    }
}
