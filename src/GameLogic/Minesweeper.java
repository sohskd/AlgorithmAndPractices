package GameLogic;

import java.util.Random;

public class Minesweeper {

    public static void main(String[] args) {

        int[] grid = new int[100];
        int width = 10;
        Random randomNumber = new Random();

        for (int k = 0; k < grid.length; k++) {
            int num = randomNumber.nextInt(100);
            if (num < 5) grid[k] = 9;
        }

        grid[98] = 9;

        for (int i = 0; i < grid.length; i++) {

            int total = 0;

            boolean isLeftEdge = (i % width == 0);
            boolean isRightEdge = (i % width == width - 1);
            boolean isTopEdge = i < 10;
            boolean isBottomEdge = i > 89;

            // north
            if (!isTopEdge && grid[i - width] == 9)
                total++;

            // north-east
            if (!isTopEdge && !isRightEdge && grid[i + 1 - width] == 9)
                total++;

            // east
            if (!isRightEdge && grid[i + 1] == 9)
                total++;

            // south-east
            if (!isBottomEdge && !isRightEdge && grid[i + 1 + width] == 9)
                total++;

            // south
            if (!isBottomEdge && grid[i + width] == 9)
                total++;

            // south-west
            if (!isBottomEdge && !isLeftEdge && grid[i - 1 + width] == 9)
                total++;

            // west
            if (!isLeftEdge && grid[i - 1] == 9)
                total++;

            // north-west
            if (!isTopEdge && !isLeftEdge && grid[i - 1 - width] == 9)
                total++;

            if (grid[i] != 9)
                grid[i] = total;
        }

        printGrid(grid, 10);
    }

    private static void printGrid(int[] grid, int width) {
        for (int j = 0; j < grid.length; j++) {
            if (j > 0 && j % width == 0)
                System.out.print("\n");
            System.out.print(grid[j]);
        }
    }
}
