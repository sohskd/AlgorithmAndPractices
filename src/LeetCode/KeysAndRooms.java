package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class KeysAndRooms {

    public static void main(String[] args) {

        KeysAndRooms keysAndRooms = new KeysAndRooms();

        List<List<Integer>> rooms = new ArrayList<>();

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(2);

        List<Integer> l3 = new ArrayList<>();
        l3.add(3);

        List<Integer> l4 = new ArrayList<>();

        rooms.add(l1);
        rooms.add(l2);
        rooms.add(l3);
        rooms.add(l4);

        keysAndRooms.canVisitAllRooms(rooms);

//                [[1],[2],[3],[]]
     }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int[] ans = new int[rooms.size()];

        boolean can = dfs(ans, rooms, 0);

        return can;
    }

    boolean dfs(int[] ans, List<List<Integer>> rooms, int roomNumber) {

        ans[roomNumber] = 1;

        if (rooms == null)
            return false;

        boolean yes = true;

        for (int j = 0; j < ans.length; j++) {
            if (ans[j] != 1) {
                yes = false;
                break;
            }
        }

        if (yes)
            return true;

        List<Integer> allKeys = rooms.get(roomNumber);

        for (int i = 0; i < allKeys.size(); i++) {

            if (ans[allKeys.get(i)] != 1) {

                dfs(ans, rooms, allKeys.get(i));
            }
        }

        return false;
    }
}
