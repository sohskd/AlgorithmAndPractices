package Practice;

import java.util.Stack;

public class ReverseParenthesis {

    public static void main(String[] args) {
        String s = "(ed(et(oc))el)";
        String ans = reverseParentheses(s);

        System.out.println(ans);
    }

    public static String reverseParentheses(String S) {

        StringBuilder res = new StringBuilder(S);

        int s = -1, e = -1;

        for (int i = 0; i < res.length(); i++) {

            if (res.charAt(i) == '(')
                s = i;

            if (res.charAt(i) == ')') {
                e = i;
                break;
            }
        }

        if (s == -1)
            return res.toString();

        StringBuilder temp = new StringBuilder(res.substring(s + 1, e)).reverse();

        res = new StringBuilder(res.substring(0, s) + temp + res.substring(e + 1));

        return reverseParentheses(res.toString());
    }

//    public static String reverseParentheses(String s) {
//
//        int n = s.length();
//
//        Stack<Integer> opened = new Stack<>();
//
//        int[] pair = new int[n];
//
//        for (int i = 0; i < n; ++i) {
//
//            if (s.charAt(i) == '(')
//                opened.push(i);
//
//            if (s.charAt(i) == ')') {
//                int j = opened.pop();
//                pair[i] = j;
//                pair[j] = i;
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0, d = 1; i < n; i += d) {
//
//            if (s.charAt(i) == '(' || s.charAt(i) == ')') {
//
//                i = pair[i];
//                d = -d;
//            } else {
//
//                sb.append(s.charAt(i));
//            }
//        }
//
//        return sb.toString();
//    }
}
