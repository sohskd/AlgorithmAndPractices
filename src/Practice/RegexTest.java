package Practice;
import java.io.*;
/*
public class RegexTest{ 

   public static void main(String args[]) {
      String Str = new String("W()lcome to Tutorialzpoint.come");

      System.out.print("Return Value :" );
      System.out.println(Str.replaceAll("\\(", "Q"));
   }
}*/


//ReplaceAll uses Regex Expression
/*public class RegexTest{
   public static void main(String args[]){
       String str = new String("My .com site is BeginnersBook.com");
       System.out.print("String after replacing all com with net :" );
       System.out.println(str.replaceAll("Beginners(.*)", "net"));
   }
}*/

//Replace does not use Regex Expression so is faster
public class RegexTest{
	   public static void main(String args[]){
	       String str = new String("My .com site is BeginnersBook.com");
	       System.out.print("String after replacing all com with net :" );
	       System.out.println(str.replaceAll("e", "net"));
	   }
	}