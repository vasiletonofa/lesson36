import java.util.concurrent.Callable;

public class Disenare implements Callable<String> {

    @Override
    public String call() throws Exception {
        return "Patrat";
    }
}
