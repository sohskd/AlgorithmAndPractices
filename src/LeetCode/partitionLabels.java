package LeetCode;

import java.util.*;

public class partitionLabels {

    public static void main(String[] args) {

//        String s = "ababcbacadefegdehijhklij";

//        String s = "caedbdedda";

//        String s = "qiejxqfnqceocmy";

        String s = "aebbedaddc";

        partitionLabels(s);
    }

    public static List<Integer> partitionLabels(String S) {
        if (S == null || S.length() == 0) {
            return null;
        }
        List<Integer> list = new ArrayList<>();
        int[] map = new int[26];  // record the last index of the each char

        for (int i = 0; i < S.length(); i++) {
            map[S.charAt(i) - 'a'] = i;
        }
        // record the end index of the current sub string
        int last = 0;
        int start = 0;
        for (int i = 0; i < S.length(); i++) {
            last = Math.max(last, map[S.charAt(i) - 'a']);
            if (last == i) {
                list.add(last - start + 1);
                start = last + 1;
            }
        }
        return list;
    }

//    public static List<Integer> partitionLabels(String S) {
//        Map<Character, Integer> m = new HashMap<>();
//        Map<Character, Set<Character>> list = new HashMap<>();
//
//        Set<Character> beforeYou = new HashSet<>();
//
//        List<Character> sorted = new ArrayList<>();
//
//        for (int i = 0; i < S.length(); i++) {
//            char c = S.charAt(i);
//            m.put(c, i);
//            beforeYou.add(c);
//            list.put(c, new HashSet<>(beforeYou));
//            if (sorted.contains(c)) {
//                sorted.remove(new Character(c));
//                sorted.add(c);
//            } else {
//                sorted.add(c);
//            }
//        }
//
//        Set<Character> used = new HashSet<>();
//
//        List<Integer> ans = new ArrayList<>();
//
//        int last = -1;
//
//        for (Character k : sorted) {
//            Set<Character> characterList = list.get(k);
//            // Get max
//            int max = Integer.MIN_VALUE;
//            int count = 0;
//            Character maxChar = null;
//
//            for (Character myChar : characterList) {
//
//                if (used.contains(myChar))
//                    continue;
//
//                used.add(myChar);
//
//                count = m.get(myChar);
//                if (count > max) {
//                    max = count;
//                    maxChar = myChar;
//                }
//            }
//
//
//            if (maxChar != null && max >= last) {
//                int numElem;
//                if (max == last) {
//                    numElem = 1;
//                } else {
//                    numElem = max - last;
//                }
//                last = max;
//                ans.add(numElem);
//            }
//        }
//
//        return ans;
//    }
}
