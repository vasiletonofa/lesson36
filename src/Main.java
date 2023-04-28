import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        boolean flag = true;
//        int counter = 0;
//
//        synchronized ( Main.class) {
//            while (counter < 10 && flag) {
//                System.out.println("Block 1 Waiting to get notified");
//                flag = false;
//                Main.class.notify();
//            }
//        }
//
//        synchronized (Main.class) {
//            while (counter < 10 && !flag) {
//                System.out.println("Block 2 Waiting to get notified");
//                try {
//                    Main.class.wait();
//                } catch (Exception e) {
//
//                }
//
//                flag = true;
//            }
//        }



//        Message msg = new Message("process it");
//        Waiter waiter = new Waiter(msg);
//        new Thread(waiter,"waiter").start();
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
//            myWriter.write("Files in Java might be tricky, but it is fun enough!");
//            myWriter.close();
//            System.out.println("Successfully wrote to the file.");
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }

        try {
            FileReader fr=new FileReader("filename.txt");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


//        try (OutputStream out = new FileOutputStream(new File("filename.txt"))) {
//            int b;
//            while((b = in.read()) != -1) {
//                out.write(b);
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }

        try (FileOutputStream fos = new FileOutputStream("newfile.txt")) {

            String text = "Today is a beautiful day";
            byte[] mybytes = text.getBytes();

            fos.write(mybytes);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
//
//
//        try (FileInputStream fis = new FileInputStream(new File("newfile.txt"))) {
//            int content;
//            // reads a byte at a time, if it reached end of the file, returns -1
//            while ((content = fis.read()) != -1) {
//                System.out.print((char)content);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


//        try (FileOutputStream fos = new FileOutputStream("newfile.txt")) {
//
//            String text = "Today is a beautiful day";
//            byte[] mybytes = text.getBytes();
//
//            fos.write(mybytes);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }





    }


}