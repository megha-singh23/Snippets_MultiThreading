package MultiThreading.InterThreadCommunication;

public class ThreadA {
    
    public static void main(String[] args) {
        
        ThreadB b=new ThreadB();
        b.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized(b){
            System.out.println("main thread trying to call wait method..");
            try {
                b.wait(1000);
            } catch (InterruptedException e) {
                e.printStackTrace(); 
            }
            System.out.println("main thread got notification");
            System.out.println(b.total);
        }
    }
}
