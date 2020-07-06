package Practice;

public class StringFormat {

    public static void main(String[] args) {

        String s = "A01";

        System.out.println(String.format("%02d", 1));
        System.out.println(String.format("%.2f", 1.223));
        System.out.println(String.format("|%s|", "Hello World"));
    }
}
