package InterviewMock;

public class Agoda4 {

    public static void main(String[] args) {

    }

    public synchronized void methodA(int i, String msg) {
        System.out.println(i);
        System.out.println(msg);
    }

    public void methodB(int i, String msg) {
        synchronized (this) {
            System.out.println(Integer.toString(i));
            System.out.println(msg);
        }
    }
}
