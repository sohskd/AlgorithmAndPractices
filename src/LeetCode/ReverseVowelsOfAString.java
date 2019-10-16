package LeetCode;

import java.util.HashSet;

public class ReverseVowelsOfAString {

    public static void main(String[] args) {

//        String s = "hello";
        String s = "leetcode";

        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {

        HashSet<Character> hashSet = new HashSet<>();
        hashSet.add('A');
        hashSet.add('a');
        hashSet.add('E');
        hashSet.add('e');
        hashSet.add('I');
        hashSet.add('i');
        hashSet.add('O');
        hashSet.add('o');
        hashSet.add('U');
        hashSet.add('u');

        int i = 0;
        int j = s.length() - 1;

        char[] characters = s.toCharArray();

        while (i < j) {

            // Search for a vowel with i pointer
            while (i < j && !hashSet.contains(characters[i])) {
                i++;
            }

            // Search for a vowel with j pointer
            while (i < j && !hashSet.contains(characters[j])) {
                j--;
            }

            char temp = characters[i];
            characters[i++] = characters[j];
            characters[j--] = temp;
        }

        return new String(characters);
    }
}
