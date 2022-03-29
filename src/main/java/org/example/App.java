package org.example;

import java.io.IOException;
import java.util.concurrent.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws IOException {
        TestTask task = new TestTask();
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleAtFixedRate(task, 0, 50, TimeUnit.MINUTES);
    }
}
