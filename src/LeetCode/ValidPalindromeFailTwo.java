package LeetCode;

public class ValidPalindromeFailTwo {

    public static void main(String[] args) {

//        String s = "abcb";

        String s = "abaccwabas";
//        int num = 1;
//
//        System.out.println(validPalindrome(s, 2));

//        String  s = "abc";

//        String  s = "cbbcc";

        ValidPalindromeFailTwo validPalindromeFailTwo = new ValidPalindromeFailTwo();

        System.out.println(validPalindromeFailTwo.isValidPalindrome(s, 2));

    }

    Integer[][] memo;

    public boolean isValidPalindrome(String s, int k) {
        // Initialize memory array
        memo = new Integer[s.length()][s.length()];
        return helper(s, 0, s.length() - 1) <= k;
    }

    public int helper(String s, int start, int end) {
        // If the length of the interval is less than or equal to 1, it means that it is already a palindrome, no operation is required
        if (end <= start) return 0;
        // If there is a solution for this interval in the memory array, return directly
        if (memo[start][end] != null)
            return memo[start][end];
        int res; // return result
        // If the current two characters are the same
        if (s.charAt(start) == s.charAt(end)) {
            res = helper(s, start + 1, end - 1);
        } else { // If the current two characters are different
            res = 1 + Math.min(helper(s, start + 1, end),
                    helper(s, start, end - 1));
        }
        // Save the calculation result to the memory array
        memo[start][end] = res;
        return res;
    }


//    public static boolean validPalindrome(String s, int num) {
//
//        int i = 0;
//        int j = s.length() - 1;
//
//        if (num < 0) return false;
//
//        while (i < j) {
//
//            if (s.charAt(i) != s.charAt(j)) {
//
//                return validPalindrome(s.substring(i + 1, s.length()), num-1) || validPalindrome(s.substring(i), s.length()-1);
//            } else {
//                i++;
//                j--;
//            }
//        }
//
//        return true;
//    }

//    public static boolean validPalindrome(String s, int num) {
//
//        int i = 0;
//        int j = s.length() - 1;
//
//        if (num < 0) return false;
//
//        while (i < j) {
//
//            if (s.charAt(i) != s.charAt(j)) {
//
//                return validPalindrome(s.substring(i + 1, s.length()), num-1)
//                        || validPalindrome(s.substring(i, s.length()-1), num - 1);
//            } else {
//                i++;
//                j--;
//            }
//        }
//
//        return true;
//    }
}



/*

 // Class name must be "Main"
// Libraries included:
// json simple, guava, apache commons lang3, junit, jmock

// "aba" --true
// "abswd" --false


// delete two character from the input string, and check left string is //Palindrome or not
// "abacc" --> "aba" -- true
// "absods" --> false
// "ccaba" -- "caba" or "ccab"

// "ccaba" -- "caba" -- "aba"

// "cccaba" -left- "ccaba" -left- "caba"  false
                           //-right- "ccab" false
     // returne false

// "cccaba" -- "cccab" -- "ccca"
     // return false

// "cabd" - left - "abd" false

// "ccabdc" -left - "ccabd" false
//.         -right - "cccab" false


class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        // String s = "aba";
        String s = "abc";
        int num = 2;

        System.out.println(validPalindrome(s, 1));
    }

    public static boolean validPalindrome(String s, int num) {

        int i = 0;
        int j = s.length() - 1;

        if (num < 0) return false;

        while (i < j) {

            if (s.charAt(i) != s.charAt(j)) {

                return validPalindrome(s.substring(i + 1, s.length()), num-1 s.length()) || validPalindrome(s.substring(i), s.length()-1);
            } else {
                i++;
                j--;
            }
        }

        return ture;
    }
}

 */
