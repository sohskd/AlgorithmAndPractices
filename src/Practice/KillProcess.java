package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Given n processes, each process has a unique PID (process id) and its PPID (parent process id).

Each process only has one parent process, but may have one or more children processes. This is just like a tree structure. Only one process has PPID that is 0, which means this process has no parent process. All the PIDs will be distinct positive integers.

We use two list of integers to represent a list of processes, where the first list contains PID for each process and the second list contains the corresponding PPID.

Now given the two lists, and a PID representing a process you want to kill, return a list of PIDs of processes that will be killed in the end. You should assume that when a process is killed, all its children processes will be killed. No order is required for the final answer.

Example:

Input:

pid =  [1, 3, 10, 5]
ppid = [3, 0, 5, 3]

kill = 5
Output: [5, 10]

kill = 3
Output: [3, 1, 5, 10]

Explanation:

           3
         /   \
        1     5
             /
            10
Kill 5 will also kill 10.


Note:
1. The given kill id is guaranteed to be one of the given PIDs.
2. n >= 1.

*/

public class KillProcess {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        List<Integer> pid = new ArrayList();
        pid.add(1);
        pid.add(3);
        pid.add(10);
        pid.add(5);
        pid.add(7);

        List<Integer> ppid = new ArrayList();
        ppid.add(3);
        ppid.add(0);
        ppid.add(5);
        ppid.add(3);
        ppid.add(10);

        System.out.println(killProcess(pid, ppid, 5).toString());
    }

    public static List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        HashMap<Integer, List<Integer>> parentChildHashMap = new HashMap<>();
        List<Integer> returnKillList = new ArrayList<>();

        for (int i = 0; i < ppid.size(); i++) {
            int p = ppid.get(i);
            List<Integer> myList = parentChildHashMap.getOrDefault(p, new ArrayList<>());
            myList.add(pid.get(i));
            parentChildHashMap.put(p, myList);
        }

        List<Integer> childList = parentChildHashMap.get(kill);
        returnKillList.add(kill);

        returnKillList = getChild(childList, returnKillList, parentChildHashMap);
        return returnKillList;
    }

    private static List<Integer> getChild(List<Integer> childList, List<Integer> returnKillList, HashMap<Integer, List<Integer>> parentChildHashMap) {

        for (int j = 0; j < childList.size(); j++) {
            returnKillList.add(childList.get(j));
            List<Integer> myList = parentChildHashMap.getOrDefault(childList.get(j), null);
            if (myList != null) {
                returnKillList = getChild(myList, returnKillList, parentChildHashMap);
            }
        }

        return returnKillList;
    }
}
