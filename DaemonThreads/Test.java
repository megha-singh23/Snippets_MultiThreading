package MultiThreading.DaemonThreads;

class Test{

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isDaemon());
        // Thread.currentThread().setDaemon(true);  //RE: IllegalThreadStateException

        MyThread t=new MyThread();
        System.out.println(t.isDaemon());

        // t.setDaemon(true);

        System.out.println(t.isDaemon());
    }
}