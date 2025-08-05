package MultiThreading.Syncronization;

public class SyncronizedDemo {
    
    public static void main(String[] args) {

        Displaysyncronize d1=new Displaysyncronize();
        Displaysyncronize d2=new Displaysyncronize();

        TestSyncronize t1=new TestSyncronize(d1, "Dhoni");
        TestSyncronize t2=new TestSyncronize(d2, "Yuvraj");
        // TestSyncronize t3=new TestSyncronize(d, "Kohli");
        // TestSyncronize t4=new TestSyncronize(d, "Raina");

        t1.start();
        t2.start();
        // t3.start();
        // t4.start();
    }

    //CASE STUDY
    //eventought wish() method is syncronized, we will get irregular output beacuse threads are operating 
    // different java objects
    
    // Conclusion-> if multiple threads are operating on same java object then syncronization is required.
    // if multiple threads are operationg on multiple java objects then syncronization is not required.

    //Class-Level-Lock: every class in java has a unique lock which is nothing but class level lock.
    //if a thraed wants to execute a static syncronized method then thraed required class level lock. Once thread got class-level lock then it is allowed to execute any static syncronized method of that class 
    // once the method execution completes automatically the class releases the lock

    //**while a thread executing static syncronized method the remaining thread are not allowed to execute any 
    // static syncronized method of that class simultaneously but reaming threads are allowed to execute the 
    // following method simultaneously: static method, syncronized instance method, normal instance method

    //For example:
    // class X{

    //     static synchronized m1();
    //     static synchronized m2();
    //     static m3();
    //     synchronized m4()
    //     m5();
        
    // }

    // when t1 executes m1 method it requires class level lock so t2 thread not allowed to run m1 method so it
    // goes into waiting state and t3 also do not allowed to run m2 method beacuse it also needs class level 
    // lock and t1 already have that and t4,t5,t6 allowed to run m3() m4() m5() method as t4 allowed beacuse it needs object level lock
}
