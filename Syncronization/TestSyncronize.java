package MultiThreading.Syncronization;

public class TestSyncronize extends Thread{
    
   
    Displaysyncronize d;
    String name;

    TestSyncronize(Displaysyncronize d,String name){
        this.d=d;
        this.name=name;
    }

    public void run(){ 
        // d.wish(name);
        Displaysyncronize.wish(name);
    }
}
