package MultiThreading.Syncronization.SynchronizedBlock;

public class SyncDemo {
    
    public static void main(String[] args) {
        
        Display d=new Display();
        Display d1=new Display();
        
        MyThread t1=new MyThread(d,"Megha");
        // MyThread t2=new MyThread(d,"Jyoti");
        MyThread t3=new MyThread(d1,"Jyoti");//Irregular output because this thread has different object of Display it has a lock of object d1 while thread 1 have a lock of object d
    
    
        t1.start();
        // t2.start();
        t3.start();
    }
    
}
