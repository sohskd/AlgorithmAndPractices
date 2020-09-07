package Practice;

import java.util.Arrays;

public class TwoCityScheduling {

    public static void main(String[] args) {
        int[][] c = new int[][]{{10, 20}, {30, 200}, {400, 50}, {30, 20}};
        twoCitySchedCost(c);
    }

    public static int twoCitySchedCost(int[][] costs) {
        int[] a = new int[costs.length];
        int[] b = new int[costs.length];

        for (int i = 0; i < costs.length; i++) {
            a[i] = costs[i][0];
            b[i] = costs[i][1];
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int cost = 0;
        for (int j = 0; j < costs.length / 2; j++) {
            cost += a[j] + b[j];
        }

        return cost;
    }
}
