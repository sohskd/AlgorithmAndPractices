package Practice;

public class MyClass {

    public String a = "bebe";

    public InnerClass innerClass = new InnerClass();

    public static void main(String[] args) {

        MyClass myClass = new MyClass();

        myClass.mutatePrimitive(myClass.a);

        myClass.mutateObject(myClass);

        System.out.println("Done");

    }

    public void mutatePrimitive(String a) {
        a = "i wont change";
    }

    public void mutateObject(MyClass myClass) {

        System.out.println(">");

        myClass.a = "haha";

        myClass.innerClass.b = "changeddd!!";

//        InnerClass i = myClass.innerClass;
//        i.b = "i am changed";
//        i.c = 20;


        myClass = new MyClass();


//        myClass.innerClass.c = 99;

        System.out.println("<");

    }

    class InnerClass {

        public String b = "i am newly created";

        private int c = 1;
    }
}
