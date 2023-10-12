import java.util.*;

class Solution {
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        Set<Integer> seen = new HashSet<>();
        for (int count : map.values()) {
            if (!seen.add(count)) {
                return false; // If a count is not unique, return false.
            }
        }
        return true; // All counts are unique.
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1, 1, 3 };

        System.out.println(uniqueOccurrences(arr));
    }
}