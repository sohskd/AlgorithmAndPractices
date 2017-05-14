package Practice;

import java.util.Collection; 
import java.util.HashSet;
/*
1) Static binding in Java occurs during Compile time while Dynamic binding occurs during Runtime.
2) private, final and static methods and variables uses static binding and bonded by compiler while 
virtual methods are bonded during runtime based upon runtime object
3) Static binding uses Type(Class in Java) information for binding 
while Dynamic binding uses Object to resolve binding.
4) Overloaded methods are bonded using static binding while overridden methods are bonded 
using dynamic binding at runtime
 */
public class StaticBindingTest  
{  	
 public static void main(String args[])  
   {
     Collection c = new HashSet();
     StaticBindingTest et = new StaticBindingTest();
     et.sort(c);
   }
   //overloaded method takes Collection argument
  public Collection sort(Collection c)
   {
    System.out.println("Inside Collection sort method");
    return c;
   }
  //another overloaded method which takes HashSet argument which is sub class
  public Collection sort(HashSet hs)
  {
    System.out.println("Inside HashSet sort method");
    return hs;
   }
}
