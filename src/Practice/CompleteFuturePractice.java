package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class CompleteFuturePractice {

    ExecutorService executorService =
            new ThreadPoolExecutor(10, 10, 10L, TimeUnit.MILLISECONDS,
                    new LinkedBlockingQueue<Runnable>());

    public static void main(String[] args) {

        System.out.println("Starting " + Thread.currentThread().getName());

        CompleteFuturePractice completeFuturePractice = new CompleteFuturePractice();

        List<String> langList = Arrays.asList("EN", "ES", "SN", "EX");
//        List<String> langList = Arrays.asList("EN", "ES", "SN");

        List<CompletableFuture<GreetHolder>> completableFutures = langList.stream()
                .map(lang -> completeFuturePractice.getGreeting(lang)).collect(Collectors.toList());

        completableFutures.forEach(CompletableFuture::join);

        System.out.println("After all of " + Thread.currentThread().getName());
    }

    private CompletableFuture<GreetHolder> getGreeting(String lang) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println(String.format("%s started.", Thread.currentThread().getName()));
                Random r = new Random();
                int low = 2000;
                int high = 5000;
                int result = r.nextInt(high - low) + low;
                Thread.sleep(result);
                System.out.println(String.format("%s finished after %s", Thread.currentThread().getName(), result));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return new GreetHolder(getGreet(lang));
        }, executorService);
    }

    private String getGreet(String lang) {
        if (lang.equals("EN")) {
            return "Hello";
        } else if (lang.equals("ES")) {
            return "Hola";
        } else if (lang.equals("SN")) {
            return "Ayubovan";
        } else {
//            throw new IllegalArgumentException("Invalid lang param");
            System.out.println("Some error occurred");
            return null;
        }
    }

    private class GreetHolder {

        private String greet;

        public GreetHolder(String greet) {
            this.greet = greet;
        }

        public String getGreet() {
            return greet;
        }

        public void setGreet(String greet) {
            this.greet = greet;
        }
    }
}
