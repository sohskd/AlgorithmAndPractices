package LeetCode;

public class repeatedSubstringPattern {

    public static void main(String[] args) {

        String s = "aba";

//        String s = "ababab";

//        String s = "abab";

        System.out.println(repeatedSubstringPatternAns(s));
    }

//    public static boolean repeatedSubstringPatternAns(String str) {
//
//        int l = str.length();
//
//        for (int i = l / 2; i >= 1; i--) {
//
//            if (l % i == 0) {
//
//                int m = l / i;
//                String subS = str.substring(0, i);
//
//                StringBuilder sb = new StringBuilder();
//
//                for (int j = 0; j < m; j++) {
//                    sb.append(subS);
//                }
//
//                if (sb.toString().equals(str))
//                    return true;
//            }
//
//        }
//
//        return false;
//    }

//    public static boolean repeatedSubstringPatternAns(String s) {
//        for (int i = 0; i < s.length(); i++) {
//            // try string
//            String toTry = s.substring(0, i + 1);
//
//            if (toTry.length() == s.length())
//                return false;
//
//            int j = 0;
//            int end = toTry.length();
//            boolean can = true;
//
//            while (j <  s.length()) {
//                if (end > s.length() || !s.substring(j, end).equals(toTry)) {
//                    can = false;
//                    break;
//                }
//                j += toTry.length();
//                end += toTry.length();
//            }
//
//            if (can)
//                return true;
//        }
//
//        return false;
//    }

    public static boolean repeatedSubstringPatternAns(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            // try string
            String toTry = s.substring(0, i + 1);

            if (toTry.length() == s.length())
                return false;

            int j = 0;
            int end = toTry.length();
            boolean can = true;

            while (j <  s.length()) {
                if (end > s.length() || !s.substring(j, end).equals(toTry)) {
                    can = false;
                    break;
                }
                j += toTry.length();
                end += toTry.length();
            }

            if (can)
                return true;
        }

        return false;
    }
}
