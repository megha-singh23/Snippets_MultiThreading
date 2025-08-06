package MultiThreading.Syncronization.SynchronizedBlock;

public class Display {
    
    
    public void wish(String name){
        ;;;;;;;;;;;;;;;;;;;;//----1 lakh lines of code

        // synchronized(this){
        synchronized(Display.class){   //needs class-level lock

            for (int i = 0; i < 10; i++) {
                System.out.print("Good morning :");
    
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(name);
            }
        }
        
        ;;;;;;;;;;;;;;;;;;;;//----1 lakh lines of code

    }
}

