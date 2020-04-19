package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RepeatedDNASubsequence {

    public static void main(String[] args) {

        String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(s));
    }

    public static List<String> findRepeatedDnaSequences(String s) {

        List<String> repeatedSubsequences = new ArrayList<>();
        Map<String, Integer> seen = new HashMap<>();
        int i = 0;
        while (i + 10 < s.length() + 1) {
            String subsequence = s.substring(i, i + 10);
            seen.put(subsequence, seen.getOrDefault(subsequence, 0) + 1);
            if (seen.get(subsequence) == 2) {
                repeatedSubsequences.add(subsequence);
            }
            i++;
        }

        return repeatedSubsequences;
    }
}
