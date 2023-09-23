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


    public static int[] sortArrayByParity(int[] nums) {
        int[] tempArr = new int[nums.length];
        int j = 0;

        for(int i = 0; i < nums.length; i ++) {
            if(nums[i] % 2 == 0) {
                tempArr[j] = nums[i];
                j++; 
            } 
        }
        for(int i = 0; i < nums.length; i ++) {
            if(nums[i] % 2 != 0) {
                tempArr[j] = nums[i];
                j++;
            } 
        }

        return nums;
    }

    public static boolean isPalindrome(int x) {
        String xString = x+"";
        int left = 0;
        int right = xString.length() - 1;
        System.out.println(right);
        while(left < right) {
            if(xString.charAt(left) != xString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        int x = 11;
        System.out.println( isPalindrome(x) );
    }
}
