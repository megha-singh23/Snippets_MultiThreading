package MultiThreading.ThreadExecutionPrevention;

public class ThreadyieldDemo {
    
    public static void main(String[] args) {
        
        Threadyield t=new Threadyield();
        t.start();
        
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
