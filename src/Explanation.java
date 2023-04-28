import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Explanation {

    public void run() {
        System.out.println("Begin"); // MainThread

        Thread thread = new Thread(() -> System.out.println("Hello"));

        thread.start();  // CustomThread


        System.out.println("End");


        System.out.println("Begin"); // MainThread

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> "Hello");

        try {
            String s = future.get();
            System.out.println(s);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End");


        System.out.println("Begin"); // MainThread

        ExecutorService executorService2 = Executors.newSingleThreadExecutor();
        executorService2.execute(() -> System.out.println("Hello"));


        System.out.println("End");


        // MainThread: Begin -> End
        // CustomThread:               Hello
    }
}
