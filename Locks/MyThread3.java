package MultiThreading.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread3  extends Thread{
    
    static ReentrantLock l=new ReentrantLock();

    MyThread3(String name){
        super(name);
    }

    public void run(){

        do {
            try {
                if(l.tryLock(5000,TimeUnit.MILLISECONDS)){
                    System.out.println(Thread.currentThread().getName()+".....got lock");
                    try {
                        Thread.sleep(30000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    l.unlock();

                    System.out.println(Thread.currentThread().getName()+"...releases lock");

                    break;
                }else{

                    System.out.println(Thread.currentThread().getName()+"...unable to get lock and will try again");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
         while (true);
    }
}
