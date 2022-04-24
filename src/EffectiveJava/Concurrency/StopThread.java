package EffectiveJava.Concurrency;

import java.util.concurrent.TimeUnit;

/**
 * public class StopThread {
 * <p>
 * private static boolean stopRequested;
 * <p>
 * public static void main(String[] args)
 * throws InterruptedException {
 * Thread backgroundThread = new Thread(() -> {
 * int i = 0;
 * while (!stopRequested) {
 * System.out.println(i);
 * i++;
 * }
 * });
 * backgroundThread.start();
 * System.out.println("Main - 19");
 * TimeUnit.SECONDS.sleep(1);
 * System.out.println("Main - 21");
 * stopRequested = true;
 * }
 * }
 **/

// Properly synchronized cooperative thread termination
public class StopThread {

    private static boolean stopRequested;

    private static synchronized void requestStop() {
        stopRequested = true;
    }

    private static synchronized boolean stopRequested() {
        return stopRequested;
    }

    public static void main(String[] args)
            throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested()) {
                System.out.println(i);
                i++;
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        requestStop();
    }
}

