package MultiThreading.Deadlock;

public class DeadlockDemo {

    public static void main(String[] args) {
        
        Deadlock t=new Deadlock();
        t.m1();
    }

    // In this program if we remove at least one synchronized keyword then program won't enter into deadlock hence,
    // synchronized keyword is the only reason for deadlock situation due to this while using synchronized 
    // keyword we have to take special care
}
