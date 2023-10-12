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

    public static int longestConsecutive(int[] nums) {
        int result = 0;
        int count = 1;
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i++) {
            int j = i + 1;
            if(nums[j] - nums[i] == 1) {
                count += 1;
            } else {
                result = Math.max(count, result);
                count = 1;
            }
        }
        result = Math.max(count, result);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 9,1,4,7,3,-1,0,5,8,-1,6 };

        System.out.println(longestConsecutive(arr));
    }
}