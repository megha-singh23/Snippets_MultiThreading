package MultiThreading.ThreadExecutionPrevention;

public class SlideRotator {
    public static void main(String[] args) {
        
        for(int i=0;i<5;i++){

            System.out.println("Slide-"+i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
