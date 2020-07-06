package Practice;

import java.util.concurrent.TimeUnit;

public class concurrency {

    private static boolean flag;

    public static void main(String[] args) throws InterruptedException {

        Thread b = new Thread(() -> {
            int i = 0;
            while (!flag) {
                System.out.println(i);
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                i++;
            }
        });

        b.start();

        TimeUnit.SECONDS.sleep(5);

        System.out.println("here");
        flag = true;


    }
}
