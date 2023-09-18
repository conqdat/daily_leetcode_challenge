import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {

    public static void moveZeroes(int[] nums) {
        int i = 0;

        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }

        while(i <= nums.length - 1) {
            nums[i] = 0;
            i++;
        }

        System.out.println( Arrays.toString(nums) );
    }


    public static void main(String[] args) {
        int[] arr = { 0,1,0,3,12};

        moveZeroes(arr);
    }
}
