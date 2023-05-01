public class ExampleSynchronized {

    public int count;

    public void increment() {
        synchronized (this) {
            count = count + 1;
            System.out.println(count);
        }
    }
    Message msg;

    public void write() {  // Thread1

        synchronized (msg) {
            // Message ...
            // message.notify()
        }

    }


    public void waiter() { // Thread2
        synchronized (msg) {
            // Read Message when ready
            // message.wait()

            // sout(msg)
        }
    }

}
