package LeetCode.Hard;

public class ValidPalindrome3_1 {

    public static void main(String[] args) {

//        String str = "acdcb";
        String str = "acdwcb";

//        String str = "ab";
//        String str = "a";

        int k = 2;
        if (isKPalindrome(str, k)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean isKPalindrome(String s, int k) {

        while (s.charAt(0) == s.charAt(s.length() - 1)) {

            if (s.length() == 1)
                return true;

            s = s.substring(1, s.length() - 1);
        }

        if (k == 0)
            return false;

        return isKPalindrome(s.substring(0, s.length() - 1), k - 1) || //
                isKPalindrome(s.substring(1, s.length()), k - 1);
    }
}
