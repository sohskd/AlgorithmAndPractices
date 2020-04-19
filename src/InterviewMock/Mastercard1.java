package InterviewMock;

import java.util.ArrayList;
import java.util.List;

public class Mastercard1 {

    public static void main(String[] args) {

        List<String> a = new ArrayList<>();
        a.add("zello");
        a.add("hi");

        List<String> b = new ArrayList<>();
        b.add("world");
        b.add("bye");

        commonSubstring(a, b);
    }

    public static void commonSubstring(List<String> a, List<String> b) {
        // Write your code here
        String first = "";
        String second = "";
        for (int i = 0; i < a.size(); i++) {
            first = a.get(i);
            second = b.get(i);

            int[] characterCheck = new int[26];

            int val = 0;
            for (int j = 0; j < first.length(); j++) {
                val = first.charAt(j) - 'a';
                characterCheck[val] = 1;
            }

            int val2 = 0;
            boolean yes = false;
            for (int k = 0; k < second.length(); k++) {
                val2 = second.charAt(k) - 'a';
                if (characterCheck[val2] != 0) {
                    yes = true;
                    System.out.println("YES");
                    break;
                }
            }

            if (!yes) {
                System.out.println("NO");
            }
        }
    }

//    public static void commonSubstring(List<String> a, List<String> b) {
//        // Write your code here
//        String first = "";
//        String second = "";
//        for (int i = 0; i < a.size(); i++) {
//            first = a.get(i);
//            second = b.get(i);
//
//            List<Character> firstChar = new ArrayList<>();
//            for (char ch : first.toCharArray()) {
//                firstChar.add(ch);
//            }
//
//            List<Character> secondChar = new ArrayList<>();
//            for (char ch : second.toCharArray()) {
//                secondChar.add(ch);
//            }
//
//            firstChar.retainAll(secondChar);
//
//            if (firstChar.size() != 0) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }
//        }
//    }
}
