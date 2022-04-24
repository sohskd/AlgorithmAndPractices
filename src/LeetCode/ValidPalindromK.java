package LeetCode;

public class ValidPalindromK {

    public static void main(String[] args) {

//        String s = "abcdeca";
//        String s = "abcdeca";

        String s = "xxxxabababa";

        int k = 3;

        System.out.println(failK(s, 0, s.length() - 1, k));
    }

    public static boolean failK(String s, int l, int r, int k) {

        if (k < 0)
            return false;

        if (l > r)
            return true;

        if (s.charAt(l) != s.charAt(r)) {
            return failK(s, l + 1, r, k - 1) || failK(s, l, r - 1, k - 1);
        } else {
            return failK(s, l + 1, r - 1, k);
        }
    }


}
