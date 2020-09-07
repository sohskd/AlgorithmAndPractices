package StringCharacters;

import javax.xml.stream.events.Characters;

public class TestCharacters {

    public static void main(String[] args) {
        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetter(' '));
//        isPalindrome("A man, a plan, a canal: Panama");
        System.out.println(isPalindrome("0P"));
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 0)
            return true;
        int first = 0;
        int last = s.length() - 1;

        while (first <= last) {
            if (!Character.isLetterOrDigit(s.charAt(first))) {
                first++;
            } else if (!Character.isLetterOrDigit(s.charAt(last))) {
                last--;
            } else if (Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last)))
                return false;
            else {
                first++;
                last--;
            }
        }
        return true;
    }
}
