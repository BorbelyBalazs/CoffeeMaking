import java.util.concurrent.TimeUnit;

public class TimeDelay {

    public static void timeDelay(int delay) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.print("#");
            TimeUnit.MILLISECONDS.sleep(delay);
        }
    }
}
