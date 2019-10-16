package Practice;

import java.util.*;

public class ReverseString {

    public static void main(String[] args) {
        String[] A = new String[]{"bella", "label", "roller"};

        ReverseString reverseString = new ReverseString();
        reverseString.commonChars(A);
    }

    public List<String> commonChars(String[] A) {

        String res = A[0];

        for (String str : A) {

            res = common(res, str);
        }

        List<String> list = new ArrayList<>();

        for (int i = 0; i < res.length(); i++) {

            list.add(String.valueOf(res.charAt(i)));
        }
        return list;
    }

    public String common(String str1, String str2) {

        int[] count = new int[26];

        for (int i = 0; i < str1.length(); i++) {

            int asc = (str1.charAt(i) - 'a');
            count[asc]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str2.length(); i++) {

            if (count[(int) (str2.charAt(i) - 'a')] > 0) {

                count[(int) (str2.charAt(i) - 'a')]--;

                sb.append(str2.charAt(i));
            }
        }

        return sb.toString();
    }
}
