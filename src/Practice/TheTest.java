package Practice;
/*
Java guarantees that the constructor method of a class is called whenever an instance of that class is created. 
It also guarantees that the constructor is called whenever an instance of any subclass is created. 
In order to guarantee this second point, Java must ensure that every constructor method calls its 
superclass constructor method. 
Thus, if the first statement in a constructor does not explicitly invoke another constructor with this() or super(),
 Java implicitly inserts the call super(); 
that is, it calls the superclass constructor with no arguments. 
If the superclass does not have a constructor that takes no arguments, 
this implicit invocation causes a compilation error.
*/
class MainOne {

    private int i = 5;

    public MainOne() {
      
       System.out.println("MainOne says that I is " +  getI());
       
    }

    public int getI() {
        System.out.println("MainOne getI was used");
        return i;
    }

}

public class TheTest extends MainOne {

    private static int i;
    /*
As for why it prints 0, that's because i hasn't been set to 45 yet. 
Each field is initialized with a default value for that type, 0 in the case of integers. 
When you write int i = 45, the compiler will generate code in the constructor to set i = 45. 
But it places this code after the parent constructor is called. 
Therefore, you're printing the variable before it is initialized with its intended value.
     */
    public TheTest() {
    	//super();
        System.out.println("TheTest says that I is " + super.getI());
    }


    public int getI() {
        System.out.println("TheTest getI was usedd");
        return i;
    }

    public static void main(String[] args) {
        TheTest test = new TheTest();
    }

}
