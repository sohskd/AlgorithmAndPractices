package Practice;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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
public class RegexTest {
    public static void main(String args[]) {

        String myString = "//12vs46badfs87/*hello worl" +
                "d */";

        String patternToRemove = "/\\*.*\\*/";

        List<Pattern> myPatterns = new ArrayList<>();

        myPatterns.add(Pattern.compile(patternToRemove));

        patternToRemove = "\\d+";

        myPatterns.add(Pattern.compile(patternToRemove));

        for (Pattern p : myPatterns) {

            Matcher matcher = p.matcher(myString);
            if (matcher.find()) {

                System.out.println(matcher.start());
                System.out.println(matcher.end());
                myString = myString.replaceAll(p.pattern(), "");
                System.out.println(myString);
                System.out.println(matcher.group());
            }

        }


        System.out.println(myString);

    }
}