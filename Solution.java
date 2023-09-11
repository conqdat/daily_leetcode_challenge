import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public static int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }
        int[] sortedArray = sortIntArray(nums);

        System.out.println( Arrays.toString(sortedArray) );
        return sortedArray;
    }
    private static int[] sortIntArray(int[] nums) {
        int[] sortedArray = nums.clone();
        Arrays.sort(sortedArray);
        return sortedArray;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{ -7,-3,2,3,11 };
        System.out.println( sortedSquares(nums) );
    }
}