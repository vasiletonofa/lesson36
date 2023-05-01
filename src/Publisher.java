public class Publisher implements Runnable {


    Message message;

    public Publisher(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (message) {

            System.out.println("Scrim mesajul");

            message.setMsg("Hello World!");

            try {
                Thread.sleep(5000);
                message.notifyAll();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    // Subscriber - synchronized (message) { }   -- Executing -> sout(message)
    // Subscriber - synchronized (message) { }   -- Executing -> sout(message)
    // Subscriber - synchronized (message) { }   -- Executing -> sout(message)
    // Subscriber - synchronized (message) { }   -- Executing -> sout(message)
    // Publisher -  synchronized (message) { }   -- Waiting  -> 5000ms -> notifyAll()

    // Semafor 1  -- Red
    // Semafor 2  -- Red
    // Semafor 3  -- Green
    // Semafor 4  -- Red


}
