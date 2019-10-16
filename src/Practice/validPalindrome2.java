package Practice;

public class validPalindrome2 {

    public static void main(String[] args) {

        // String s = "abca";
        // String s = "tebbem";
         String s = "abebta";

//        validPalindrome(s);
        String v = "ad";

        System.out.println(s.length());
    }

//    public static boolean validPalindrome(String s) {
//        int l = -1, r = s.length();
//        while (++l < --r)
//            if (s.charAt(l) != s.charAt(r))
//                return isPalindromic(s, l, r + 1) || isPalindromic(s, l - 1, r);
//        return true;
//    }
//
//    public static boolean isPalindromic(String s, int l, int r) {
//        while (++l < --r)
//            if (s.charAt(l) != s.charAt(r)) return false;
//        return true;
//    }
}
