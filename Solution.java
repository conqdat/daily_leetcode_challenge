import java.util.Arrays;

class Solution {

    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;  // Smallest value seen so far.
        int second = Integer.MAX_VALUE; // Second smallest value seen so far.

        for (int num : nums) {
            if (num <= first) {
                first = num; // Update the smallest value.
            } else if (num <= second) {
                second = num; // Update the second smallest value.
            } else {
                return true; // Found an increasing triplet.
            }
        }

        return false; // No increasing triplet found.
    }

    public static void main(String[] args) {
        int[] nums = { 20,100,10,12,5,13 };
        // int[] nums = { 20, 100, 10, 12, 5, 13 };

        System.out.println(increasingTriplet(nums));

    }
}