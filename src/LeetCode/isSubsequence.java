package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class isSubsequence {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "ahbgdc";

        System.out.println(isSubsequence(s1, s2));
    }

//    public static boolean isSubsequence(String s, String t) {
//
//        if (s.length() == 0 && t.length() != 0)
//            return true;
//        if (s.length() == 0 && t.length() == 0)
//            return true;
//        if (s.length() != 0 && t.length() == 0)
//            return false;
//
//        int i = 0;
//
//        for (int j = 0; j < t.length(); j++) {
//            if (s.charAt(i) == t.charAt(j)) {
//                i++;
//            }
//
//            if (i == s.length())
//                return true;
//        }
//
//        return false;
//    }

    public static boolean isSubsequence(String s, String t) {

        List<Integer>[] idx = new List[256]; // Just for clarity

        for (int i = 0; i < t.length(); i++) {
            if (idx[t.charAt(i)] == null)
                idx[t.charAt(i)] = new ArrayList<>();
            idx[t.charAt(i)].add(i);
        }

        int prev = 0;

        for (int i = 0; i < s.length(); i++) {

            if (idx[s.charAt(i)] == null)
                return false; // Note: char of S does NOT exist in T causing NPE
            int j = Collections.binarySearch(idx[s.charAt(i)], prev);

            if (j < 0)
                j = -j - 1;

            if (j == idx[s.charAt(i)].size())
                return false;

            prev = idx[s.charAt(i)].get(j) + 1;
        }

        return true;
    }
}
