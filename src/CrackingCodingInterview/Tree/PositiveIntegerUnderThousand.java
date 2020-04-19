package CrackingCodingInterview.Tree;

public class PositiveIntegerUnderThousand {

    public static void main(String[] args) {

        for (int a = 0; a < 1000; a++) {
            for (int b = 0; b < 1000; b++) {
                for (int c = 0; c < 1000; c++) {
                    int d = (int) Math.ceil(Math.pow(Math.pow(a, 3) + Math.pow(b, 3) - Math.pow(c, 3), 1/3));
                    if (Math.pow(a, 3) + Math.pow(b, 3) == Math.pow(c, 3) + Math.pow(d, 3))
                        System.out.println(a + " " + b + " " + c + " " + d);
                }
            }
        }
    }
}
