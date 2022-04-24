package Practice;

public class ForLoop {

    public static void main(String[] args) {

        // store the result that is the max we have found so far
        int r = 4;

        for (int i = 1, imax = r, test = i; test < r * r; i++, test *= i) {


            System.out.println("Done");
        }
    }
}
