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


    public static void main(String[] args) {
        int nums[] = { 1,2,3,4 };
        int k = 5;


        System.out.println( maxOperations(nums, k) );
    }
}
