import java.util.*;

class Solution {


    public  static void moveZeroes(int[] nums) {
        if(nums.length == 1 || nums.length == 0) {
            return;
        }

        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        while(index < nums.length) {
            nums[index] = 0;
            index++;
        }

        System.out.println( Arrays.toString( nums ) );
    }


    public static void main(String[] args) {
        int nums[] = { 0,1,0,3,12 };

        moveZeroes(nums);

    }
}
