package InterviewMock;

public class Agoda8 {

    static String str;

    public void Agoda8() {
        System.out.println("in constrcu");
        str=  "Hello world";
    }

    public static void main(String[] args) {
        Agoda8 a = new Agoda8();
        System.out.println(str);
    }
}
