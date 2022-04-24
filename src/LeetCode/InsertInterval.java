package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InsertInterval {

    public static void main(String[] args) {

//        int[][] intervals = new int[][]{{1, 3}, {6, 9}};
//        int[] newInterval = new int[] { 2, 5 };

        int[][] intervals = new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[] newInterval = new int[]{4, 8};


        InsertInterval insertInterval = new InsertInterval();
        List<Interval> intervalList = new ArrayList<>();

        for (int[] i : intervals) {
            intervalList.add(new Interval(i[0], i[1]));
        }

        List<Interval> ans = insertInterval.insert(intervalList, new Interval(newInterval[0], newInterval[1]));

        System.out.println("done");
    }

    public static class Interval {
        int start;
        int end;

        public Interval(int min, int max) {
            start = min;
            end = max;
        }
    }

    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        List<Interval> result = new LinkedList<>();
        int i = 0;
        // add all the intervals ending before newInterval starts
        while (i < intervals.size() && intervals.get(i).end < newInterval.start)
            result.add(intervals.get(i++));
        // merge all overlapping intervals to one considering newInterval
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval = new Interval( // we could mutate newInterval here also
                    Math.min(newInterval.start, intervals.get(i).start),
                    Math.max(newInterval.end, intervals.get(i).end));
            i++;
        }
        result.add(newInterval); // add the union of intervals we got
        // add all the rest
        while (i < intervals.size()) result.add(intervals.get(i++));
        return result;
    }
}
