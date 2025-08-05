package MultiThreading.Syncronization;

public class Displaysyncronize {
    
    public static synchronized void wish(String name){
        for(int i=0;i<5;i++){
            System.out.print("Good Morning :");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name);
        }
    }
}