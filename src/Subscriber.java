public class Subscriber implements  Runnable{

    Message message;

    public Subscriber(Message message) {
        this.message = message;
    }

    @Override
    public void run() {

        synchronized (message) {

            System.out.println("Asteptam mesajul");

            try {
                message.wait();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Am primit mesajul: " + message.getMsg());

        }

    }
}
