import java.io.*;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Message message = new Message("");
//
//        Subscriber subscriber = new Subscriber(message);
//        Subscriber subscriber2 = new Subscriber(message);
//        Subscriber subscriber3 = new Subscriber(message);
//        Subscriber subscriber4 = new Subscriber(message);
//
//        Publisher publisher = new Publisher(message);
//
//        Thread thread = new Thread(subscriber);
//        Thread thread2 = new Thread(subscriber2);
//        Thread thread3 = new Thread(subscriber3);
//        Thread thread4 = new Thread(subscriber4);
//
//        Thread thread1 = new Thread(publisher);
//
//        thread.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//
//        thread1.start();

//        Message msg = new Message("process it");
//        Waiter waiter = new Waiter(msg);
//        new Thread(waiter, "waiter").start();
//
//        Waiter waiter1 = new Waiter(msg);
//        new Thread(waiter1, "waiter1").start();
//
//        Notifier notifier = new Notifier(msg);
//        new Thread(notifier, "notifier").start();
//        System.out.println("All the threads are started");


//        try {
//            File myObj = new File("filename.txt");
//            if (myObj.createNewFile()) {
//                System.out.println("File created: " + myObj.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }


//        try {
//            FileWriter myWriter = new FileWriter("filename.txt");
//            myWriter.write("Hello World!");
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
//////
//        try {
//            FileReader fr=new FileReader("filename.txt");
//            int i;
//            while((i=fr.read())!=-1)
//                System.out.print((char)i);
//            fr.close();
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//
//        try (FileOutputStream fos = new FileOutputStream("newfile.txt")) {
//
//            String text = "Today is a beautiful day";
//            byte[] mybytes = text.getBytes();
//
//            fos.write(mybytes);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
////
////
//
//        StringBuilder stringBuilder = new StringBuilder();
//        try (FileInputStream fis = new FileInputStream(new File("newfile.txt"))) {
//            int content;
//            // reads a byte at a time, if it reached end of the file, returns -1
//            while ((content = fis.read()) != -1) {
//                stringBuilder.append((char)content);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        String s = stringBuilder.toString();
//        System.out.println(s);


//        try (FileOutputStream fos = new FileOutputStream("newfile.txt")) {
//
//            String text = "Today is a beautiful day";
//            byte[] mybytes = text.getBytes();
//
//            fos.write(mybytes);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        try {
            File destination = new File("ZooCopy.csv");
            List<String> data = new ArrayList<>();
            data.add("hello");
            data.add("World");
            for(String record: data) {
                System.out.println(record);
            }
            CopyTextFileSample.writeFile(data,destination);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//
//        executorService.execute(() -> System.out.println("Hello"));
//
//        executorService.shutdown();
//
//        ExecutorService executorService1 = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//
//        Future<Integer> future =  executorService.submit( ()  -> 1 + 2);
//
//       try {
//           System.out.println(future.get());
//       } catch (Exception e) {
//
//       }

//        ExampleSynchronized exampleSynchronized = new ExampleSynchronized();
//
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//
//        for(int i =0; i< 10; i++) {
//            executorService.submit(() -> exampleSynchronized.increment());
//        }
//
//        executorService.shutdown();
//
//        try {
//            Thread.sleep(1000);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//
//        System.out.println("count: " +   exampleSynchronized.count);
//    }

    }
}