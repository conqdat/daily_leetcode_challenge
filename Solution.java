import java.util.*;

class Solution {


    public static int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            else if(stack.size() != 0) {
                stack.pop();
            } else {
                count ++;
            }
        }
        return Math.max(stack.size(), count);
    }

    public static int maxProductDifference(int[] nums) {
        int result = 0;

        Arrays.sort(nums);

        System.out.println( Arrays.toString(nums) );

        result = (nums[nums.length - 1] * nums[nums.length - 2]) - (nums[0] * nums[1]);
        return result;
    }

    public static void main(String[] args) {

        int[] nums = { 4,2,5,9,7,4,8 };

        System.out.println( maxProductDifference(nums) );

    }
}
