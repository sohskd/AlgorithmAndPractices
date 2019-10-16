package LeetCode;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String s = "abbaca";

        removeDuplicates(s);
    }

    public static String removeDuplicates(String S) {

        int i = 0;
        int j = 1;

        while(j < S.length()) {

            if (S.charAt(i) == S.charAt(j)) {

                StringBuilder stringbuilder = new StringBuilder();
                stringbuilder.append(S.charAt(i));
                stringbuilder.append(S.charAt(i));

                String strToReplace = stringbuilder.toString();
                S = S.replaceFirst(strToReplace, "");

                i = 0;
                j = 1;
                continue;
            }

            i += 1;
            j += 1;
        }

        return S;
    }
}
