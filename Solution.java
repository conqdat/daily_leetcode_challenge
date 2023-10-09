import java.util.*;

class Solution {

    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        int left = 0;
        int right = nums.length - 1;

        if (nums.length == 0)
            return result;

        // Binary search to find the first occurrence of target
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result[0] = mid;
                right = mid - 1; // Continue searching on the left side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Reset left and right pointers
        left = 0;
        right = nums.length - 1;

        // Binary search to find the last occurrence of target
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                result[1] = mid;
                left = mid + 1; // Continue searching on the right side
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = { 5,7,7,8,8,10 };
        int target = 8;
        System.out.println( searchRange(nums, target) );
    }
}