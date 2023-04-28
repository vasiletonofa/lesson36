import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Recapitulare {



    class LinkedList2 {


        Node head;

        class Node {
            Node prev;
            Node next;

            Object data;

        }


        void add(Object data) {

            // cine este head

            if(head == null) {
                head = new Node();
                head.next = null;
                head.prev = null;
            } else {

                while (head.next != null) {

                }

            }

        }

        void  get(Object data) {
            while (head.data != data) {
                 head = head.next;
            }

        }
    }


    // head = Andrei

    // prev = null
    // data = Andrei
    // next = Vasile

    // prev = Andrei
    // data = Vasile
    // next = Ion

    // prev = Vasile
    // data = Ion
    // next = null


    // ArrayList =  0 [Gheorghe]  1 -[Ion]  2 -[Vasile]
    // LinkedList =  Node(Gheorghe) ->  Node(Ion) -> Node(Andrei)


    public void run() {

        List<String> list = new ArrayList<>(8);

        list.add("Vasile"); // [0]
        list.add("Ion"); // [1]]

        list.get(1);

        list.set(0, "Andrei");

        List<String> stringList = new java.util.LinkedList<>();

        stringList.add("Vasile"); // 0
        stringList.add("Ion"); // 1

        stringList.get(1);


        Queue<String> s = new LinkedList<>(); // FIFO

        s.offer("");

        Deque d = new LinkedList<>(); // LIFO

        d.push("A");

        // HashSet - neordonate, unice
        // LinkedHashSet - ordonate, unice

        // TreeSet - sortate, unice

        // HashMap - neordonate, key - unice, valori - nu sunt unice
        // LinkesHashMap - ordonate, key - unice, valori - nu sunt unice

        // TreeMap - key - sortate, key - unice, valori - nu sunt unice

        LinkedHashSet<String> set = new LinkedHashSet<>();

        LinkedHashMap<String, String> map = new LinkedHashMap<>();


        Thread thread = new Afisare();
        thread.start();


        Runnable runnable = () -> {
            for (int i =0; i< 10; i++) {
                System.out.println("Hello world");
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(() -> System.out.println("Hello tekwill"));
        thread2.start();

        Thread thread3 = new Thread(new Writeable());
        thread3.start();

        try {
            Disenare disenare = new Disenare();
           String a =  disenare.call();
        } catch (Exception  e) {
            System.out.println(e.getMessage());
        }

        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

            executorService.submit(new Disenare());
            executorService.submit(new Disenare());
            executorService.submit(new Disenare());
            executorService.submit(new Disenare());
            executorService.submit(new Disenare());

            Future<String> future = executorService.submit(new Disenare());

            String a = future.get();
        } catch (Exception  e) {
            System.out.println(e.getMessage());
        } finally {
            executorService.shutdown();
        }








    }
 }
