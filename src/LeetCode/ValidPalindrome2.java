package LeetCode;

public class ValidPalindrome2 {

    public static void main(String[] args) {

        System.out.println(validPalindrome("acbba"));
    }

    public static boolean validPalindrome(String s) {

        if (s == null || s.length() == 0)
            return false;

        return isPalindrome(s, 1);
    }

    public static boolean isPalindrome(String s, int k) {

        if (k < 0)
            return false;

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                String ignoreLChar = s.substring(l + 1, r + 1);
                String ignoreRChar = s.substring(l, r);
                return isPalindrome(ignoreLChar, k - 1) || isPalindrome(ignoreRChar, k - 1);
            }

            l++;
            r--;
        }

        return true;
    }

//    public static boolean validPalindrome(String s) {
//
//        int l = 0;
//        int r = s.length() - 1;
//        while (l <= r) {
//            if (s.charAt(l) == s.charAt(r)) {
//                l++;
//                r--;
//            } else {
//                return isPalindrome(s, l, r - 1) || isPalindrome(s, l + 1, r);
//            }
//        }
//        return true;
//    }
//
//    private static boolean isPalindrome(String str, int s, int t) {
//
//        while (s <= t) {
//            if (str.charAt(s) == str.charAt(t)) {
//                s++;
//                t--;
//            } else
//                return false;
//        }
//
//        return true;
//    }
}
