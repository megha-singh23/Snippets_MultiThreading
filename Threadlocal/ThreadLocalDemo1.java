package MultiThreading.Threadlocal;

class ThreadLocalDemo1{

    public static void main(String[] args) {
        
        ThreadLocal<String> t1=new ThreadLocal<>(){
            public String initialValue(){
                return "abc";
            }
        };

        System.out.println(t1.get());
        t1.set("Megha");
        System.out.println(t1.get());
        t1.remove();
        System.out.println(t1.get());

    }
}