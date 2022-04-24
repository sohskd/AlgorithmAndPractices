package Practice.genericspractice;

public class RunApp {

    public static void main(String[] args) {

        SomeUserClass someUserClass = new SomeUserClass(new DesClassA());
        someUserClass.myMethod();

        someUserClass = new SomeUserClass(new DesClassB());
        someUserClass.myMethod();
    }
}
