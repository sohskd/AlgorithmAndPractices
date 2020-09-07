package LeetCode.Hard;

public class ValidPalindrome3 {

    public static void main(String[] args) {

        // true
//        String str = "acdcb";

        // false
//        String str = "acdwcb";

        String str = "ab";

        int k = 2;
        if (testIt(str, k)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean testIt(String s, int k) {
        if (s.length() <= 1) {
            return true;
        }

        // Don't minus k if 1st & last is equal. Proceed to check inner.
        while (s.charAt(0) == s.charAt(s.length() - 1)) {
            s = s.substring(1, s.length() - 1);

            if (s.length() <= 1) {
                return true;
            }
        }

        if (k == 0) {
            return false;
        }

        // Try to remove the first or last character
        return testIt(s.substring(0, s.length() - 1), k - 1) ||
                testIt(s.substring(1, s.length()), k - 1);
    }
}
