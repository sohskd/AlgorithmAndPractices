package DerekBanas;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaLesson19Regex {
	public static void main(String[] args){
		
		String longString = " Derek     Banasss CA 349827 PA AK SEEEE sohskd93.222@hotmail.com desmondSOH"
				+ "6-920-567-4a3b2c1 (412)555-1212 412-555-1223 412555-1234 9-412-555-1234";
		String strangeString = "1Z aaa **** *** ** f {{{{ {{{ {{ {";
		
		/*
		 [] Insert Characters that are valid
		 [^ ] Insert Characters that are not valid
		 \\s Any white space
		 \\S Any Non white space 
		 {n, m} Whatever proceeds must occur between n and m times
		*/
		
		// Word must contain letters that are 2 to 20 characters in length
		// [A-Za-z]{2, 20}
		//regexChecker("[A-Za-z]{2,20}", longString);
		
		/*
		 \\d Any digits 0-9
		 \\D Anything not a number
		 {n} Whatever proceeds must occur n times
		*/
		//regexChecker("\\s\\d{6}", longString);
		
		/*
		 | is used for OR clause 
		 */
		
		// Must start with a A or C, followed by 1 letter in brackets
		// Must be a maximum of 2 characters in length
		// A[KLRZ]|C[AOT]
		//regexChecker("A[KLRZ]|C[AOT]", longString);
		
		/*
		 {n,} Whatever proceeds must occur at least n times
		 + Whatever proceeds must occur one or more times
		 . ^ * + ? { } [ ] \ | ( ) Characters that must be escaped or backslashed
		 */
		
		// Grab anything that contains 1 or more 
		//regexChecker("[\\{]{2,}", strangeString);
		
		// Grab Emails
		//regexChecker("[A-Za-z0-9._%-]+@[A-Za-z0-9._%-]+\\.[A-Za-z]{2,4}", longString);
		
		/* Telephone number in certain formats
		// ([0-9]( |-)?)? -> First number followed by space or dash. Question mark means may not be there. 
		// (\\(?[0-9]{3}\\)?|[0-9]{3}) -> Followed by open bracket (May not be there) and number of length 3
		// followed by close bracket(May not be there) OR just number of length 3
		// ( |-)? -> followed by space or dash or may not be there
		// ([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7}) followed by number of length 3 followed by space or dash
		// (May not be there). Followed by number of length 4 OR a-z,A-Z,0-9 of length 7		
		 */
		regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?([0-9]{4}|[A-Za-z0-9]{7}))", longString);
		 
		//regexReplace(longString);
		
		
	}
	
	public static void regexChecker(String theRegex, String str2Check){
		
		// You Define your regular expression (REGEX) using Pattern		
		Pattern checkRegex = Pattern.compile(theRegex);
		
		// Creates a Matcher Object that searches the String for anything 
		// that matches the REGEX
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		// Cycle through the positive matches and print them to screen
		// Make sure string isn't empty and trim off any whitespace
		
		while(regexMatcher.find()){
			if(regexMatcher.group().length() != 0){
				System.out.println(regexMatcher.group().trim());
				// You can get the starting and ending indexes
				System.out.println("Start Index: " + regexMatcher.start());
				System.out.println("End Index: " + regexMatcher.end());
			}
		}
		
	}

	public static void regexReplace(String strToReplace){
		
		Pattern replace = Pattern.compile("\\s+");
		
		Matcher regexMatcher = replace.matcher(strToReplace.trim());
		
		System.out.println(regexMatcher.replaceAll(", "));
		
	}

}
