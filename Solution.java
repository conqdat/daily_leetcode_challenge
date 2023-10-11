import java.util.*;


class Solution {

    public static double findMaxAverage(int[] nums, int k) {
        double result = -10000;
        for(int i = 0; i < nums.length - k + 1; i ++) {
            double currentSum = 0;
            for(int j = 0; j < k; j++) {
                currentSum += nums[i+j];
            }
            result = Math.max(currentSum / k, result);
        }

        return result;
    }
    
    public static void main(String[] args) {
        int[] nums = {  1,12,-5,-6,50,3  };
        int k = 4;

        System.out.println( findMaxAverage(nums, k) );

    }
}