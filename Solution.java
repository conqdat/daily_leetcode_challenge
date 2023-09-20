import java.util.Arrays;

class Solution {

    public static void moveZeroes(int[] nums) {
        // base case 
        int n = nums.length;
        if (n < 2) return;

        // define pointers
        int L = 0, R = 1;

        // Move zero to the back
        while(R < n) {
            if(nums[L] != 0) {
                L++;
                R++;
            } else if(nums[R] == 0) {
                R++;
            } else {
                int temp = nums[L];
                nums[L] = nums[R];
                nums[R] = temp;
            }
        }

        System.out.println( Arrays.toString(nums) );
    }


    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int L = 0;
        int R = 1;
        
        while(R < n) {
            if(nums[L] == nums[R]) {
                R++;
            } else if(nums[L] != nums[R]) {
                nums[++L] = nums[R];
            }
        }

        return L + 1;
    }

    public static void main(String[] args) {
        int[] arr = { 0,0,1,1,1,2,2,3,3,4 };

        System.out.println( removeDuplicates(arr) );
    }
}
