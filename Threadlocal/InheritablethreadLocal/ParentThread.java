package MultiThreading.Threadlocal.InheritablethreadLocal;

public class ParentThread extends Thread{
    
    public static InheritableThreadLocal<String>t1=new InheritableThreadLocal<>(){
        public String childValue(String p){
            return "cc";
        }
    };

    public void run(){
        t1.set("pp");
        System.out.println("Parent Thread Value-- "+t1.get());
        ChildThread ct=new ChildThread();
        ct.start();
    }
}
