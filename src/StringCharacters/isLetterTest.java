package StringCharacters;

import static java.lang.Character.getType;

public class isLetterTest {

    public static void main(String[] args) {
        int i = 14;
        String b = Integer.toBinaryString(i);
        System.out.println(b);
        int c = i >> 1;
        String converted = Integer.toBinaryString(c);
        System.out.println(converted);
        System.out.println(isLetter('ä'));

        int k = 1 << Character.OTHER_LETTER >> getType('A') & 1;


        System.out.println();
        System.out.println(k != 0);

        System.out.println("is letter");
        System.out.println(isLetter('z'));

        System.out.println(k);

        System.out.println((1 << Character.UPPERCASE_LETTER));
        System.out.println((1 << Character.LOWERCASE_LETTER));
        System.out.println((1 << Character.TITLECASE_LETTER));
        System.out.println((1 << Character.MODIFIER_LETTER));
        System.out.println((1 << Character.OTHER_LETTER));
        System.out.println((((1 << Character.UPPERCASE_LETTER) | (1 << Character.LOWERCASE_LETTER) | (1 << Character.TITLECASE_LETTER) | (1 << Character.MODIFIER_LETTER) | (1 << Character.OTHER_LETTER))));
        System.out.println(getType(65));
        System.out.println(getType(66));
        System.out.println(getType(67));
        System.out.println(getType(122));
        System.out.println(getType(123));


        System.out.println(getType(20));
    }

    public static boolean isLetter(int codePoint) {
        return ((((1 << Character.UPPERCASE_LETTER) | (1 << Character.LOWERCASE_LETTER) | (1 << Character.TITLECASE_LETTER) | (1 << Character.MODIFIER_LETTER) | (1 << Character.OTHER_LETTER)) >> getType(codePoint)) & 1) != 0;
    }
}
