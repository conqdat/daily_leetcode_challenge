import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static int[][] merge(int[][] intervals) {
        public static int[][] merge(int[][] intervals) {
            if (intervals == null || intervals.length == 0) {
                return new int[0][];
            }
    
            // Sort intervals by the start value
            Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    
            List<int[]> merged = new ArrayList<>();
            int[] currentInterval = intervals[0];
    
            for (int i = 1; i < intervals.length; i++) {
                int[] interval = intervals[i];
                if (currentInterval[1] >= interval[0]) {
                    // Merge overlapping intervals
                    currentInterval[1] = Math.max(currentInterval[1], interval[1]);
                } else {
                    // Add the current merged interval to the result and start a new one
                    merged.add(currentInterval);
                    currentInterval = interval;
                }
            }
    
            // Add the last merged interval
            merged.add(currentInterval);
    
            // Convert the List to an array
            return merged.toArray(new int[merged.size()][]);
        }
    }

    
    public static void main(String[] args) {
        int[][] intervals = {
                { 1, 3 },
                { 8, 10 },
                { 2, 6 },
                { 15, 18 }
        };


        System.out.println(merge(intervals));
    }
}
