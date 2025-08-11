package MultiThreading.ExecutorFramework;

public class PrintJob extends Thread{
    
    String name;

    PrintJob(String name){
        this.name=name;
    }


    public void run(){
        System.out.println(name+" ....Job started by Thread: "+Thread.currentThread().getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name+ " .....job completed by Thread: "+Thread.currentThread().getName());
    }
}
