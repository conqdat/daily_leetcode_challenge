class Solution {
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10; // Add the last digit to the sum
            n /= 10;      // Remove the last digit
        }
        return sum;
    }
    public int maxSum(int[] nums) {
        int result = -1;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length - 1; j++) {
                if(sumOfDigits(nums[i]) == sumOfDigits(nums[j])) {
                    result = Math.max(result, nums[j] + nums[i]);
                }
            }
        }
        return result;
    }
}