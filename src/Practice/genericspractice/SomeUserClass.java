package Practice.genericspractice;

public class SomeUserClass<T extends DesSupClass> {

    private T t;

    public SomeUserClass(T t) {
        this.t = t;
    }

    public void myMethod() {
        t.printSomeDes();
    }
}
