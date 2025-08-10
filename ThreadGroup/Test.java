package MultiThreading.ThreadGroup;

class Test{

    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getThreadGroup().getName()); //main thread belongs to main threadgroup
        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
        
        ThreadGroup g1=new ThreadGroup("First group");
        System.out.println(g1.getParent().getName());

        ThreadGroup g2=new ThreadGroup(g1,"Second group");
        System.out.println(g2.getParent().getName());

        


    }
}