public class Writeable implements Runnable {

    String data;

    @Override
    public void run() {
        data = "Hello";
    }
}
