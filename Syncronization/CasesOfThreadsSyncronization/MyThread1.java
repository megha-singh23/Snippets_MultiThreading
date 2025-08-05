package MultiThreading.Syncronization.CasesOfThreadsSyncronization;

public class MyThread1 extends Thread{
    
    Display d;
    
     MyThread1(Display d){
        this.d=d;
     }

     public void run(){
        d.display1();
    }
}
