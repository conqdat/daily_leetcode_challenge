import java.util.ArrayList;
import java.util.List;

class Solution {

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println( maxSubArray(nums) );
    }
}