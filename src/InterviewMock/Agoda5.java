package InterviewMock;

public class Agoda5 implements Runnable {

    private Thread t;
    private String threadName;

    Agoda5(String threadName) {
        this.threadName = threadName;
    }

    public void run() {
        while (true)
            System.out.println(threadName);
    }

    public void start () {
        if (t==null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }

    public static void main(String[] args) {
        Agoda5 A =new Agoda5("A");
        Agoda5 B =new Agoda5("B");

        B.start();
        A.start();
    }
}
