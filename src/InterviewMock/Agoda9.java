package InterviewMock;

public class Agoda9 {

    public static void main(String[] args) {

        A();
        B();
        C();
        D();

    }

    public static void A() {
        int a = 5;
        int b = 2;

        a = a+b;
        b = a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);
    }

    public static void B() {
        int a = 5;
        int b = 2;

        a = a*b;
        b = a/b;
        a=a/b;

        System.out.println(a);
        System.out.println(b);
    }

    public static void C() {
        int a = 5;
        int b = 2;

        a = a^b;
        b = a^b;
        a=a^b;

        System.out.println(a);
        System.out.println(b);
    }

    public static void D() {
        int a = 5;
        int b = 2;

        a = a&b;
        b = a|b;
        a=a|b;

        System.out.println(a);
        System.out.println(b);
    }
}
