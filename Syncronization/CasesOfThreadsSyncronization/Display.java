package MultiThreading.Syncronization.CasesOfThreadsSyncronization;

public class Display {

    public synchronized void display1(){

         for(int i=0;i<=10;i++){
            System.out.print(i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
    }

    public synchronized void display2(){

        for(int i=65;i<=75;i++){
            System.out.print((char)i);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
