package MultiThreading.ThreadGroup;

public class ThreadGroupDemo {
    
    public static void main(String[] args) {
        
        ThreadGroup g1=new ThreadGroup("tg");
    
        Thread t1=new Thread(g1,"Thread1");
        Thread t2=new Thread(g1,"Thread2");
        g1.setMaxPriority(3);

        Thread t3=new Thread(g1,"Thread3");

        System.out.println(t1.getPriority());//5
        System.out.println(t2.getPriority());//5 
        System.out.println(t3.getPriority());//3
    }

    //Threads in the thread group that already have higher priority wouldn't be affected but for newly added 
    // thread this maxpriority is applicable.
}
