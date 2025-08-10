package MultiThreading.Locks;

public class SyncrhronizedDemo {
    
    public static void main(String[] args) {
        
        Display d=new Display();

        MyThread t=new MyThread(d,"Dhoni");
        MyThread t1=new MyThread(d,"Rohit");

        t.start();
        t1.start();
    }
}
