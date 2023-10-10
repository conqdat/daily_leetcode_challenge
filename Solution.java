import java.util.*;


class Solution {

    public static double findMaxAverage(int[] nums, int k) {
        double result = 0;
        if(nums.length <= k) {
            return findAverage(nums, k);
        }
        for(int i = 0; i < nums.length - k + 1; i ++) {
            double currentAverage = 0; 
            for(int j = 0; j < k; j++) {
                currentAverage += nums[j+i];
            } 
            result = Math.max(currentAverage / k, result);
        }
        return result;
    }

    public static double findAverage(int[] nums, int k ) {
        double result = 0;
        for(int i = 0; i < k; i++) {
            result += nums[i];
        }
        return result / k;
    }
    
    public static void main(String[] args) {
        int[] nums = {  3,3,4,3,0  };
        int k = 3;
        System.out.println( findMaxAverage(nums, k) );
    }
}