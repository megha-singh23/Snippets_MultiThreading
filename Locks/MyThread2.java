package MultiThreading.Locks;

import java.util.concurrent.locks.ReentrantLock;

public class MyThread2 extends Thread{
    
    static ReentrantLock l=new ReentrantLock();

    MyThread2(String name){
        super(name);
    }

    public void run(){

        if(l.tryLock()){
            System.out.println(Thread.currentThread().getName()+".....got lock and performing safe operations");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            l.unlock();
        }else{
            System.out.println(Thread.currentThread().getName()+"...unable to get lock and hence performing alternative operations");
        }

    }
}
