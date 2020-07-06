package EffectiveJava;

public class Item11 {

    public static void main(String[] args) {

        System.out.println(hashCodeFunc());
    }

    // Typical hashCode method
    public static int hashCodeFunc() {
        int result = Integer.hashCode(1);
        result = 31 * result + Short.hashCode((short) 2);
        result = 31 * result + Short.hashCode((short) 3);
        return result;
    }
}
