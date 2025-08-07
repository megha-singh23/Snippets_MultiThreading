package MultiThreading.Deadlock;

public class B {
    
    public synchronized void d2(A a){
        System.out.println("Thread 2 starts execution of d2() method");

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         System.out.println("Thread 2 trying to call A's last()");
        a.last();
    }

    public synchronized void last(){
    // public void last(){
        System.out.println("Inside B,this is last() method");
    }

}
