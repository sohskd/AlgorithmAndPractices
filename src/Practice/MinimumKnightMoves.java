package Practice;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class MinimumKnightMoves {

    public static void main(String[] args) {

        int x = 5;
        int y = 5;

        int answer = minKnightMoves(x, y);

        System.out.println("Done");
    }

    public static int minKnightMoves(int x, int y) {

        int currX = 0;
        int currY = 0;
        int moves = 0;

        while (Math.abs(currX - x) > 6 || (Math.abs(currY - y) > 6)) {

            int deltaX = x - currX;
            int deltaY = y - currY;
            int absDx = Math.abs(deltaX);
            int absDy = Math.abs(deltaY);

            if (absDx + absDy == 0) {
                return moves;
            } else if (absDx == 1 && absDy == 1) {
                return moves + 2;
            } else if (absDx + absDy == 1) {
                return moves + 3;
            }
            if (absDx <= absDy) {

                currY += ((deltaY >= 0) ? 1 : -1) * 2;
                currX += ((deltaX >= 0) ? 1 : -1) * 1;
                moves++;

            } else {

                currX += ((deltaX >= 0) ? 1 : -1) * 2;
                currY += ((deltaY >= 0) ? 1 : -1) * 1;
                moves++;
            }
        }

        Map<Tile, Integer> path = new HashMap<>();

        Queue<Tile> openTile = new LinkedList<>();

        openTile.add(new Tile(currX, currY));

        path.put(openTile.peek(), 0);

        while (openTile.size() > 0) {

            Tile t = openTile.poll();

            if (t.x == x && t.y == y)
                return moves + path.get(t);

            int[][] paths = new int[][]{{1, 2}, {-1, 2}, {1, -2}, {-1, -2}, {2, 1}, {2, -1}, {-2, 1}, {-2, -1}};

            for (int[] p : paths) {

                Tile next = new Tile(t.x + p[0], t.y + p[1]);

                if (!path.containsKey(next)) {

                    path.put(next, path.get(t) + 1);
                    openTile.add(next);
                }
            }
        }

        return -1;
    }
}

