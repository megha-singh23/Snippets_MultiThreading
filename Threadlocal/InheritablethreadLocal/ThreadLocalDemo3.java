package MultiThreading.Threadlocal.InheritablethreadLocal;

public class ThreadLocalDemo3 {
    
    public static void main(String[] args) {
        
        ParentThread pt=new ParentThread();
        pt.start();
    }

    //In the above program if we replace InheritableThreadLocal with ThreadLocal and if we are not overriding 
    // child value method then output is: Parent Thread Value-- pp
    // Child Thread value-- null

    // In the above program if we are maintaining InheritablethreadLocal and and if we are not overriding child 
    // value method then output is: Parent Thread Value-- pp
    // Child Thread value-- pp
}
