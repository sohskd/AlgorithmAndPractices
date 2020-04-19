package CrackingCodingInterview.ArraysAndString;

public class CheckUniqueCharacters {

    public static void main(String[] args) {
        String s = "abcad";

        System.out.println(isUnique(s));
    }

    private static boolean isUnique(String s) {

        if (s.length() > 128)
            return false;

        boolean[] alphabet = new boolean[128];

        int charInt = 0;

        for (int i = 0; i < s.length(); i++) {
            charInt = s.charAt(i) - 97;
            if (!alphabet[charInt])
                alphabet[charInt] = true;
            else
                return false;
        }

        return true;
    }
}
