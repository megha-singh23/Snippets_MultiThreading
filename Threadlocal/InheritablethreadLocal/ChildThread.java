package MultiThreading.Threadlocal.InheritablethreadLocal;

public class ChildThread extends Thread {
    
    public void run(){
        System.out.println("Child Thread value-- "+ ParentThread.t1.get());
    }
}
