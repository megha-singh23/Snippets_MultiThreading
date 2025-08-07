package MultiThreading.Deadlock;

public class Deadlock extends Thread {

    A a=new A();
    B b=new B();

    public void m1() {
       this.start();
       a.d1(b);  //This line is exesuted by main thread
    }

    public void run(){
        b.d2(a);  //This line is executed by child thread
    }
    
}
