import java.util.Arrays;

class Solution {

    public static int maxOperations(int[] nums, int k) {
        int count = 0;
        int left = 0;
        int right = nums.length - 1;

        Arrays.sort(nums);

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                count++;
                left++;
                right--;
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

    public static double findMaxAverage(int[] nums, int k) {
        double result = 0.0;
    
        // Calculate the sum of the first window of size k
        for (int i = 0; i < k; i++) {
            result += nums[i] / (double) k;
        }
    
        // Initialize result with the average of the first window
        double currentWindowValue = result;
    
        // Slide the window through the rest of the array
        for (int i = k; i < nums.length; i++) {
            // Update the currentWindowValue by subtracting the first element of the previous window
            // and adding the current element to the window sum
            currentWindowValue = (currentWindowValue * k - nums[i - k] + nums[i]) / k;
    
            // Update the result if the currentWindowValue is greater
            result = Math.max(currentWindowValue, result);
        }
    
        return result;
    }
    


    
    public static void main(String[] args) {
        int nums[] = { 1,12,-5,-6,50,3 };
        int k = 4;


        System.out.println( findMaxAverage(nums, k) );
    }
}
