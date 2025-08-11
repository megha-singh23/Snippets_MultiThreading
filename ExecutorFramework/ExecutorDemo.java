package MultiThreading.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
     
    public static void main(String[] args) {
        
        PrintJob[] jobs={
            new PrintJob("Megha"),
            new PrintJob("Apoorva"),
            new PrintJob("Mansi"),
            new PrintJob("Jharna"),
            new PrintJob("Anshika"),
            new PrintJob("Ritika"),
        };

        ExecutorService service=Executors.newFixedThreadPool(3);

        for (PrintJob job : jobs) {
            service.submit(job);
        }

        service.shutdown();

    }
}
