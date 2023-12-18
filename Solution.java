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
        int maxOne = Integer.MIN_VALUE, maxTwo = Integer.MIN_VALUE;
        int minOne = Integer.MAX_VALUE, minTwo = Integer.MAX_VALUE;
    
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > maxOne) {
                maxTwo = maxOne;
                maxOne = nums[i];
            } else if (nums[i] > maxTwo) {
                maxTwo = nums[i];
            }
    
            if (nums[i] < minOne) {
                minTwo = minOne;
                minOne = nums[i];
            } else if (nums[i] < minTwo) {
                minTwo = nums[i];
            }
        }
    
        return (maxOne * maxTwo) - (minOne * minTwo);
    }

    public static void main(String[] args) {

        int[] nums = { 4,2,5,9,7,4,8 };

        System.out.println( maxProductDifference(nums) );

    }
}
